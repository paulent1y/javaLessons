package by.paulent1y.fruitbox;

public class app {
    public static void main(String[] args) {

        Box<Apple> box1= new Box<>("AppleBox");
        for (int i = 0; i < 20; i++)
            box1.add(new Apple());

        Box<Apple> box2= new Box<>("SmallAppleBox");
        for (int i = 0; i < 20; i++)
            box2.add(new Apple());

        Box<Orange> box3 = new Box<>("OrangeBox");
        for (int i = 0; i < 20; i++)
            box3.add(new Orange());


        System.out.println(box1);
        System.out.println(box2);
        System.out.println("Merging boxes");
        box1.addAllTo(box2);
        System.out.println(box1);
        System.out.println(box2);
        System.out.println("Box are equal:" +  box1.compare(box2));
    }
}
