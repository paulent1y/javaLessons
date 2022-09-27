package by.paulent1y.fruitbox;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    ArrayList<T> content;
    String name;

    public Box (String _name) {
        name = _name;
        content = new ArrayList<T>();
    }

    public Box () {

        this("Unnamed");
    }

    public void add(T t){

        content.add(t);
    }

    public int getWeight(){

        int total = 0;
        for (T t: content)
            total+=t.weight;

        return total;
    }

    /*
    //didnt read task carefully
    //another one is correct

    public void compare(Box<?> other) {

        if (this == other)
            System.out.println("Its the same box -_ -");
        if (getWeight() == other.getWeight())
            System.out.println("Boxes are equal");
        else if (getWeight() > other.getWeight())
            System.out.println(name + " is " + (getWeight()-other.getWeight()) + " grams heavier than " + other.name);
        else
            System.out.println(other.name + " is " + (other.getWeight() - getWeight()) + " grams heavier than " + name);
    }

    */ //my precious compare
    public boolean compare(Box<?> other) {
        //this one is matches to task, but useless since weights are not normalized
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
