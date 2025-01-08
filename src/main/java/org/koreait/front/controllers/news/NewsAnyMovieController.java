package org.koreait.front.controllers.news;

import org.koreait.front.common.BaseModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NewsAnyMovieController {

    @GetMapping("/news/any&movie")
    public String card (Model model) {
        List<BaseModel> newsList = new ArrayList<>();

        newsList.add(new BaseModel("「TV 애니메이션 포켓몬스터」테라스탈 데뷔 방영 기념 - 2024 포켓몬 그림 콘테스트 개최!"," 애니 & 영화  |  2024년 09월 20일","https://data1.pokemonkorea.co.kr/newdata/2024/09/2024-09-19_16-14-03-39171-1726730043.jpg","https://pokemonkorea.co.kr/news/3/14871?cate=0&sword="));
        newsList.add(new BaseModel("포켓몬스터 금은편: 은빛산 이야기 8월 10일 (토) 첫 방송!"," 애니 & 영화  |  2024년 08월 01일","https://data1.pokemonkorea.co.kr/newdata/2024/08/2024-08-01_13-54-49-11444-1722488089.png","https://www.pokemonkorea.co.kr/2024_3rd_project"));

        model.addAttribute("newsList", newsList);


        return "front/news/news";
    }
}