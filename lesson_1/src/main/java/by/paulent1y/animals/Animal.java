package by.paulent1y.animals;

import javax.swing.*;
import java.lang.Math;
import java.lang.invoke.MethodHandles;

class Animal {

    private static int instanceCounter;
    String name;
    public Stats stats;


    class Stats {
        String name;
        private int maxRunDistance = 1000;
        private int maxSwimDistance = 1000;
        private int maxFlyDistance = 1000;

        private int appetite = 50;
        private boolean isHungry = true;

        Stats(String _name, int _maxRunDistance, int _maxSwimDistance, int _maxFlyDistance, int _appetite){
            name = _name;
            maxRunDistance = _maxRunDistance;
            maxSwimDistance = _maxSwimDistance;
            maxFlyDistance = _maxFlyDistance;
            appetite = _appetite;
        }
    }

    public Animal(String _name) {
        name = _name;
        instanceCounter++;
    }


    public static int getInstanceAmount() {
        return instanceCounter;
    }

    public void run(int meters){
        move("run", meters, stats.maxRunDistance);

    }

    public void swim(int meters) {
        move("swim",meters, stats.maxSwimDistance);
    }

    public void fly(int meters) {
        move("fly",meters, stats.maxFlyDistance);
    }

    public void move(String movementType, int meters, int maxDistance){
        if (maxDistance == 0) {
            System.out.println(this.getClass().getSimpleName() + " cant " + movementType + ". Put it back!");
            return;
        }
        System.out.print( stats.name + " " + movementType + " " + (meters<0?"back ":"forward "));

        if (Math.abs(meters) >= maxDistance)
            System.out.println(maxDistance + "m and now this " + this.getClass().getSimpleName() + " is tired") ;
        else
            System.out.println(Math.abs(meters) + "m. This " + this.getClass().getSimpleName() + " is happy and ready to " + movementType + " more") ;
    }

    public void eat(Plate p){
        if (p.decreaseFood(stats.appetite)){
            System.out.println(this.getClass().getSimpleName() + " " + name +  " just ate enough ");
            stats.isHungry = false;
        }
        else System.out.println(this.getClass().getSimpleName() + " " + name +  " cannot eat from plate. It wanted " + stats.appetite + " but there was only " + p.getFood());

    }
}

