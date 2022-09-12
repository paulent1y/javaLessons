package by.paulent1y;

import java.util.Arrays;

public class ArraySequentalFiller {

    public void fillArray() {
        int[] a = new int[100];
        for (int i=0; i< a.length; i++) a[i] = i+1;
        System.out.println(Arrays.toString(a));
    }
}
