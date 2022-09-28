package by.paulent1y;

import static by.paulent1y.MatrixUtil.*;

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
            final int size = 4;
            String[][] matrix = new String[size][size];
            stringFillMatrix(matrix);
             printMatrix(matrix);
            try {
                int sum = sumAnysizeMatrix(matrix);
                System.out.println(sum);
            } catch (Exception e) {
                System.out.println(e);
            }

    }
}