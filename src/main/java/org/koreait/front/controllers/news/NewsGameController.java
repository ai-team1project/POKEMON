package org.koreait.front.controllers.news;

import org.koreait.front.common.BaseModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NewsGameController {

    @GetMapping("/news/game")
    public String card (Model model) {
        List<BaseModel> newsList = new ArrayList<>();


        newsList.add(new BaseModel("게임도감을 완성하고 색이 다른 「메로엣타」를 손에 넣자!"," 게임  |  2024년 10월 18일","https://data1.pokemonkorea.co.kr/newdata/2024/10/2024-10-18_14-26-14-24714-1729229174.png","https://pokemonkorea.co.kr/2025card_shop_league_a/menu516"));
        newsList.add(new BaseModel("「포켓몬스터스칼렛・바이올렛」에서 「로드의 뜨아거」를 손에 넣자!"," 게임  |  2024년 07월 29일","https://data1.pokemonkorea.co.kr/newdata/2024/07/2024-07-29_09-13-01-50407-1722211981.png","https://pokemonkorea.co.kr/news/5/14723?cate=0&sword="));
        newsList.add(new BaseModel("「포켓몬 트레이너스 컵 2024 파이널 라운드」 최종 결과 공개!"," 게임  |  2024년 05월 30일","https://data1.pokemonkorea.co.kr/newdata/2024/05/2024-05-30_11-23-11-55716-1717035791.png","https://pokemonkorea.co.kr/ptc2024#sec4"));
        newsList.add(new BaseModel("「포켓몬스터스칼렛・바이올렛」에서 「도트의 꾸왁스」를 손에 넣자!"," 게임  |  2024년 05월 20일","https://data1.pokemonkorea.co.kr/newdata/2024/05/2024-05-20_09-30-10-27380-1716165010.png","https://pokemonkorea.co.kr/news/5/14539?cate=0&sword="));


        model.addAttribute("newsList", newsList);


        return "front/news/news";
    }
}