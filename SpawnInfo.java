package model;


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
public class SpawnInfo {
    
    private BiomeType biome;
    private SpawnTime time;

    public SpawnInfo(BiomeType biome, SpawnTime time) {
        this.biome = biome;
        this.time = time;
    }
    /*
    construtor para setar os valores e iniciar as variaveis.
    */
    @Override
public String toString() {
    return biome + " (" + time + ")";
}
   /*
    Esse método retorna uma String, que será usada sempre que o objeto for tratado como texto.
    */
}
