package by.paulent1y;

public class Duck extends Animal {
    private static int instanceCounter;
    static final int maxRunDistance = 20;
    static final int maxSwimDistance = 150;
    public Duck(String _name) {
        super(_name, maxRunDistance, maxSwimDistance);
        instanceCounter++;
    }

    public static int getInstanceAmount() {
        return instanceCounter;
    }

}
