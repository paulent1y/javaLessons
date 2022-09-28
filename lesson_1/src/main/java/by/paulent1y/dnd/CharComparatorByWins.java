package by.paulent1y.dnd;

import java.util.Comparator;

public class CharComparatorByWins implements Comparator<Character> {

    @Override
    public int compare(Character o1, Character o2) {
        return o1.wins - o2.wins;
    }
}
