package by.paulent1y;

import java.lang.Math;
class Animal {

    public static int instanceCounter;
    int maxRunDistance = 1000;
    int maxSwimDistance = 1000;
    String name;


    public Animal(String _name) {
        instanceCounter++;
        name = _name;
    }

    public Animal(String _name,int _maxDistance, int _maxSwimDistance) {
        this(_name);
        maxSwimDistance = _maxSwimDistance;
        maxRunDistance = _maxDistance;
    }

    public static int getInstanceAmount() {
        return instanceCounter;
    }

    public void run(int meters){
        String temp = name + ((meters<0)?" run back ":" run forward ");
        System.out.print(temp) ;
        if (Math.abs(meters) >= maxRunDistance)
            System.out.println(maxRunDistance + " m. and now he is tired") ;
        else
            System.out.println(Math.abs(meters) + " m. He is happy") ;
    }

    public void swim(int meters) {
        String temp = name + ((meters<0)?" swim back ":" swim forward ");
        System.out.print(temp) ;
        if (Math.abs(meters) >= maxRunDistance)
            System.out.println(maxRunDistance + " m. and now he is tired") ;
        else
            System.out.println(Math.abs(meters) + " m. He is happy") ;
    }
}

