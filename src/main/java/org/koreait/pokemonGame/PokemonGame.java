package org.koreait.pokemonGame;

import lombok.*;


@Data
@NoArgsConstructor // 기본 생성자 추가
@AllArgsConstructor
public class PokemonGame {
    private int playerHealth;
    private int computerHealth;
    private boolean gameOver;

    private String playerPokemonImage;
    private String computerPokemonImage;
}
