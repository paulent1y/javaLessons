package by.paulent1y;


public class HomeWorkApp {

    public static void main(String[] args) 	{
        Animal a = new Animal("habba");
        Cat c = new Cat("Kika");
        Dog d = new Dog("Dogo");
        Duck du = new Duck("Donald");
        c.run(-1);
        c.run(-201);
        c.run(0);
        c.run(1);
        c.run(201);
        c.swim(4);


        d.run(-46);
        d.run(-505);
        d.run(0);
        d.run(10);
        d.run(1040);
        d.swim(10);
        d.swim(50);
        du.run(100);
        du.swim(100);
        new Dog("Harris").run(200);

        System.out.println("Total Animals created: " + Animal.getInstanceAmount());
        System.out.println("Cats created: " + Cat.getInstanceAmount());
        System.out.println("Dogs created: " + Dog.getInstanceAmount());
        System.out.println("Ducks created: " + Duck.getInstanceAmount());
    }
}


