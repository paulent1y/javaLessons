package by.paulent1y;


public class HomeWorkApp {

    public static void main(String[] args) 	{
//        Animal a = new Animal("habba");
        Animal catty = new Cat("Kika");
        Dog doggo = new Dog("Dogo");
        Duck ducky = new Duck("Donald");
        int[] distances = {-1000, 10, 1000};
        Animal[] animals = {catty, doggo, ducky};
        for (Animal animal:animals) {
            System.out.println("\n<====================== Testing " + animal.getClass().getSimpleName() + " " + animal.stats.name + " =============================>");
            for (int distance : distances) {
                System.out.print("Run for " + distance + " meters:\t");
                animal.run(distance);
                System.out.print("Swim for " + distance + " meters:\t");
                animal.swim(distance);
                System.out.print("Fly for " + distance + " meters\t");
                animal.fly(distance);
            }
        }
        new Dog("Harris").run(200);

        System.out.println("Total Animals created: " + Animal.getInstanceAmount());
        System.out.println("Cats created: " + Cat.getInstanceAmount());
        System.out.println("Dogs created: " + Dog.getInstanceAmount());
        System.out.println("Ducks created: " + Duck.getInstanceAmount());
    }
}


