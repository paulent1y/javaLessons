package by.paulent1y;

import java.util.Arrays;

public class MatrixFiller {

    public void fillMatrixDiagonals () {
        final int size = 9;
        int[][] matrix = new int[size][size];
        for (int i=0; i<size; i++)
            for (int j=0; j<size; j++){
                if (i==j || size-i-1 == j) matrix[i][j] = 1;
            }

        printMatrix(matrix);
    }

    public void printMatrix (int[][] matrix) {

        for (int i=0; i<matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
