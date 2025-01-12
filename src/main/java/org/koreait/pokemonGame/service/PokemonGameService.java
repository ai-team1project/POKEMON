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

    // 포켓몬 이미지 배열을 추가합니다.
    private final String[] pokemonImages = {
            "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png",  // 이상해씨
            "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/2.png",  // 꼬부기
            "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/3.png",  // 파이리
            "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png",  // 파이리
            "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/5.png",  // 이상해씨
            "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/6.png"   // 꼬부기
    };

    // 게임 시작 시 포켓몬 이미지 랜덤으로 선택
    public PokemonGame startGame() {
        pokemonGame = new PokemonGame();
        pokemonGame.setPlayerHealth(100);
        pokemonGame.setComputerHealth(100);
        pokemonGame.setGameOver(false);
        pokemonGame.setPlayerPokemonImage(pokemonImages[random.nextInt(pokemonImages.length)]);
        pokemonGame.setComputerPokemonImage(pokemonImages[random.nextInt(pokemonImages.length)]);
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
