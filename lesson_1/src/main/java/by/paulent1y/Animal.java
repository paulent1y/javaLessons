package by.paulent1y;

import java.lang.Math;
import java.lang.invoke.MethodHandles;

class Animal {

    private static int instanceCounter;
    private int maxRunDistance = 1000;
    int maxSwimDistance = 1000;
    String name;

    public Animal(String _name) {
        instanceCounter++;
        name = _name;
    }

    public Animal(String _name,int _maxRunDistance, int _maxSwimDistance) {
        this(_name);
        maxRunDistance = _maxRunDistance;
        maxSwimDistance = _maxSwimDistance;
    }

    public static int getInstanceAmount() {
        return instanceCounter;
    }

    public void run(int meters){
        String temp = name + ((meters<0)?" run back ":" run forward ");
        System.out.print(temp) ;
        if (Math.abs(meters) >= maxRunDistance)
            System.out.println(maxRunDistance + "m and now this " + this.getClass().getSimpleName() + " is tired") ;
        else
            System.out.println(Math.abs(meters) + "m. This " + this.getClass().getSimpleName() + " is happy now") ;
    }

    public void swim(int meters) {
        String temp = name + ((meters<0)?" swim back ":" swim forward ");
        System.out.print(temp) ;
        if (Math.abs(meters) >= maxSwimDistance)
            System.out.println(maxSwimDistance + "m and now this " + this.getClass().getSimpleName() + " is tired") ;
        else
            System.out.println(Math.abs(meters) + "m. This " + this.getClass().getSimpleName() + " is wet and happy") ;
    }


}

