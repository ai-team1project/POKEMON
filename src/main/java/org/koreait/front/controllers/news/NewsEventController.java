package org.koreait.front.controllers.news;

import org.koreait.front.common.BaseModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NewsEventController {

    @GetMapping("/news/event")
    public String card (Model model) {
        List<BaseModel> newsList = new ArrayList<>();

        newsList.add(new BaseModel("「포켓몬 월드챔피언십2024」 게임 부문 응원 댓글 이벤트"," 이벤트  |  2024년 08월 17일","https://data1.pokemonkorea.co.kr/newdata/2024/08/2024-08-17_09-14-21-47831-1723853661.png","https://pokemonkorea.co.kr/news/6/14777?cate=0&sword="));
        newsList.add(new BaseModel("Pokémon the Orchestra: 보물 같은 여정 티켓 오픈 안내!"," 이벤트  |  2024년 08월 19일","https://data1.pokemonkorea.co.kr/newdata/2024/08/2024-08-16_18-05-31-87188-1723799131.png","https://www.ticketlink.co.kr/product/51558"));
        newsList.add(new BaseModel("「포켓몬 월드챔피언십2024」 한국어 중계 결정!"," 이벤트  |  2024년 08월 09일","https://data1.pokemonkorea.co.kr/newdata/2024/08/2024-08-09_14-05-20-55544-1723179920.png","https://pokemonkorea.co.kr/WCS2024/menu481"));
        newsList.add(new BaseModel("몬스터볼 팩토리 네이버 사전 예약 오픈!"," 이벤트  |  2024년 07월 23일","https://data1.pokemonkorea.co.kr/newdata/2024/07/2024-07-18_17-25-02-83238-1721291102.png","https://pokemonkorea.co.kr/2025card_shop_league_a/menu516"));


        model.addAttribute("newsList", newsList);


        return "front/news/news";
    }
}