package by.paulent1y;

class Dog extends Animal {
    private static int instanceCounter;
    static int maxRunDistance = 500;
    static int maxSwimDistance = 10;
    public Dog(String _name) {
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

