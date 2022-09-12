package by.paulent1y;

public class ArrayCustomFiller {

    public int[] getArrayOf (int len, int initialValue){
        int[] result = new int[len];
        for (int i=0; i<len; i++) result[i] = initialValue;
        return result;
    }
}
