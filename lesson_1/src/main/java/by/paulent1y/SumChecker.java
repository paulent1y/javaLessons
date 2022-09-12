package by.paulent1y;

public class SumChecker {
    public boolean checkSum(int a, int b) {
        //checks if sum in bounds (10,20]
        int c = a+b;
        if (c > 10 && c <= 20) return true;
        return false;
    }
}
