package by.paulent1y.animals;

public class Duck extends Animal {
    private static int instanceCounter;

    public Duck(String _name) {
        super(_name);
        instanceCounter++;
        this.stats = new Stats(_name,
                20,
                150,
                100,
                10);
    }

    public static int getInstanceAmount() {
        return instanceCounter;
    }

}
