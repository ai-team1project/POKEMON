package org.koreait.front.controllers.news;

import org.koreait.front.common.BaseModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NewsController {

    @GetMapping("/news")
    public String card (Model model) {
        List<BaseModel> newsList = new ArrayList<>();

        newsList.add(new BaseModel("포켓몬 카드 게임×환상의 포켓몬 GET 대작전!","카드 게임  |  2024년 11월 22일","https://data1.pokemonkorea.co.kr/newdata/2024/11/2024-11-22_18-30-28-22148-1732267828.png","https://pokemonkorea.co.kr/news/2/15458?cate=0&sword="));
        newsList.add(new BaseModel("스칼렛&바이올렛 확장팩 「초전브레이커」11월 대발매!"," 카드 게임  |  2024년 11월 19일","https://data1.pokemonkorea.co.kr/newdata/2024/11/2024-11-19_11-49-19-86393-1731984559.png","https://pokemoncard.co.kr/card/675"));
        newsList.add(new BaseModel("2025 코리안리그 시즌1 대회 참가 안내"," 카드 게임  |  2024년 11월 01일","https://data1.pokemonkorea.co.kr/newdata/2024/11/2024-11-01_15-15-57-14985-1730441757.jpg","https://pokemonkorea.co.kr/news/2/15030?cate=0&sword="));
        newsList.add(new BaseModel("강화 확장팩 「낙원드래고나」 발매 기념 실드전 개최!"," 카드 게임  |  2024년 10월 25일","https://data1.pokemonkorea.co.kr/newdata/2024/10/2024-10-25_19-26-09-60819-1729851969.png","https://www.pokemonkorea.co.kr/PCG_Sealed_battle_SV7a"));
        newsList.add(new BaseModel("포켓몬 카드 게임 온라인 공식 인증샵 프로모 카드 증정 이벤트!"," 카드 게임  |  2024년 10월 30일","https://data1.pokemonkorea.co.kr/newdata/2024/10/2024-10-25_16-42-59-62431-1729842179.png","https://pokemonkorea.co.kr/news/2/14980?cate=0&sword="));
        newsList.add(new BaseModel("[2025 포켓몬 카드샵 대항전] 대표 선발전 개최!"," 카드 게임  |  2024년 10월 24일","https://data1.pokemonkorea.co.kr/newdata/2024/10/2024-10-24_11-37-23-22313-1729737443.png","https://pokemonkorea.co.kr/2025card_shop_league_a/menu516"));
        newsList.add(new BaseModel("게임도감을 완성하고 색이 다른 「메로엣타」를 손에 넣자!"," 게임  |  2024년 10월 18일","https://data1.pokemonkorea.co.kr/newdata/2024/10/2024-10-18_14-26-14-24714-1729229174.png","https://pokemonkorea.co.kr/2025card_shop_league_a/menu516"));
        newsList.add(new BaseModel("스칼렛&바이올렛 강화 확장팩 「낙원드래고나」10월 대발매!"," 카드 게임  |  2024년 10월 11일","https://data1.pokemonkorea.co.kr/newdata/2024/10/2024-10-11_15-45-00-66235-1728629100.png","https://pokemoncard.co.kr/card/668"));
        newsList.add(new BaseModel("2025 코리안리그 시즌1 in 부산!"," 카드 게임  |  2024년 10월 08일","https://data1.pokemonkorea.co.kr/newdata/2024/10/2024-10-08_19-00-02-79253-1728381602.jpg","https://pokemonkorea.co.kr/koreanleague_2025"));
        newsList.add(new BaseModel("스칼렛&바이올렛 스타터 세트 테라스탈타입:스텔라 「님피아 ex」「파라블레이즈 ex」10월 대발매!"," 카드 게임  |  2024년 09월 30일","https://data1.pokemonkorea.co.kr/newdata/2024/09/2024-09-30_19-22-09-71251-1727691729.png","https://pokemoncard.co.kr/card/665"));
        newsList.add(new BaseModel("「TV 애니메이션 포켓몬스터」테라스탈 데뷔 방영 기념 - 2024 포켓몬 그림 콘테스트 개최!"," 애니 & 영화  |  2024년 09월 20일","https://data1.pokemonkorea.co.kr/newdata/2024/09/2024-09-19_16-14-03-39171-1726730043.jpg","https://pokemonkorea.co.kr/news/3/14871?cate=0&sword="));
        newsList.add(new BaseModel("스칼렛&바이올렛 배틀 강화 BOX 「스텔라미라클」 9월 대발매!"," 카드 게임  |  2024년 09월 02일","https://data1.pokemonkorea.co.kr/newdata/2024/09/2024-09-02_17-47-32-90653-1725266852.png","https://pokemoncard.co.kr/card/661"));
        newsList.add(new BaseModel("확장팩 「스텔라미라클」발매 기념 토너먼트 개최!"," 카드 게임  |  2024년 08월 30일","https://data1.pokemonkorea.co.kr/newdata/2024/08/2024-08-30_15-13-26-28034-1724998406.png","https://pokemonkorea.co.kr/SV7_tournament"));
        newsList.add(new BaseModel("스칼렛&바이올렛 확장팩 「스텔라미라클」9월 대발매!"," 카드 게임  |  2024년 09월 02일","https://data1.pokemonkorea.co.kr/newdata/2024/09/2024-09-02_17-45-42-52566-1725266742.png","https://pokemoncard.co.kr/card/659"));
        newsList.add(new BaseModel("국내 애니 25주년 방영 기념 프로모 카드 증정 이벤트!"," 카드 게임  |  2024년 08월 23일","https://data1.pokemonkorea.co.kr/newdata/2024/08/2024-08-23_14-05-25-96723-1724389525.png","https://pokemoncard.co.kr/card/660"));
        newsList.add(new BaseModel("「트레이너의 포켓몬」이 등장!"," 카드 게임  |  2024년 08월 22일","https://data1.pokemonkorea.co.kr/newdata/2024/08/2024-08-19_13-38-03-58676-1724042283.png","https://pokemonkorea.co.kr/news/2/14782?cate=0&sword="));
        newsList.add(new BaseModel("「포켓몬 월드챔피언십2024」 게임 부문 응원 댓글 이벤트"," 이벤트  |  2024년 08월 17일","https://data1.pokemonkorea.co.kr/newdata/2024/08/2024-08-17_09-14-21-47831-1723853661.png","https://pokemonkorea.co.kr/news/6/14777?cate=0&sword="));
        newsList.add(new BaseModel("Pokémon the Orchestra: 보물 같은 여정 티켓 오픈 안내!"," 이벤트  |  2024년 08월 19일","https://data1.pokemonkorea.co.kr/newdata/2024/08/2024-08-16_18-05-31-87188-1723799131.png","https://www.ticketlink.co.kr/product/51558"));
        newsList.add(new BaseModel("포켓몬 월드챔피언십2024 LIVE 댓글 이벤트"," 카드 게임  |  2024년 08월 17일","https://data1.pokemonkorea.co.kr/newdata/2024/08/2024-08-14_19-35-53-11078-1723631753.png","https://pokemoncard.co.kr/card/658"));
        newsList.add(new BaseModel("포켓몬 카드 게임 주변상품 「잠만보」시리즈 발매!"," 카드 게임  |  2024년 08월 14일","https://data1.pokemonkorea.co.kr/newdata/2024/08/2024-08-14_18-49-38-72318-1723628978.png","https://pokemoncard.co.kr/card/656"));
        newsList.add(new BaseModel("「포켓몬 월드챔피언십2024」 한국어 중계 결정!"," 이벤트  |  2024년 08월 09일","https://data1.pokemonkorea.co.kr/newdata/2024/08/2024-08-09_14-05-20-55544-1723179920.png","https://pokemonkorea.co.kr/WCS2024/menu481"));
        newsList.add(new BaseModel("포켓몬 카드 게임 주니어 토너먼트 2024 개최!"," 카드 게임  |  2024년 08월 02일","https://data1.pokemonkorea.co.kr/newdata/2024/08/2024-08-02_20-26-16-63533-1722597976.png","https://pokemonkorea.co.kr/junior_tournament_2024"));
        newsList.add(new BaseModel("강화 확장팩 「나이트원더러」발매 기념 토너먼트 개최!"," 카드 게임  |  2024년 08월 01일","https://data1.pokemonkorea.co.kr/newdata/2024/08/2024-08-01_17-30-20-99208-1722501020.png","https://pokemonkorea.co.kr/SV6a_tournament"));
        newsList.add(new BaseModel("포켓몬스터 금은편: 은빛산 이야기 8월 10일 (토) 첫 방송!"," 애니 & 영화  |  2024년 08월 01일","https://data1.pokemonkorea.co.kr/newdata/2024/08/2024-08-01_13-54-49-11444-1722488089.png","https://www.pokemonkorea.co.kr/2024_3rd_project"));
        newsList.add(new BaseModel("해피햅삐 잠만보 이모티콘 출시!!"," 상품  |  2024년 07월 31일","https://data1.pokemonkorea.co.kr/newdata/2024/07/2024-07-31_12-01-55-44458-1722394915.png","https://bit.ly/happy-happyyy-jammanbo"));
        newsList.add(new BaseModel("「포켓몬스터스칼렛・바이올렛」에서 「로드의 뜨아거」를 손에 넣자!"," 게임  |  2024년 07월 29일","https://data1.pokemonkorea.co.kr/newdata/2024/07/2024-07-29_09-13-01-50407-1722211981.png","https://pokemonkorea.co.kr/news/5/14723?cate=0&sword="));
        newsList.add(new BaseModel("스칼렛&바이올렛 강화 확장팩 「나이트원더러」8월 대발매!"," 카드 게임  |  2024년 07월 19일","https://data1.pokemonkorea.co.kr/newdata/2024/07/2024-07-19_18-18-12-43025-1721380692.png","https://pokemoncard.co.kr/card/650"));
        newsList.add(new BaseModel("몬스터볼 팩토리 네이버 사전 예약 오픈!"," 이벤트  |  2024년 07월 23일","https://data1.pokemonkorea.co.kr/newdata/2024/07/2024-07-18_17-25-02-83238-1721291102.png","https://pokemonkorea.co.kr/2025card_shop_league_a/menu516"));
        newsList.add(new BaseModel("2024 코리안리그 파이널 시즌 관련 안내 사항"," 카드 게임  |  2024년 06월 27일","https://data1.pokemonkorea.co.kr/newdata/2024/06/2024-06-27_11-36-48-13756-1719455808.png","https://pokemonkorea.co.kr/news/2/14648?cate=0&sword="));
        newsList.add(new BaseModel("스칼렛&바이올렛 배틀 마스터 덱 「테라스탈 리자몽 ex」「파오젠 ex」 7월 대발매!"," 카드 게임  |  2024년 06월 21일","https://data1.pokemonkorea.co.kr/newdata/2024/06/2024-06-21_19-52-42-49461-1718967162.png","https://pokemoncard.co.kr/card/647"));
        newsList.add(new BaseModel("스칼렛&바이올렛 스페셜 점보 카드 세트 「오거폰」 6월 대발매!"," 카드 게임  |  2024년 06월 21일","https://data1.pokemonkorea.co.kr/newdata/2024/06/2024-06-21_19-50-58-83754-1718967058.png","https://pokemoncard.co.kr/card/645"));
        newsList.add(new BaseModel("확장팩 「변환의 가면」발매 기념 토너먼트 개최!"," 카드 게임  |  2024년 06월 14일","https://data1.pokemonkorea.co.kr/newdata/2024/06/2024-06-14_18-50-46-32845-1718358646.png","https://pokemonkorea.co.kr/SV6_tournament"));
        newsList.add(new BaseModel("2024 포켓몬 카드샵 대항전 대표 선수 결원 보충 선발 안내 2024.6.14 갱신"," 카드 게임  |  2024년 06월 14일","https://data1.pokemonkorea.co.kr/newdata/2024/06/2024-06-12_12-02-34-76998-1718161354.jpg","https://pokemonkorea.co.kr/2025card_shop_league_a/menu516"));
        newsList.add(new BaseModel("스칼렛&바이올렛 확장팩 「변환의 가면」6월 대발매!"," 카드 게임  |  2024년 06월 05일","https://data1.pokemonkorea.co.kr/newdata/2024/06/2024-06-05_18-39-06-96776-1717580346.png","https://pokemoncard.co.kr/card/642"));
        newsList.add(new BaseModel("「포켓몬 트레이너스 컵 2024 파이널 라운드」 최종 결과 공개!"," 게임  |  2024년 05월 30일","https://data1.pokemonkorea.co.kr/newdata/2024/05/2024-05-30_11-23-11-55716-1717035791.png","https://pokemonkorea.co.kr/ptc2024#sec4"));
        newsList.add(new BaseModel("「포켓몬스터스칼렛・바이올렛」에서 「도트의 꾸왁스」를 손에 넣자!"," 게임  |  2024년 05월 20일","https://data1.pokemonkorea.co.kr/newdata/2024/05/2024-05-20_09-30-10-27380-1716165010.png","https://pokemonkorea.co.kr/news/5/14539?cate=0&sword="));
        newsList.add(new BaseModel("강화 확장팩 「크림슨헤이즈」 발매 기념 실드전 개최!"," 카드 게임  |  2024년 05월 16일","https://data1.pokemonkorea.co.kr/newdata/2024/05/2024-05-16_18-29-42-65463-1715851782.png","https://pokemonkorea.co.kr/PCG_Sealed_battle_SV5a"));
        newsList.add(new BaseModel("2024 코리안리그 파이널 시즌 참가 경품 발송 안내"," 카드 게임  |  2024년 05월 21일","https://data1.pokemonkorea.co.kr/newdata/2024/05/2024-05-16_17-15-50-98992-1715847350.jpg","https://pokemonkorea.co.kr/news/2/14526?cate=0&sword="));
        newsList.add(new BaseModel("스칼렛&바이올렛 강화 확장팩 「크림슨헤이즈」대발매!"," 카드 게임  |  2024년 05월 10일","https://data1.pokemonkorea.co.kr/newdata/2024/05/2024-05-10_18-51-30-55784-1715334690.png","https://pokemoncard.co.kr/card/636"));
        newsList.add(new BaseModel("2024 코리안리그 파이널 시즌 후기 공개!"," 카드 게임  |  2024년 05월 10일","https://data1.pokemonkorea.co.kr/newdata/2024/05/2024-05-10_18-40-04-41880-1715334004.jpg","https://pokemonkorea.co.kr/koreanleague_2024/menu466"));


        model.addAttribute("newsList", newsList);


        return "front/news/news";
    }
}