package by.paulent1y;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class HomeWorkApp {
    public static void main(String[] args) {
        ArrayList<Character> charlist = new ArrayList<>();
        for (int i=0; i<500; i++) charlist.add(randomizeChar());

        charlist.forEach((n) -> {
            charlist.forEach((e) -> {
                Battle b = new Battle(n,e);
                b.start();
            });
        });
        charlist.sort(new CharComparatorByWins());
        charlist.forEach((n) -> {
            System.out.println(n.preciseStat() + " wins " + n.wins );
        });
    }

    public static Character randomizeChar() {
        Random r = new Random();
        int hp = r.nextInt(6, 16);
        int ac = r.nextInt(8,14);
        int hit = r.nextInt(0,5);
        int atkD = r.nextInt(4,6);
        int atkMod = r.nextInt(0,3);


        return new Character(hp,ac,hit,atkD,atkMod);
    }

}
