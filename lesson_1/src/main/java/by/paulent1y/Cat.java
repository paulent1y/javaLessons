package by.paulent1y;

class Cat extends Animal {

    private static int instanceCounter;
    static int maxRunDistance = 200;
    static int maxSwimDistance = 0;
    public Cat(String _name) {
        super(_name, maxRunDistance, maxSwimDistance);
        instanceCounter++;
    }

    public static int getInstanceAmount() {
        return instanceCounter;
    }

    @Override
    public void swim(int meters){
        System.out.println("Poor " + name + " will drawn! T_T \n!!!Dont put " + this.getClass().getSimpleName() + " in the water please") ;
    }
}
