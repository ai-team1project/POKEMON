package org.koreait.pokemonGame.service;


import lombok.RequiredArgsConstructor;
import org.koreait.pokemonGame.PokemonGame;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class PokemonGameService {
    private PokemonGame pokemonGame;
    private final Random random = new Random(); // 롬복과 관계없지만 초기화 최적화

    public PokemonGame pokemonGame() {
        pokemonGame = new PokemonGame(100, 100, false); // 체력 초기화
        return pokemonGame;
    }

    public PokemonGame handleAction(String action) {
        int playerDamage = random.nextInt(15) + 5; // 5~20의 랜덤 데미지
        int computerDamage = random.nextInt(15) + 5;

        if ("attack".equals(action)) {
            pokemonGame.setComputerHealth(pokemonGame.getComputerHealth() - playerDamage);
        } else if ("defend".equals(action)) {
            playerDamage /= 2;
        }

        pokemonGame.setPlayerHealth(pokemonGame.getPlayerHealth() - computerDamage);

        if (pokemonGame.getPlayerHealth() <= 0 || pokemonGame.getComputerHealth() <= 0) {
            pokemonGame.setGameOver(true);
        }

        return pokemonGame;
    }

}
