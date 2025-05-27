package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gbm-cmd
 */
public class Stats {
    private int hp;
    private int atk;
    private int def;
    private int spAtk;
    private int spDef;
    private int speed;
    
    private int megaHp;
    private int megaAtk;
    private int megaDef;
    private int megaSpAtk;
    private int megaSpDef;
    private int megaSpeed;
/*
 * Um enum em Java é um tipo especial que define um conjunto fixo de constantes nomeadas.
 * Serve para representar valores previsíveis (como HP, ATK...).
 * Torna o código mais seguro, organizado e fácil de manter.
 */
    public enum statusNormal{
    HP,ATK,DEF,SPATK,SPDEF,SPEED,TOTAL
}
    public enum megaStatus{
    MEGAHP,MEGAATK,MEGADEF,MEGASPATK,MEGASPDEF,MEGASPEED,MEGATOTAL
}

    public int getStats(statusNormal stats){
    /*esse getter esta sendo utilizado para fazer um ciclo for each (para cada variavel 1 print) para printar todas as variaveis
        o for each consiste em 
        for (Tipo(Status) elemento(s) : Coleção(Status.values()) {
    // usar elemento aqui
}
    Tipo: o tipo de cada item da coleção (no seu caso, Status)
    elemento: nome da variável que representa um item por vez
    Coleção: qualquer estrutura que seja iterável (array, lista, enum, etc.)

    for (Status s : Status.values()) {  
        System.out.println(s + ": " + getValor(s));
        }
        Status.values() --->  especial do enum
        (Status s : Status.values()) -----> Ele percorre cada valor do enum Status, e guarda temporariamente o valor na variável s a cada ciclo.
        */
        switch(stats){/* Esse switch com enum serve somente para mostar as informacoes das variaveis verdadeiras: como private int hp;*/
        case HP: return hp;
        case ATK: return atk;
        case DEF: return def;
        case SPATK: return spAtk;
        case SPDEF: return spDef;
        case SPEED: return speed;
        }
return -1;/*Return tipo default: garante que a função sempre retorna algo, mesmo se um valor inesperado for passado.*/  }
    
    public int getMegaStatus(megaStatus statsmega){
        switch(statsmega){
        case MEGAHP: return megaHp;
        case MEGAATK: return megaAtk;
        case MEGADEF: return megaDef;
        case MEGASPATK: return megaSpAtk;
        case MEGASPDEF: return megaSpDef;
        case MEGASPEED: return megaSpeed; 
        }
        return -1;
    }

    public Stats(int hp, int atk, int def, int spAtk, int spDef, int speed, int megaHp, int megaAtk, int megaDef, int megaSpAtk, int megaSpDef, int megaSpeed) {
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.speed = speed;
        this.megaHp = megaHp;
        this.megaAtk = megaAtk;
        this.megaDef = megaDef;
        this.megaSpAtk = megaSpAtk;
        this.megaSpDef = megaSpDef;
        this.megaSpeed = megaSpeed;
    }
    @Override
public String toString() {
    return "HP: " + hp +
           "\nATK: " + atk +
           "\nDEF: " + def +
           "\nSPATK: " + spAtk +
           "\nSPDEF: " + spDef +
           "\nSPEED: " + speed +
           "\n(MEGA) HP: " + megaHp +
           "\n(MEGA) ATK: " + megaAtk +
           "\n(MEGA) DEF: " + megaDef +
           "\n(MEGA) SPATK: " + megaSpAtk +
           "\n(MEGA) SPDEF: " + megaSpDef +
           "\n(MEGA) SPEED: " + megaSpeed;
}

}
