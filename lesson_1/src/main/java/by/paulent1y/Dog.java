package by.paulent1y;

class Dog extends Animal {
    private static int instanceCounter;

    public Dog(String _name) {
        super(_name);
        instanceCounter++;
        this.stats = new Stats(_name);
        setStats(500, 10, 0);
    }

    public static int getInstanceAmount() {
        return instanceCounter;
    }

}

