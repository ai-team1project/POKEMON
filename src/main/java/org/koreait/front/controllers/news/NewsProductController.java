package org.koreait.front.controllers.news;

import org.koreait.front.common.BaseModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NewsProductController {

    @GetMapping("/news/product")
    public String card (Model model) {
        List<BaseModel> newsList = new ArrayList<>();


        newsList.add(new BaseModel("해피햅삐 잠만보 이모티콘 출시!!"," 상품  |  2024년 07월 31일","https://data1.pokemonkorea.co.kr/newdata/2024/07/2024-07-31_12-01-55-44458-1722394915.png","https://bit.ly/happy-happyyy-jammanbo"));


        model.addAttribute("newsList", newsList);


        return "front/news/news";
    }
}