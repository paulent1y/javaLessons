package by.paulent1y;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
       final boolean runTests = true;


        if (runTests) {
            System.out.println("task 1");
            SumChecker s = new SumChecker();
            System.out.println(s.checkSum(1, 1));
            System.out.println(s.checkSum(1, 9));
            System.out.println(s.checkSum(1, 10));
            System.out.println(s.checkSum(10, 10));
            System.out.println(s.checkSum(1, 20));
            //2
            System.out.println("task 2");
            IntClassifier ic = new IntClassifier();
            ic.recognizeIntSign(-1);
            ic.recognizeIntSign(0);
            ic.recognizeIntSign(1);

            //3
            System.out.println("task 3");
            IntClassifierSimplified is = new IntClassifierSimplified();
            is.isNegative(-1);
            is.isNegative(0);
            is.isNegative(1);

            //4
            System.out.println("task 4");
            StringRepeater sr = new StringRepeater();
            sr.repeatString("Wabba lubba dub dub", 3);
            sr.repeatString("Brown fox jumps over someone i dont remember", 1);
            sr.repeatString("literally nothing", 0);

            //*
            System.out.println("task *");
            YearRecognizer yr = new YearRecognizer();
            int[] notLeap = {1700, 1800, 1900, 2100, 2001, 2007};
            int[] leapCoz400 = {800,1200,1600, 2000, 2400};
            int[] leapCoz4 = {2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028};
            for (int year : notLeap) System.out.println(year + " is leap " + yr.isLeapYear(year));
            for (int year : leapCoz4) System.out.println(year + " is leap " + yr.isLeapYear(year));
            for (int year : leapCoz400) System.out.println(year + " is leap " + yr.isLeapYear(year));

            //5
            System.out.println("task 5");
            BinaryArrayReverser br = new BinaryArrayReverser();
            br.reverseArray();

            //6
            System.out.println("task 6");
            ArraySequentalFiller asf = new ArraySequentalFiller();
            asf.fillArray();

            //7
            System.out.println("task 7");
            ArrayValuesDecreaser ard = new ArrayValuesDecreaser();
            ard.decreaseExample();

            System.out.println("task 8");
            MatrixFiller mf = new MatrixFiller();
            mf.fillMatrixDiagonals();

            System.out.println("task 9");
            ArrayCustomFiller acf = new ArrayCustomFiller();
            System.out.println(Arrays.toString(acf.getArrayOf(10, 999)));
            System.out.println(Arrays.toString(acf.getArrayOf(1, 1)));
            System.out.println(Arrays.toString(acf.getArrayOf(0, 20)));

            System.out.println("task ***");
            ArrayCarousel ac = new ArrayCarousel();
            ac.shiftArray(new int[]  {1,2,3,4}, 2);

        }
    }


}
