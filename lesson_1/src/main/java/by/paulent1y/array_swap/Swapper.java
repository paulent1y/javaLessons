package by.paulent1y.array_swap;

/**
 * Utility class with one method for swapping two elements in array
 */
public class Swapper {

    /**
     * Takes array of any type and swap two elements on chosen indexes
     * @param ar array of any type (but not primitive)
     * @param pos1 first element index (should not be less than 0 or greater than array length)
     * @param pos2 second element index (should not be less than 0 or greater than array length)
     * @param <T> any type but primitive
     */
    public static <T> void swapArrayElements(T[] ar, int pos1, int pos2) {
        if (pos1 < 0 || pos2 < 0) {
            System.out.println(
                    "Its not allowed for index to be less then 0. \nNo OutOfBoundsException for today, but be careful next time!");
            return;
        }
        if (pos1 > ar.length - 1 || pos2 > ar.length - 1) {
            System.out.println(
                    "Index "
                            + Math.max(pos1, pos2)
                            + " is to high for this array, slow down please to "
                            + (ar.length - 1)
                            + " at least. \nNo OutOfBoundsException for today, but be careful next time!");
            return;
        }

        T temp = ar[pos1];
        ar[pos1] = ar[pos2];
        ar[pos2] = temp;
        System.out.println("swapped " + ar[pos2] + " & " + ar[pos1]);
    }
}