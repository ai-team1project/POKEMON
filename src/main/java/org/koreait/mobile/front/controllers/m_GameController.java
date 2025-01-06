package org.koreait.mobile.front.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class m_GameController {

    @GetMapping("/m.game")
    public String game(){
        return "mobile/m.game/game" ;
    }
}