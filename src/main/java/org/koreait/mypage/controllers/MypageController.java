package org.koreait.mypage.controllers;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.koreait.global.annotations.ApplyErrorPage;
import org.koreait.global.libs.Utils;
import org.koreait.global.paging.CommonSearch;
import org.koreait.global.paging.ListData;
import org.koreait.member.MemberInfo;
import org.koreait.member.entities.Member;
import org.koreait.member.libs.MemberUtil;
import org.koreait.member.services.MemberInfoService;
import org.koreait.member.services.MemberUpdateService;
import org.koreait.mypage.validators.ProfileValidator;
import org.koreait.pokemon.controllers.PokemonSearch;
import org.koreait.pokemon.entities.Pokemon;
import org.koreait.pokemon.services.PokemonInfoService;
import org.koreait.wishlist.constants.WishType;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Controller
@ApplyErrorPage
@RequestMapping("/mypage")
@RequiredArgsConstructor
@SessionAttributes("profile")  // 세션에 'profile' 속성 저장
public class MypageController {

    // 필요한 서비스 및 유틸리티 주입
    private final Utils utils;
    private final MemberUtil memberUtil;
    private final ModelMapper modelMapper;
    private final MemberUpdateService updateService;
    private final ProfileValidator profileValidator;
    private final MemberInfoService infoService;
    private final PokemonInfoService pokemonInfoService;

    // 로그인된 회원 정보 반환 (세션을 통한 공유)
    @ModelAttribute("profile")
    public Member getMember() {
        return memberUtil.getMember(); // 로그인된 회원의 정보를 세션에 담음
    }

    // 마이페이지 메인 화면
    @GetMapping
    public String index(Model model) {
        // 공통 처리 메소드 호출 (페이지에 필요한 기본 정보 설정)
        commonProcess("main", model);

        // 로그인된 회원 정보 가져오기
        Member member = memberUtil.getMember();

        // 'nickName'을 모델에 추가 (null이 아닌 값을 가져오기 위해)
        model.addAttribute("nickName", member.getNickName());  // nickName을 모델에 추가

        // 마이페이지 메인 화면으로 이동
        return utils.tpl("mypage/index");
    }



    // 프로필 화면
    @GetMapping("/profile")
    public String profile(Model model) {
        // 공통 처리 메소드 호출 (페이지에 필요한 기본 정보 설정)
        commonProcess("profile", model);

        Member member = memberUtil.getMember();  // 로그인한 회원 정보 가져오기
        RequestProfile form = modelMapper.map(member, RequestProfile.class);  // Member를 RequestProfile DTO로 변환

        // 선택 약관 처리 (옵션이 있을 경우)
        String optionalTerms = member.getOptionalTerms();
        if (StringUtils.hasText(optionalTerms)) {
            form.setOptionalTerms(Arrays.stream(optionalTerms.split("\\|\\|")).toList());  // 선택 약관 파싱
        }

        // 모델에 폼 데이터 추가
        model.addAttribute("requestProfile", form);

        // 추가: 닉네임을 명시적으로 모델에 추가 (선택적)
        model.addAttribute("nickName", member.getNickName());  // 닉네임을 모델에 추가

        return utils.tpl("mypage/profile");  // 프로필 템플릿으로 반환
    }

    // 프로필 수정 처리 (PATCH 요청)
    @PatchMapping("/profile")
    public String updateProfile(@Valid RequestProfile form, Errors errors, Model model) {
        // 공통 처리 메소드 호출 (페이지에 필요한 기본 정보 설정)
        commonProcess("profile", model);

        // 프로필 데이터 검증
        profileValidator.validate(form, errors);

        // 오류가 있을 경우, 수정 페이지로 돌아감
        if (errors.hasErrors()) {
            return utils.tpl("mypage/profile");
        }

        // 회원 정보 수정 처리
        updateService.process(form);

        // 수정된 프로필 데이터 반영
        model.addAttribute("profile", memberUtil.getMember());

        // 마이페이지 메인으로 리다이렉트
        return "redirect:/mypage";
    }

    // 회원 정보 새로고침 (세션 갱신)
    @ResponseBody
    @GetMapping("/refresh")
    public void refresh(Principal principal, Model model, HttpSession session) {
        // 현재 로그인한 사용자 정보를 다시 불러오기
        MemberInfo memberInfo = (MemberInfo) infoService.loadUserByUsername(principal.getName());
        // 세션에 최신 정보 저장
        session.setAttribute("member", memberInfo.getMember());

        // 모델에 프로필 데이터 반영
        model.addAttribute("profile", memberInfo.getMember());
    }

    /**
     * 프로필 수정 페이지로 이동
     * 프로필 수정 전 화면을 띄워 사용자 정보를 편집할 수 있게 함
     */
    @GetMapping("/profile/edit")
    public String getEditableProfile(Model model) {
        // 로그인된 회원 정보 가져오기
        Member member = memberUtil.getMember();
        // RequestProfile DTO로 회원 정보 초기화
        RequestProfile form = modelMapper.map(member, RequestProfile.class);

        // 수정 가능한 프로필 데이터 모델에 추가
        model.addAttribute("editableProfile", form);

        // 수정 가능한 프로필 페이지로 이동
        return utils.tpl("mypage/profile_edit");
    }

    // 프로필 수정 처리 (POST 요청)
    @PostMapping("/profile/edit")
    public String updateEditableProfile(@Valid @ModelAttribute("editableProfile") RequestProfile form, Errors errors, Model model) {
        // 에러가 있을 경우 수정 페이지로 돌아감
        if (errors.hasErrors()) {
            return utils.tpl("mypage/profile_edit");
        }

        // 수정 프로세스 실행
        updateService.process(form);

        // 최신 프로필 데이터 반영
        model.addAttribute("profile", memberUtil.getMember());

        // 수정 후 프로필 페이지로 리다이렉트
        return "redirect:/mypage/profile";
    }

    /**
     * 찜하기 목록
     *
     * @param mode : POKEMON : 포켓몬 찜하기 목록, BOARD : 게시글 찜하기 목록
     * @return
     */
    @GetMapping({"/wishlist", "/wishlist/{mode}"})
    public String wishlist(@PathVariable(name = "mode", required = false) WishType mode, CommonSearch search, Model model) {
        // 공통 처리 메소드 호출 (페이지에 필요한 기본 정보 설정)
        commonProcess("wishlist", model);

        mode = Objects.requireNonNullElse(mode, WishType.POKEMON);  // 기본 값은 포켓몬 찜하기
        if (mode == WishType.BOARD) { // 게시글 찜하기 목록
            // 게시글 찜하기 로직
        } else { // 포켓몬 찜하기 목록
            // 포켓몬 찜하기 목록 처리
            PokemonSearch pSearch = modelMapper.map(search, PokemonSearch.class);
            ListData<Pokemon> data = pokemonInfoService.getMyPokemons(pSearch);
            model.addAttribute("items", data.getItems());
            model.addAttribute("pagination", data.getPagination());
        }

        // 찜하기 목록 페이지로 이동
        return utils.tpl("mypage/wishlist");
    }

    /**
     * 컨트롤러 공통 처리 영역
     *
     * @param mode 페이지 종류
     * @param model 모델
     */
    private void commonProcess(String mode, Model model) {
        // 기본 페이지 모드 설정
        mode = StringUtils.hasText(mode) ? mode : "main";
        String pageTitle = utils.getMessage("마이페이지");

        // 공통 스크립트 및 페이지 제목 설정
        List<String> addCommonScript = new ArrayList<>();
        List<String> addScript = new ArrayList<>();

        if (mode.equals("profile")) { // 회원정보 수정
            addCommonScript.add("fileManager");
            addCommonScript.add("address");
            addScript.add("mypage/profile");
            pageTitle = utils.getMessage("회원정보_수정");
        } else if (mode.equals("wishlist")) { // 찜하기 목록
            addCommonScript.add("wish");
            pageTitle = utils.getMessage("나의_WISH");
        }

        // 모델에 공통 정보 추가
        model.addAttribute("addCommonScript", addCommonScript);
        model.addAttribute("addScript", addScript);
        model.addAttribute("pageTitle", pageTitle);
    }
}
