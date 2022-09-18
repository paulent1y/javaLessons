package by.paulent1y;


public class HomeWorkApp {

    public static void main(String[] args) 	{
        Animal a = new Animal("habba");
        Cat c = new Cat("Kika");
        Dog d = new Dog("Dogo");
//        c.run(-1);
//        c.run(-201);
//        c.run(0);
//        c.run(1);
//        c.run(201);
//        c.swim(4);
//
//
//        d.run(-46);
//        d.run(-505);
//        d.run(0);
//        d.run(10);
//        d.run(1040);
        new Dog("Harris").run(200);

        System.out.println(Animal.getInstanceAmount());
        System.out.println(Cat.getInstanceAmount());
        System.out.println(Dog.getInstanceAmount());
        System.out.println(d.getInstanceAmount());
    }
}


