package by.paulent1y;

class Dog extends Animal {
    private static int instanceCounter;
    static final int maxRunDistance = 500;
    static final int maxSwimDistance = 10;
    public Dog(String _name) {
        super(_name, maxRunDistance, maxSwimDistance);
        instanceCounter++;
    }

    public static int getInstanceAmount() {
        return instanceCounter;
    }

}

