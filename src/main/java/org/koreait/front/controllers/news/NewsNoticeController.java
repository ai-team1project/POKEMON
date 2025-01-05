package org.koreait.front.controllers.news;

import org.koreait.front.common.BaseModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NewsNoticeController {

    @GetMapping("/news/notice")
    public String card (Model model) {
        List<BaseModel> newsList = new ArrayList<>();



        model.addAttribute("newsList", newsList);


        return "front/news/news";
    }
}