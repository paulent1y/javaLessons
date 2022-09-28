package by.paulent1y;

import java.util.Arrays;
import java.util.Random;

public class MatrixUtil {

    public static void stringFillMatrix(String[][] m) {
        Random r = new Random();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                int value = r.nextInt(101)-50;
                m[i][j] = String.valueOf(value);
            }
        }
    }

    public static <T> void printMatrix(T[][] m) {
        for (T[] line : m) System.out.println(Arrays.toString(line));
    }

    public static <T> int sum4x4MatrixOnly(T[][] m) throws MyArraySizeException, MyArrayDataException {
        if (m.length != 4 || m[0].length != 4)
            throw new MyArraySizeException(
                    "Provided matrix is" + m.length + "x" + m[0].length + " instead of 4x4");

        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                try {
                    sum+= Integer.parseInt((String)m[i][j]);
                }
                catch (Exception e){
                    throw new MyArrayDataException("Wrong data in a matrix cell");
                }

            }
        }
        return sum;
    }

    public static <T> int sumAnysizeMatrix(T[][] m) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                try {
                    sum+= Integer.parseInt((String)m[i][j]);
                }
                catch (Exception e){
                    throw new MyArrayDataException("Wrong data in a matrix cell");
                }

            }
        }
        return sum;
    }
}