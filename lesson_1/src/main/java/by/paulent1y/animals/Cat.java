package by.paulent1y.animals;

class Cat extends Animal {

    private static int instanceCounter;

    public Cat(String _name) {
        super(_name);
        instanceCounter++;
        this.stats = new Stats(_name);
        setStats(200, 0, 0);
    }

    public static int getInstanceAmount() {
        return instanceCounter;
    }
}
