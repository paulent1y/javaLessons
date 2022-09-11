package by.paulent1y;

public class Program {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a=10,b=20;
        if (a+b>=0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    public static void printColor(){
        int value = 10;
        if (value<1) System.out.println("Краный");
        else if (value>0 && value<101) System.out.println("Желтый");
        else System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        int a=10, b=20;
        if (a>=b) System.out.println("a >= b");
        else System.out.println("a < b");
    }
}
