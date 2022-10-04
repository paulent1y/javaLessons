package by.paulent1y;

public class Utils {

    public static <T> void printAr(T[] ar) {
        System.out.print("(" + ar.length + ")");
        for (int i = 0; i < ar.length; i++) {
            System.out.print("[" + i + "]" + "\"" + ar[i] + "\"");
        }
        System.out.println();
    }
}
