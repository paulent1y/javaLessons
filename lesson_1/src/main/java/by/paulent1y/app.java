package by.paulent1y;


public class app {

    /**
     * 	Напишите метод, на вход которого подается двумерный строковый массив размером 4х4. При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
     *
     * 	Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
     *
     * 	В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.
     * @param args
     */
    public static void main(String[] args) {
            testWithMatrixOfSize(4); // this one is fine
            testWithMatrixOfSize(5); // this one will throw exception
            testWithInvalidCell();
    }

    public static void testWithMatrixOfSize(int size) {
        String[][] matrix = new String[size][size];
        MatrixUtil.stringFillMatrix(matrix);
        MatrixUtil.printMatrix(matrix);
        try {
            int sum = MatrixUtil.sum4x4MatrixOnly(matrix);
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testWithInvalidCell() {
        String[][] matrix = new String[4][4];
        MatrixUtil.stringFillMatrix(matrix);
        matrix[2][2] = "hello";
        MatrixUtil.printMatrix(matrix);
        try {
            int sum = MatrixUtil.sum4x4MatrixOnly(matrix);
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}