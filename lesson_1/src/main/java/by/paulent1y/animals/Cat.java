package by.paulent1y.animals;

class Cat extends Animal {

    private static int instanceCounter;

    public Cat(String _name) {
        super(_name);
        instanceCounter++;
        this.stats = new Stats(_name,
                200,
                0,
                0,
                20);
    }

    public static int getInstanceAmount() {
        return instanceCounter;
    }
}
