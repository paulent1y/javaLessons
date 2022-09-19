package by.paulent1y;


public class HomeWorkApp {

    public static void main(String[] args) 	{
        Animal a = new Animal("habba",20,10);
        Cat catty = new Cat("Kika");
        Dog doggo = new Dog("Dogo");
        Duck ducky = new Duck("Donald");
        int[] distances = {-1000, -1, 0, 1, 1000};
        for (int distance:distances) {
            System.out.println("=========  Run for " + distance + " meters  =========");
            catty.run(distance);
            doggo.run(distance);
            ducky.run(distance);
            System.out.println();
            System.out.println("=========  Swim for " + distance + " meters  =========");
            catty.swim(distance);
            doggo.swim(distance);
            ducky.swim(distance);
            System.out.println();
        }
        new Dog("Harris").run(200);

        System.out.println("Total Animals created: " + Animal.getInstanceAmount());
        System.out.println("Cats created: " + Cat.getInstanceAmount());
        System.out.println("Dogs created: " + Dog.getInstanceAmount());
        System.out.println("Ducks created: " + Duck.getInstanceAmount());
    }
}


