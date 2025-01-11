package org.koreait.front.controllers;


import org.koreait.front.model.animation.AnimationNewList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AnimationController {

    @GetMapping("/animation")
    public String animation(Model model) {

        List<AnimationNewList> animationNewList = new ArrayList<>();
        animationNewList.add(new AnimationNewList("IPTV VOD 이벤트 !",
                "2024년 12월 03일",
                "https://data1.pokemonkorea.co.kr/newdata/2024/12/2024-12-03_10-31-44-40870-1733189504.png",
                "https://pokemonkorea.co.kr/news/3/15645",
                "https://pokemonkorea.co.kr/img/icon/icon_go.png"));

        animationNewList.add(new AnimationNewList("「TV 애니메이션 포켓몬스터」테라스탈 데뷔 방영 기념 - 2024 포켓몬 그림 콘테스트 당첨자 ",
                "2024년 11월 27일",
                "https://data1.pokemonkorea.co.kr/newdata/2024/11/2024-11-26_16-52-56-22347-1732607576.jpg",
                "https://pokemonkorea.co.kr/news/3/15542",
                "https://pokemonkorea.co.kr/img/icon/icon_go.png"));

        animationNewList.add(new AnimationNewList(" 「TV 애니메이션 포켓몬스터」테라스탈 데뷔 방영 기념 - 2024 포켓몬 그림 콘테스트 개최! ",
                "2024년 09월 20일",
                "https://data1.pokemonkorea.co.kr/newdata/2024/11/2024-11-26_16-52-56-22347-1732607576.jpg",
                "https://pokemonkorea.co.kr/news/3/14871",
                "https://pokemonkorea.co.kr/img/icon/icon_go.png"));

        animationNewList.add(new AnimationNewList(" 포켓몬스터 금은편: 은빛산 이야기 8월 10일 (토) 첫 방송! ",
                "2024년 08월 01일",
                "https://data1.pokemonkorea.co.kr/newdata/2024/04/2024-04-03_14-06-20-28095-1712120780.png",
                "https://www.pokemonkorea.co.kr/2024_3rd_project",
                "https://pokemonkorea.co.kr/img/icon/icon_go.png"));


        animationNewList.add(new AnimationNewList("포켓몬스터 애니메이션 국내 방영 25주년 기념 특별 프로젝트",
                "2024년 08월 01일",
                "https://data1.pokemonkorea.co.kr/newdata/2024/04/2024-04-03_14-06-20-28095-1712120780.png",
                "https://pokemonkorea.co.kr/news/3/14388",
                "https://pokemonkorea.co.kr/img/icon/icon_go.png"));

        animationNewList.add(new AnimationNewList("포켓몬 애니메이션 콘서트 개최",
                "2024년 04월 22일",
                "https://data1.pokemonkorea.co.kr/newdata/2024/04/2024-04-18_11-23-00-56096-1713406980.png",
                "https://pokemonkorea.co.kr/Ani_orchestra_2024",
                "https://pokemonkorea.co.kr/img/icon/icon_go.png"));

        animationNewList.add(new AnimationNewList("「포켓몬스터W」 특별편 OTT 서비스 개시! ",
                "2023년 07월 13일",
                "https://data1.pokemonkorea.co.kr/newdata/2023/07/2023-07-13_12-22-34-17758-1689218554.png",
                "https://pokemonkorea.co.kr/news/3/13378",
                "https://pokemonkorea.co.kr/img/icon/icon_go.png"));

        animationNewList.add(new AnimationNewList("「극장판 포켓몬스터DP: 아르세우스 초극의 시공으로」5월 개봉 확정! ",
                "2023년 04월 10일",
                "https://data1.pokemonkorea.co.kr/newdata/2023/04/2023-04-10_09-49-00-53278-1681087740.png",
                "https://pokemonkorea.co.kr/2023_M12",
                "https://pokemonkorea.co.kr/img/icon/icon_go.png"));




        model.addAttribute("animationNewList", animationNewList);


        return "front/animation/animation";
    }

}