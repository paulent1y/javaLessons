package by.paulent1y;

import java.util.ArrayList;

public class Battle {

    Character char1;
    Character char2;


    public Battle(Character _char1, Character _char2) {
        char1 = _char1;
        char2 = _char2;
    }

    public void start() {
        int rounds = 0;
        Character a = char1.getCopy();
        Character b = char2.getCopy();
        while (a.hp>0 && b.hp > 0){
                rounds++;
                round(a,b);
            }
//        System.out.println("Result: " + a + "  " + b);
        if (a.hp > 0) char1.countWin();
        if (b.hp > 0) char2.countWin();

        }


    public String round(Character a, Character b) {
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" attacked ").append(b).append("(").append(a.makeHit(b)).append(" dmg)\n");
        sb.append(b).append(" attacked ").append(a).append("(").append(b.makeHit(a)).append(" dmg)");
        return sb.toString();
    }

}
