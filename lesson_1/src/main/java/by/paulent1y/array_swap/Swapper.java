package by.paulent1y.array_swap;

public class Swapper {

    public static void swapArrayElements(Object[] ar, int pos1, int pos2) {
        if (pos1 < 0 || pos2 < 0) {
            System.out.println(
                    "Its not allowed for index to be less then 0. \nNo IllegalArgumentExceptions for today, but be careful next time!");
            return;
        }
        if (pos1 > ar.length - 1 || pos2 > ar.length - 1) {
            System.out.println(
                    "Index "
                            + Math.max(pos1, pos2)
                            + " is to high for this array, slow down please to "
                            + (ar.length - 1)
                            + " at least. \nNo IllegalArgumentExceptions for today, but be careful next time!");
            return;
        }

        Object temp = ar[pos1];
        ar[pos1] = ar[pos2];
        ar[pos2] = temp;
        System.out.println("swapped " + ar[pos2] + " & " + ar[pos1]);
    }
}