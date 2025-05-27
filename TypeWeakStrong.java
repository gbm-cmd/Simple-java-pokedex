package model;


import java.util.*;
import static model.Type.*;

/**
 *
 * @author gbm-cmd
 */
public class TypeWeakStrong {
   private static final Map<Type, List<Type>> fraquezas = new HashMap<>();
   private static final Map<Type, List<Type>> resistencias = new HashMap<>();
    
/*
 * `Map` é uma interface que representa uma estrutura de chave-valor.
 * Neste caso: 
 *   - `Type` (enum) é usado como chave, representando o tipo do Pokémon (ex: Type.FIRE).
 *   - `List<Type>` é o valor associado, representando as fraquezas ou resistências daquele tipo.
 *   - `new HashMap<>()` cria a implementação concreta do mapa.
 * 
 * Vantagens de usar `enum` em vez de `String`:
 *   - Evita erros de digitação
 *   - Oferece autocompletar
 *   - Melhora a segurança e a organização do código
 */
   static {
        fraquezas.put(FIRE, Arrays.asList(WATER, GROUND, ROCK));
        fraquezas.put(WATER, Arrays.asList(ELECTRIC, GRASS));
        fraquezas.put(ELECTRIC, Arrays.asList(GROUND));
        fraquezas.put(GRASS, Arrays.asList(FIRE, ICE, POISON, FLYING, BUG));
        fraquezas.put(ICE, Arrays.asList(FIRE, FIGHTING, ROCK, STEEL));
        fraquezas.put(FIGHTING, Arrays.asList(FLYING, PSYCHIC, FAIRY));
        fraquezas.put(POISON, Arrays.asList(GROUND, PSYCHIC));
        fraquezas.put(GROUND, Arrays.asList(WATER, GRASS, ICE));
        fraquezas.put(FLYING, Arrays.asList(ELECTRIC, ICE, ROCK));
        fraquezas.put(PSYCHIC, Arrays.asList(BUG, GHOST, DARK));
        fraquezas.put(BUG, Arrays.asList(FIRE, FLYING, ROCK));
        fraquezas.put(ROCK, Arrays.asList(WATER, GRASS, FIGHTING, GROUND, STEEL));
        fraquezas.put(GHOST, Arrays.asList(GHOST, DARK));
        fraquezas.put(DRAGON, Arrays.asList(ICE, DRAGON, FAIRY));
        fraquezas.put(DARK, Arrays.asList(FIGHTING, BUG, FAIRY));
        fraquezas.put(STEEL, Arrays.asList(FIRE, FIGHTING, GROUND));
        fraquezas.put(FAIRY, Arrays.asList(POISON, STEEL));
        fraquezas.put(NORMAL, Arrays.asList(FIGHTING));

        resistencias.put(FIRE, Arrays.asList(FIRE, GRASS, ICE, BUG, STEEL, FAIRY));
        resistencias.put(WATER, Arrays.asList(FIRE, WATER, ICE, STEEL));
        resistencias.put(ELECTRIC, Arrays.asList(ELECTRIC, FLYING, STEEL));
        resistencias.put(GRASS, Arrays.asList(WATER, ELECTRIC, GRASS, GROUND));
        resistencias.put(ICE, Arrays.asList(ICE));
        resistencias.put(FIGHTING, Arrays.asList(BUG, ROCK, DARK));
        resistencias.put(POISON, Arrays.asList(GRASS, FIGHTING, POISON, BUG, FAIRY));
        resistencias.put(GROUND, Arrays.asList(POISON, ROCK));
        resistencias.put(FLYING, Arrays.asList(GRASS, FIGHTING, BUG));
        resistencias.put(PSYCHIC, Arrays.asList(FIGHTING, PSYCHIC));
        resistencias.put(BUG, Arrays.asList(GRASS, FIGHTING, GROUND));
        resistencias.put(ROCK, Arrays.asList(NORMAL, FIRE, POISON, FLYING));
        resistencias.put(GHOST, Arrays.asList(POISON, BUG));
        resistencias.put(DRAGON, Arrays.asList(FIRE, WATER, ELECTRIC, GRASS));
        resistencias.put(DARK, Arrays.asList(GHOST, DARK));
        resistencias.put(STEEL, Arrays.asList(NORMAL, GRASS, ICE, FLYING, PSYCHIC, BUG, ROCK, DRAGON, STEEL, FAIRY));
        resistencias.put(FAIRY, Arrays.asList(FIGHTING, BUG, DARK));
        resistencias.put(NORMAL, Collections.emptyList()); // Normal não tem resistências específicas
    }


/*
 * Getters públicos que retornam as fraquezas ou resistências de um tipo específico de Pokémon.
 * - O método recebe um valor do enum `Type` como parâmetro.
 * - Retorna uma lista contendo os tipos correspondentes às fraquezas ou resistências.
 * - Caso o tipo não esteja no mapa, retorna uma lista vazia (`Collections.emptyList()`), evitando erros de null.
 */
    public static List<Type> getFraquezas(Type tipo) {
        return fraquezas.getOrDefault(tipo, Collections.emptyList());
    }

    public static List<Type> getResistencias(Type tipo) {
        return resistencias.getOrDefault(tipo, Collections.emptyList());
    }
}
