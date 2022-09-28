package by.paulent1y.plots;

public class Point {
    double x;
    double y;
    static double width = 3;

    public Point (double xAndy){
        this(xAndy, xAndy, 2);
    }

    public Point (double _x, double _y){
        x = _x;
        y = _y;
    }

    public Point(double _x, double _y, double _width){
        this(_x, _y);
        setWidth(_width);
    }

    public static void setWidth(double w){
        width = w;
    }
}
