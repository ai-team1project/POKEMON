package org.koreait.pokemonGame;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PokemonGame {
    private int playerHealth;
    private int computerHealth;
    private boolean gameOver;

}
