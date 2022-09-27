package by.paulent1y.array_swap;

public class CustomClass {
    static int counter = 0;
    int id;

    public CustomClass() {
        id = counter++;
    }

    public String toString() {
        return "CustomObject" + id;
    }
}
