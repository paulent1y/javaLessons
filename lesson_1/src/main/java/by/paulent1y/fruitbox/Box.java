package by.paulent1y.fruitbox;

import java.util.ArrayList;

/**
 * Box class for storing any fruit type
 * @param <T> any class that extends Fruit class
 */
public class Box<T extends Fruit> {

    private ArrayList<T> content;
    String name;

    public Box (String _name) {
        name = _name;
        content = new ArrayList<T>();
    }

    public Box () {

        this("Unnamed");
    }

    /**
     * adds fruit t to the box
     * @param t any subclass of Fruit
     */
    public void add(T t){

        content.add(t);
    }

    /**
     * Calculate weight of the box
     * @return total weight of all instances in the box
     */
    public int getWeight(){

        int total = 0;
        for (T t: content)
            total+=t.weight;

        return total;
    }


    /**
     * Advanced comparison of boxes weights
     * @param other second box to compare with
     */
    public void compareFull(Box<?> other) {

        if (this == other)
            System.out.println("Its the same box -_ -");
        if (getWeight() == other.getWeight())
            System.out.println("Boxes are equal");
        else if (getWeight() > other.getWeight())
            System.out.println(name + " is " + (getWeight()-other.getWeight()) + " grams heavier than " + other.name);
        else
            System.out.println(other.name + " is " + (other.getWeight() - getWeight()) + " grams heavier than " + name);
    }

    /**
     * Compares two boxes with any content
     * @param other second box
     * @return true if boxes are equal, false otherwise
     */
    public boolean compare(Box<?> other) {

        return getWeight()==other.getWeight();
    }

    public void addAllTo(Box<T> other){
        if (this==other) return;
        other.content.addAll(content);
        content.clear();
    }

    public String toString(){
        return "Box: " + name + ". Weight: " + getWeight() + " gr. Amount: " + content.size();
    }


}
