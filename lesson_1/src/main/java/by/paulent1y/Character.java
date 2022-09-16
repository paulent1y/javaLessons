package by.paulent1y;

import java.util.Random;

public class Character {

    public int hp;
    private int ac;
    private int hitModifier;
    private int attackDice;
    private int attackMod;
    private float averageAttack;
    private float  toughtness;
    private float attackness;

    public float getBattleRating() {
        return battleRating;
    }

    private float battleRating;
    public int wins;

    public Character(int _hp, int _ac, int _hitModifier,  int _attackDice, int _attackMod) {
        hp = _hp;
        ac = _ac;
        hitModifier = _hitModifier;
        attackDice = _attackDice;
        attackMod = _attackMod;

        averageAttack = (float)attackDice/2 + attackMod;
        toughtness = (hp*20)/(20-ac);
        attackness = ((10+hitModifier) * averageAttack)/20;
        battleRating = toughtness * attackness * attackness / 10;

    }

    public Character getCopy() {
        return new Character(hp, ac, hitModifier, attackDice, attackMod);
    }





    public int  makeHit(Character other) {
        Random r = new Random();
        int roll = r.nextInt(1,21);
        int attackRoll = r.nextInt(1, attackDice);
        return other.getHit(roll,  hitModifier, attackRoll + attackMod);
    }

    public int getHit(int hit, int hitMod, int dmg){
        int temp = hp;
        if (hit >=this.hitModifier) this.hp-= dmg;
        if (hit == 20) this.hp-= dmg;
        return temp-hp;
    }

    public void countWin() {
        wins++;
    }
    public String toString(){

        return "".format("Character with %d hp", hp);
    }

    public String stat(){

        return "".format("Character. T:%.1f A:%.1f BR:%.1f",toughtness, attackness, battleRating);
    }
    public String preciseStat(){

        return stat() + "".format("\thp:%d ac:%d atkDice:%d hit:%d",hp, ac, attackDice, hitModifier);
    }

}
