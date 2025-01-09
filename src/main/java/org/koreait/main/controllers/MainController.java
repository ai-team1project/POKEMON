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
        mainList.add(new BaseModel("「Pokémon HOME」 업데이트 알림(Ver.3.2.1)", "게임", "https://data1.pokemonkorea.co.kr/newdata/2023/09/2023-09-13_10-14-29-86954-1694567669.png", "https://pokemonkorea.co.kr/pokemonhome/menu300?number=3245&mode=view"));
        mainList.add(new BaseModel("「Pokémon Sleep」 절찬 배포 중!", "게임", "https://data1.pokemonkorea.co.kr/newdata/2024/01/2024-01-04_15-57-20-84474-1704351440.png", "https://www.pokemonsleep.net/ko/"));
        mainList.add(new BaseModel("포켓몬스터 금은편: 은빛산 이야기 8월 10일 (토) 첫 방송! ", "애니&영화", "https://data1.pokemonkorea.co.kr/newdata/2024/08/2024-08-01_13-56-18-76741-1722488178.png", "https://www.pokemonkorea.co.kr/2024_3rd_project"));
        model.addAttribute("mainList", mainList);

        // NewNews
        List<BaseModel> newNews = new ArrayList<>();

        newNews.add(new BaseModel(" 포켓몬 카드 게임 주변상품 「Snow seasons」발매!", "카드 게임 | 22025년 01월 06일", "https://data1.pokemonkorea.co.kr/newdata/2025/01/2025-01-06_19-48-29-93065-1736160509.png", "https://pokemoncard.co.kr/card/category/info3"));
        newNews.add(new BaseModel(" 스칼렛&바이올렛 하이클래스팩 「테라스탈 페스타 ex」 1월", "카드 게임 | 2025년 01월 06일", "https://data1.pokemonkorea.co.kr/newdata/2025/01/2025-01-06_19-46-08-95780-1736160368.png", "https://pokemoncard.co.kr/card/708"));
        newNews.add(new BaseModel(" 「포켓몬 트레이너스 컵 2025」 개최 결정!", "게임 | 2025년 01월 06일", "https://data1.pokemonkorea.co.kr/newdata/2025/01/2025-01-06_15-12-51-19253-1736143971.png", "https://pokemonkorea.co.kr/ptc2025"));
        newNews.add(new BaseModel(" 최고의 피카츄 카드를 찾아라! 당첨자 발표", "카드 게임 | 2024년 12월 27일", "https://data1.pokemonkorea.co.kr/newdata/2024/12/2024-12-27_19-18-17-92366-1735294697.png", "https://pokemoncard.co.kr/card/707"));

        newNews.add(new BaseModel("2025 코리안리그 시즌2 개최!", "카드 게임 | 2024년 12월 20일", "https://data1.pokemonkorea.co.kr/newdata/2024/12/2024-12-20_15-28-59-94665-1734676139.jpg", "https://pokemonkorea.co.kr/koreanleague_2025/menu541"));
        newNews.add(new BaseModel("주니어 토너먼트 2024 시즌2 시작!", "카드 게임 | 2024년 12월 12일", "https://data1.pokemonkorea.co.kr/newdata/2024/12/2024-12-12_18-56-33-52636-1733997393.png", "https://pokemonkorea.co.kr/junior_tournament_2024/menu536"));
        newNews.add(new BaseModel("스칼렛&바이올렛 랜덤 스타트 덱 Generations 12월 대발매!", "카드 게임 | 2024년 12월 06일", "https://data1.pokemonkorea.co.kr/newdata/2024/12/2024-12-06_19-17-02-93801-1733480222.png", "https://pokemoncard.co.kr/card/692"));
        newNews.add(new BaseModel("스칼렛&바이올렛 스타트 덱 Generations 스페셜 배틀 세", "카드 게임 | 2024년 12월 06일", "https://data1.pokemonkorea.co.kr/newdata/2024/12/2024-12-06_19-16-19-22202-1733480179.png", "https://pokemoncard.co.kr/card/691"));

        newNews.add(new BaseModel("미니리그 에너지 프로모 카드 증정 이벤트", "카드 게임 | 2024년 12월 05일", "https://data1.pokemonkorea.co.kr/newdata/2024/12/2024-12-05_21-50-17-70788-1733403017.png", "https://pokemoncard.co.kr/card/693"));
        newNews.add(new BaseModel("스칼렛&바이올렛 스페셜 점보 카드 세트「피카츄」12월", "카드 게임 | 2024년 12월 05일", "https://data1.pokemonkorea.co.kr/newdata/2024/12/2024-12-05_09-41-38-96410-1733359298.png", "https://pokemoncard.co.kr/card/690"));
        newNews.add(new BaseModel("IPTV VOD 이벤트 ", "애니 & 영화 | 2024년 12월 03일", "https://data1.pokemonkorea.co.kr/newdata/2024/12/2024-12-03_10-31-44-40870-1733189504.png", "https://pokemonkorea.co.kr/news/3/15645"));
        newNews.add(new BaseModel("최고의 피카츄 카드를 찾아라!", "카드 게임 | 2024년 11월 29일", "https://data1.pokemonkorea.co.kr/newdata/2024/11/2024-11-29_18-40-50-13187-1732873250.png", "https://pokemoncard.co.kr/card/689"));



        model.addAttribute("newNews", newNews);

        // MainGame
        List<MainGame> mainGame = new ArrayList<>();
        mainGame.add(new MainGame("https://pokemonkorea.co.kr/img/main/game_object2.png",  "포켓몬 카드 게임 Pocket」 절찬 배포 중!", "https://data1.pokemonkorea.co.kr/newdata/2024/10/2024-10-30_11-52-38-76676-1730256758.png", "https://pokemonkorea.co.kr/pokemon_tcg_pocket"));
        mainGame.add(new MainGame("https://pokemonkorea.co.kr/img/main/game_object2.png",  "「포켓몬스터스칼렛・바이올렛 제로의 비보...", "https://data1.pokemonkorea.co.kr/newdata/2024/01/2024-01-03_10-14-01-31819-1704244441.png", "https://pokemonkorea.co.kr/sv_dlc"));
        mainGame.add(new MainGame("https://pokemonkorea.co.kr/img/main/game_object2.png",  "「돌아온 명탐정 피카츄」 절찬 판매 중!", "https://data1.pokemonkorea.co.kr/newdata/2023/10/2023-10-20_09-34-24-16231-1697762064.png", "https://pokemonkorea.co.kr/detective_pikachu"));
        mainGame.add(new MainGame("https://pokemonkorea.co.kr/img/main/game_object2.png",  "「포켓몬스터스칼렛・바이올렛」 공식 사이트", "https://data1.pokemonkorea.co.kr/newdata/2023/08/2023-08-09_11-22-23-13966-1691547743.png", "https://pokemonkorea.co.kr/sv"));
        mainGame.add(new MainGame("https://pokemonkorea.co.kr/img/main/game_object2.png",  "「Pokémon Sleep」 절찬 배포 중!", "https://data1.pokemonkorea.co.kr/newdata/2023/07/2023-07-19_11-36-13-69331-1689734173.png", "https://www.pokemonsleep.net/ko/"));
        mainGame.add(new MainGame("https://pokemonkorea.co.kr/img/main/game_object2.png",  "「Pokémon Sleep」 절찬 배포 중!", "https://data1.pokemonkorea.co.kr/newdata/2023/07/2023-07-14_12-10-49-57812-1689304249.png", "https://www.pokemongoplusplus.com/ko/"));
        model.addAttribute("mainGame", mainGame);


        List<MainAnimation> mainAnimation = new ArrayList<>();
        mainAnimation.add(new MainAnimation("TV 애니메이션 포켓몬스터」테라스탈 데뷔 절찬 방영 중",  "https://data1.pokemonkorea.co.kr/newdata/2024/11/2024-11-20_15-01-23-30520-1732082483.png", "https://pokemonkorea.co.kr/pokemonLR"));
        mainAnimation.add(new MainAnimation("포켓몬스터 금은편: 은빛산 이야기 8월 10일 (토) 첫 방송! ",  "https://data1.pokemonkorea.co.kr/newdata/2024/08/2024-08-01_13-53-25-35881-1722488005.png", "https://www.pokemonkorea.co.kr/2024_3rd_project"));
        mainAnimation.add(new MainAnimation("「극장판 포켓몬스터 AG: 뮤와 파동의 용사 루카리오」2025년 1월 22일 개봉 예정",  "https://data1.pokemonkorea.co.kr/newdata/2024/12/2024-12-23_18-07-49-53506-1734944869.png", "https://pokemonkorea.co.kr/2025_M8"));

        model.addAttribute("mainAnimation", mainAnimation);


        // MainUnder
        List<BaseModel> mainUnder = new ArrayList<>();
        mainUnder.add(new BaseModel("「 Pokémon UNITE」", "게임", "https://data1.pokemonkorea.co.kr/newdata/2021/08/2021-08-23_13-11-29-34893-1629691889.png", "https://pokemonkorea.co.kr/pokemon-unite"));
        mainUnder.add(new BaseModel("「포켓몬스터소드・실드 익스팬션 패스」", "게임", "https://data1.pokemonkorea.co.kr/newdata/2020/09/2020-09-07_14-00-20-40933-1599454820.png", "https://pokemonkorea.co.kr/sword_shield_expansion"));
        mainUnder.add(new BaseModel("「Pokémon GO」 고객문의", "게임", "https://data1.pokemonkorea.co.kr/newdata/2020/09/2020-09-07_14-00-25-79161-1599454825.png", "https://niantic.helpshift.com/hc/ko/6-pokemon-go/"));
        mainUnder.add(new BaseModel("「Pokémon Café ReMix 」", "게임", "https://data1.pokemonkorea.co.kr/newdata/2022/02/2022-02-10_15-46-40-31190-1644475600.png", "https://pokemonkorea.co.kr/pokemoncaferemix"));
        mainUnder.add(new BaseModel("「포켓몬가오레」", "게임", "https://data1.pokemonkorea.co.kr/newdata/2021/08/2021-08-23_12-20-42-58320-1629688842.jpg", "https://pokemongaole.co.kr/"));
        mainUnder.add(new BaseModel("「Pokémon HOME」", "게임", "https://data1.pokemonkorea.co.kr/newdata/2020/09/2020-09-07_14-00-29-51611-1599454829.png", "https://pokemonkorea.co.kr/pokemonhome"));
        mainUnder.add(new BaseModel("포켓몬 스토어 온라인", "상품", "https://data1.pokemonkorea.co.kr/newdata/2023/10/2023-10-12_03-34-53-91810-1697049293.png", "https://www.pokemonstore.co.kr/"));
        mainUnder.add(new BaseModel("포켓몬 카드 게임 ", "카드 게임", "https://data1.pokemonkorea.co.kr/newdata/2020/09/2020-09-10_18-08-21-62651-1599728901.png", "https://pokemoncard.co.kr/main"));
        model.addAttribute("mainUnder", mainUnder);


        List<MainSwiper> mainSwiper = new ArrayList<>();
        mainSwiper.add(new MainSwiper("https://data1.pokemonkorea.co.kr/newdata/2025/01/2025-01-06_19-43-40-14624-1736160220.png", "https://pokemoncard.co.kr/card/category/info3"));
        mainSwiper.add(new MainSwiper("https://data1.pokemonkorea.co.kr/newdata/2024/12/2024-12-06_19-13-18-73729-1733479998.png", "https://pokemoncard.co.kr/card/692"));
        mainSwiper.add(new MainSwiper("https://data1.pokemonkorea.co.kr/newdata/2024/12/2024-12-06_19-14-36-65306-1733480076.png", "https://pokemoncard.co.kr/card/691"));
        mainSwiper.add(new MainSwiper("https://data1.pokemonkorea.co.kr/newdata/2024/12/2024-12-05_09-38-33-25311-1733359113.png", "https://pokemoncard.co.kr/card/690"));
        mainSwiper.add(new MainSwiper("https://data1.pokemonkorea.co.kr/newdata/2024/11/2024-11-08_18-14-08-35464-1731057248.png", "https://pokemoncard.co.kr/card/675"));

        mainSwiper.add(new MainSwiper("https://data1.pokemonkorea.co.kr/newdata/2024/02/2024-02-27_23-21-45-58643-1709043705.png", "https://pokemonkorea.co.kr/legends_z-a"));
        mainSwiper.add(new MainSwiper("https://data1.pokemonkorea.co.kr/newdata/2025/01/2025-01-06_14-07-35-68483-1736140055.jpeg", "https://pokemonkorea.co.kr/pokemonschool2023"));
        mainSwiper.add(new MainSwiper("https://data1.pokemonkorea.co.kr/newdata/2024/10/2024-10-24_11-32-47-99638-1729737167.png", "https://pokemoncard.co.kr/card/693"));
        mainSwiper.add(new MainSwiper("https://data1.pokemonkorea.co.kr/newdata/2024/12/2024-12-06_09-20-22-72530-1733444422.png", "https://pokemoncard.co.kr/card/693"));
        mainSwiper.add(new MainSwiper("https://data1.pokemonkorea.co.kr/newdata/2024/12/2024-12-12_19-01-22-34114-1733997682.png", "https://pokemonkorea.co.kr/junior_tournament_2024/menu536"));

        mainSwiper.add(new MainSwiper("https://data1.pokemonkorea.co.kr/newdata/2024/12/2024-12-20_15-27-47-59212-1734676067.jpg", "https://pokemonkorea.co.kr/koreanleague_2025/menu541"));
        mainSwiper.add(new MainSwiper("https://data1.pokemonkorea.co.kr/newdata/2025/01/2025-01-06_19-39-17-34265-1736159957.png", "https://pokemoncard.co.kr/card/708"));
        mainSwiper.add(new MainSwiper("https://data1.pokemonkorea.co.kr/newdata/2024/12/2024-12-23_18-06-53-48065-1734944813.png", "https://pokemonkorea.co.kr/2025_M8"));
        mainSwiper.add(new MainSwiper("https://data1.pokemonkorea.co.kr/newdata/2024/11/2024-11-22_13-37-46-57690-1732250266.png", "https://pokemonkorea.events/"));
        mainSwiper.add(new MainSwiper("https://data1.pokemonkorea.co.kr/newdata/2024/11/2024-11-20_15-00-33-11444-1732082433.png", "https://pokemonkorea.co.kr/pokemonLR"));

        mainSwiper.add(new MainSwiper("https://data1.pokemonkorea.co.kr/newdata/2024/10/2024-10-30_11-50-42-86665-1730256642.png", "https://pokemonkorea.co.kr/pokemon_tcg_pocket"));

        model.addAttribute("mainSwiper", mainSwiper);



        // utils.tpl("main/index") 로 템플릿 경로 반환
        return utils.tpl("main/index");
    }
}