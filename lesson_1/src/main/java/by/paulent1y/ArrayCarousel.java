package by.paulent1y;

import java.util.Arrays;

public class ArrayCarousel {

    public void shiftArray(int[] ar, int shift) {
        if (ar == null || ar.length == 0) {
            System.out.println("Array " + Arrays.toString(ar) + " is incorrect");
            return;
        }


        System.out.println("Initial: \t" + Arrays.toString(ar));
        if (shift<0) shiftBackward(ar, -shift);
        else shiftForward(ar, shift);
        System.out.println("Shifted " + shift + ":\t" + Arrays.toString(ar));
    }

    private void shiftBackward(int[] ar, int shift) {
        while (shift!=0){
            shift--;
            int temp=ar[0];
            for (int i=0; i<ar.length-1; i++){
                ar[i] = ar[i+1];
            }
            ar[ar.length-1] = temp;
        }
    }
    private void shiftForward(int[] ar, int shift) {
        while (shift!=0){
//            System.out.println("shift: " + shift + " arr: " + Arrays.toString(ar));
            shift--;
            int temp=ar[ar.length-1];
            for (int i=ar.length-1; i>0; i--){
                ar[i] = ar[i-1];
            }
            ar[0] = temp;
        }
    }
}
