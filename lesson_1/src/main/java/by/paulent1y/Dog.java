package by.paulent1y;

class Dog extends Animal {

    static int maxRunDistance = 500;
    static int maxSwimDistance = 10;
    public Dog(String _name) {
        super(_name, maxRunDistance, maxSwimDistance);
        instanceCounter++;
    }

    public static int getInstanceAmount() {
        return instanceCounter;
    }

    public void swim(int meters){

    }
}

