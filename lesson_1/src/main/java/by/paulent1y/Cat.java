package by.paulent1y;

class Cat extends Animal {

    private static int instanceCounter;
    static int maxRunDistance = 200;
    static int maxSwimDistance = 0;
    public Cat(String _name) {
        super(_name, maxRunDistance, maxSwimDistance);
        this.stats = new Stats(_name);
        instanceCounter++;
        stats.setMaxSwimDistance(maxSwimDistance);
        stats.setMaxRunDistance(maxRunDistance);
    }

    public static int getInstanceAmount() {
        return instanceCounter;
    }
}
