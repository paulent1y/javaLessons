package by.paulent1y;

class Cat extends Animal {

    static int maxRunDistance = 200;
    static int maxSwimDistance = 0;
    public Cat(String _name) {
        super(_name, maxRunDistance, maxSwimDistance);
        instanceCounter++;
    }

    public static int getInstanceAmount() {
        return instanceCounter;
    }

    public void run(int meters){
        super.run(meters);
    }

    public void swim(int meters){
        System.out.println("Poor " + name + " will drawn T_T \nDont put cats in the water please") ;
    }
}
