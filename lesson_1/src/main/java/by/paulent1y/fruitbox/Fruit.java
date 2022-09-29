package by.paulent1y.fruitbox;

import java.util.Random;

public class Fruit {
    int weight;

    public Fruit() {
        Random r = new Random();
        weight = (int)((r.nextFloat()/2 + 0.3f) * 1000);
    }

    public String toString() {
        return this.getClass().getSimpleName() + " that weights " + weight + " gr.";
    }
}
