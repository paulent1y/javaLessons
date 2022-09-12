package by.paulent1y;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class BinaryArrayReverser {

    public void reverseArray() {
        //creates array of 1 and 0, then reverses it
        Random r = new Random();
        int[] ar = new int[20];
        for (int i=0; i<ar.length; i++) ar[i] = r.nextInt(2);

        System.out.println("initial array: " + Arrays.toString(ar));
        for (int i=0; i<ar.length; i++) ar[i] = 1 - ar[i];
        System.out.println("result array:  " + Arrays.toString(ar));
    }
}
