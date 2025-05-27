package model;


import model.TypeWeakStrong;
import java.util.*;
import model.Type;

/**
 *
 * @author gbm-cmd
 */
public class Pokemon {
    private String name;
    private List<Type> type; 
    private List<SpawnInfo> spawnInfo;
    private List<Stats> stats;

public Pokemon(String name, List<Type> type, List<SpawnInfo> spawnInfo, List<Stats> stats) {
    this.name = name;
    this.type = type;
    this.spawnInfo = spawnInfo;
    this.stats = stats;
}

    
@Override
public String toString() {
    return "Nome: " + name +
           "\nTipo: " + type +
           "\nStatus Base: \n" + stats.get(0) +
           "\nSpawn: " + spawnInfo.get(0) +
           "\nFraquezas: " + TypeWeakStrong.getFraquezas(type.get(0)) +
           "\nResistências: " + TypeWeakStrong.getResistencias(type.get(0));
}

}
