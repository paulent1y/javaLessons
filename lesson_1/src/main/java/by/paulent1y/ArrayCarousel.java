package by.paulent1y;

import java.util.Arrays;

public class ArrayCarousel {

    public void shiftArray(int[] ar, int shift) {
        System.out.println(shift);
        shift = shift%ar.length;
        System.out.println(shift);
        int[] temp = Arrays.copyOfRange(ar, shift, ar.length);
//        temp = temp + Arrays.copyOfRange(ar, shift, ar.length);
        System.out.println(Arrays.toString(temp));
    }
}
