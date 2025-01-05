package org.koreait.main.controllers;

import lombok.RequiredArgsConstructor;
import org.koreait.front.common.BaseModel;
import org.koreait.global.libs.Utils;
import org.koreait.main.entitise.MainAnimation;
import org.koreait.main.entitise.MainGame;
import org.koreait.main.entitise.MainProduct;
import org.koreait.main.entitise.MainSwiper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class MainController {

    private final Utils utils;


    @GetMapping("/")
    // 메인 페이지
    public String index(Model model) {
        // MainList
        List<BaseModel> mainList = new ArrayList<>();
        mainList.add(new BaseModel("업데이트 데이터(Ver.3.0.1) 배포 안내", "게임", "https://data1.pokemonkorea.co.kr/newdata/2022/12/2022-12-01_16-22-12-70846-1669879332.png", "https://www.nintendo.co.kr/switch/sv/updateData.html"));
        model.addAttribute("mainList", mainList);

        // NewNews
        List<BaseModel> newNews = new ArrayList<>();
        newNews.add(new BaseModel("2025 코리안리그 시즌2 개최!", "카드 게임 | 2024년 12월 20일", "https://data1.pokemonkorea.co.kr/newdata/2024/12/2024-12-12_18-56-33-52636-1733997393.png", "https://pokemonkorea.co.kr/koreanleague_2025/menu541"));
        model.addAttribute("newNews", newNews);

        // MainGame
        List<MainGame> mainGame = new ArrayList<>();
        mainGame.add(new MainGame("https://pokemonkorea.co.kr/img/main/game_object2.png",  "포켓몬 카드 게임 Pocket」 절찬 배포 중!", "https://data1.pokemonkorea.co.kr/newdata/2024/10/2024-10-30_11-52-38-76676-1730256758.png", "https://pokemonkorea.co.kr/pokemon_tcg_pocket"));
        model.addAttribute("mainGame", mainGame);

        // MainProduct
        List<MainProduct> mainProduct = new ArrayList<>();
        mainProduct.add(new MainProduct("포켓몬 스토어 「팬텀」 키캡",  "https://data1.pokemonkorea.co.kr/newdata/2024/10/2024-10-17_17-24-07-17384-1729153447.png", "https://pokemonstore.co.kr/pages/product/view.html?productNo=123486536&preview=true"));
        model.addAttribute("mainProduct", mainProduct);


        List<MainAnimation> mainAnimation = new ArrayList<>();
        mainAnimation.add(new MainAnimation("TV 애니메이션 포켓몬스터」테라스탈 데뷔 절찬 방영 중",  "https://data1.pokemonkorea.co.kr/newdata/2024/11/2024-11-20_15-01-23-30520-1732082483.png", "https://pokemonkorea.co.kr/pokemonLR"));
        model.addAttribute("mainAnimation", mainAnimation);


        // MainUnder
        List<BaseModel> mainUnder = new ArrayList<>();
        mainUnder.add(new BaseModel("「 Pokémon UNITE」", "게임", "https://data1.pokemonkorea.co.kr/newdata/2021/08/2021-08-23_13-11-29-34893-1629691889.png", "https://pokemonkorea.co.kr/pokemon-unite"));
        model.addAttribute("mainUnder", mainUnder);


        List<MainSwiper> mainSwiper = new ArrayList<>();
        mainSwiper.add(new MainSwiper("https://data1.pokemonkorea.co.kr/newdata/2024/12/2024-12-20_15-27-47-59212-1734676067.jpg", "https://pokemonkorea.co.kr/koreanleague_2025/menu541"));
        model.addAttribute("mainSwiper", mainSwiper);



        // utils.tpl("main/index") 로 템플릿 경로 반환
        return utils.tpl("main/index");
    }
}