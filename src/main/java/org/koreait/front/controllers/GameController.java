package org.koreait.front.controllers;

import lombok.RequiredArgsConstructor;
import org.koreait.global.libs.Utils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class GameController {
    private final Utils utils;
    @GetMapping("/game")
    public String game(){
        return utils.tpl("game/game");
    }
}