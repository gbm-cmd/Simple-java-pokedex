
import model.Stats;
import model.SpawnInfo;
import model.Pokemon;
import java.util.*;
import model.Type;
import model.BiomeType;
import model.SpawnTime;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gbm-cmd
 */
public class MainGabbodex {
    public static void main(String[] args) {
        // Cria os stats do Charizard
        Stats charizardStats = new Stats(
            78, 84, 78, 109, 85, 100,   // base stats
            78, 130, 111, 130, 85, 100  // mega stats
        );

        // Cria o Pokémon Charizard com seus dados
        Pokemon charizard = new Pokemon(
            "Charizard",
            List.of(Type.FIRE, Type.FLYING),
            List.of(new SpawnInfo(BiomeType.Mesa, SpawnTime.DAY)),
            List.of(charizardStats) // passa a lista contendo os stats criados
        );

        System.out.println(charizard);
    }
}

