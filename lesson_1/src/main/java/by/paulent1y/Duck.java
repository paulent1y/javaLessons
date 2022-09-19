package by.paulent1y;

public class Duck extends Animal {
    private static int instanceCounter;

    public Duck(String _name) {
        super(_name);
        instanceCounter++;
        this.stats = new Stats(_name);
        setStats(20, 150, 100);
    }

    public static int getInstanceAmount() {
        return instanceCounter;
    }

}
