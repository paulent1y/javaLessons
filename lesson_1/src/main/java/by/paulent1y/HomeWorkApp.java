package by.paulent1y;

public class HomeWorkApp {
    public static void main(String[] args) {
        GenericBox<Double, Integer> genStr = new GenericBox<>(40.4, 50);
        genStr.showType();
        System.out.println("genStr.getObject():" + genStr.getObj1());
    }

}
