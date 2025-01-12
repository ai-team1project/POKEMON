package org.koreait.mobile.front.controllers;


import org.koreait.mobile.front.model.animation.m_AnimationNewList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class m_AnimationController {

    @GetMapping("/m.animation")
    public String animation(Model model) {

        List<m_AnimationNewList> animationNewList = new ArrayList<>();
        animationNewList.add(new m_AnimationNewList("주니어 토너먼트 2024 시즌2 시작!", "카드 게임",
                "https://data1.pokemonkorea.co.kr/newdata/2024/12/2024-12-12_18-56-33-52636-1733997393.png",
                "https://pokemonkorea.co.kr/news/3/15645",
                "https://pokemonkorea.co.kr/img/icon/icon_go.png",
                "2024년 12월 12일"));
        model.addAttribute("animationNewList", animationNewList);


        return "mobile/animation/animation";
    }

}