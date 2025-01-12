package org.koreait.pokemonGame.controller;

import lombok.RequiredArgsConstructor;
import org.koreait.pokemonGame.PokemonGame;
import org.koreait.pokemonGame.service.PokemonGameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class PokemonGameController {
    private final PokemonGameService pokemonGameService;

        @GetMapping("/pokemonGame")
    public String startGame(Model model) {
        PokemonGame pokemonGame = pokemonGameService.startGame(); // 수정된 부분
        model.addAttribute("pokemonGame", pokemonGame);
        return "front/pokemonGame/pokemonGame";
    }

    @PostMapping("/pokemonGame/action")
    public String gameAction(@RequestParam("action") String action, Model model) {
        PokemonGame pokemonGame = pokemonGameService.handleAction(action);
        model.addAttribute("pokemonGame", pokemonGame);

        if (pokemonGame.isGameOver()) {
            return "front/pokemonGame/pokemonResult"; // 게임 종료 페이지
        }

        return "front/pokemonGame/pokemonGame"; // 게임 진행 페이지
    }
}
