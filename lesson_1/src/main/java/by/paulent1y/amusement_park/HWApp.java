package by.paulent1y.amusement_park;

public class HWApp {
    public static void main(String[] args) {
        Park p = new Park("Park Zhilibera");
        System.out.println(p);
        p.addFood(p.new Food("Hot-dog", 4.5f));
        System.out.println(p.foods[0]);
        p.addAttraction(p.new Attraction("Death wheel", 4.5f, "Absolutely harmless wheel. In the middle of spinning everybody is thrown at the sky. No safe belts, no catching", 10));
        System.out.println(p.attractions[0]);
    }
}
