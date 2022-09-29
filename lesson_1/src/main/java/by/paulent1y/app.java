package by.paulent1y;


public class app {

    public static void main(String[] args) {
            testWithMatrixOfSize(4); // this one is fine
            testWithMatrixOfSize(5); // this one will throw exception
            testWithInvalidCell(4); // here cell was changed and it will throw second exception
            testWithoutMatrixSizeLimit(50);
    }

    public static void testWithMatrixOfSize(int size) {
        String[][] matrix = new String[size][size];
        MatrixUtil.stringFillMatrix(matrix);
        MatrixUtil.printMatrix(matrix);
        try {
            int sum = MatrixUtil.sum4x4MatrixOnly(matrix);
            System.out.println("Sum of all elements: " + sum);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testWithInvalidCell(int size) {
        String[][] matrix = new String[size][size];
        MatrixUtil.stringFillMatrix(matrix);
        matrix[2][2] = "hello";
        MatrixUtil.printMatrix(matrix);
        try {
            int sum = MatrixUtil.sum4x4MatrixOnly(matrix);
            System.out.println("Sum of all elements: " + sum);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testWithoutMatrixSizeLimit(int size) {
        System.out.println("\nMatrix of size " + size);
        String[][] matrix = new String[size][size];
        MatrixUtil.stringFillMatrix(matrix);
//        MatrixUtil.printMatrix(matrix); // may be too big in console view
        try {
            int sum = MatrixUtil.sumAnysizeMatrix(matrix); // method for calculating sum regardless of its size
            System.out.println("Sum of all elements: " + sum);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}