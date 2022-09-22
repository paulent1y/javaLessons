package by.paulent1y.animals;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food >= n) {
            food -= n;
            return true;
        } else return false;
    }

    public void addFood(int amount) {
        food += amount;
    }

    public void info() {
        System.out.println(food + " points of food in plate");
    }

    public int getFood() { return food;}
}