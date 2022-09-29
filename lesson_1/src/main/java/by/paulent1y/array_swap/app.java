package by.paulent1y.array_swap;


import java.util.Arrays;

public class app {

    /**
     * Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
     *
     */
    public static void main(String[] args) {
        //test with String
        String[] s = {"h", "e", "l", "l", "o", "w", "o", "r", "l", "d"};
        print(s);
        Swapper.swapArrayElements(s, 2, 5);
        print(s);
        Swapper.swapArrayElements(s, 2, 10);
        Swapper.swapArrayElements(s, -4, 10);

        //test with Integer
        Integer[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        print(ints);
        Swapper.swapArrayElements(ints, 2, 3);
        print(ints);

        //test with classes
        CustomClass[] cc = new CustomClass[10];
        for (int i = 0; i < cc.length; i++) {
            cc[i] = new CustomClass();
        }
        print(cc);
        Swapper.swapArrayElements(cc, 0, 3);
        print(cc);
    }

    public static <T> void print(T[] ar) {
        System.out.println(Arrays.toString(ar));
    }
}