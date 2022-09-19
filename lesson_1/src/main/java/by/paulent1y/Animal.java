package by.paulent1y;

import javax.swing.*;
import java.lang.Math;
import java.lang.invoke.MethodHandles;

class Animal {

    private static int instanceCounter;

    public Stats stats;


    class Stats {
        String name;
        private int maxRunDistance = 1000;
        private int maxSwimDistance = 1000;

        private int maxFlyDistance = 1000;

        Stats(String _name){
            name = _name;
        }
        public void setMaxRunDistance(int maxRunDistance) {
            this.maxRunDistance = maxRunDistance;
        }

        public void setMaxSwimDistance(int maxSwimDistance) {
            this.maxSwimDistance = maxSwimDistance;
        }

        public void setMaxFlyDistance(int maxFlyDistance) {
            this.maxFlyDistance = maxFlyDistance;
        }

        public int getMaxRunDistance() {
            return maxRunDistance;
        }

        public int getMaxSwimDistance() {
            return maxSwimDistance;
        }

        public int getMaxFlyDistance() {
            return maxFlyDistance;
        }
    }
    public Animal() {
        instanceCounter++;
    }

    public Animal(String _name) {
        this();
        this.stats = new Stats(_name);
    }

    public void setStats(int _maxRunDistance, int _maxSwimDistance, int _maxFlyDistance) {
        stats.setMaxRunDistance(_maxRunDistance);
        stats.setMaxSwimDistance(_maxSwimDistance);
        stats.setMaxFlyDistance(_maxFlyDistance);
    }

    public static int getInstanceAmount() {
        return instanceCounter;
    }

    public void run(int meters){
        move("run", meters, stats.getMaxRunDistance());

    }

    public void swim(int meters) {
        move("swim",meters, stats.getMaxSwimDistance());
    }

    public void fly(int meters) {
        move("fly",meters, stats.getMaxFlyDistance());
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


}

