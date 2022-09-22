package by.paulent1y.animals;

class Dog extends Animal {
    private static int instanceCounter;

    public Dog(String _name) {
        super(_name);
        instanceCounter++;
        this.stats = new Stats(_name,
                500,
                10,
                0,
                35);
    }

    public static int getInstanceAmount() {
        return instanceCounter;
    }

}

