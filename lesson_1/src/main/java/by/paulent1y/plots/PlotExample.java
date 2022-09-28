package by.paulent1y.plots;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

//Extends JPanel class
public class PlotExample extends JPanel{
    //initialize coordinates
    double[] cord = {61318.957031,57005.425781,46306.445313,38483.125000,43193.234375,45538.675781,37714.875000,31792.310547,19784.726563,23336.896484,20049.763672,19110.546875,18919.269531};
    int marg = 20;

    protected void paintComponent(Graphics grf){
        //create instance of the Graphics to use its methods
        super.paintComponent(grf);
        Graphics2D graph = (Graphics2D)grf;

        //Sets the value of a single preference for the rendering algorithms.
        graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // get width and height
        int width = getWidth();
        int height = getHeight();

        // draw graph
        graph.draw(new Line2D.Double(marg, marg, marg, height-marg));
        graph.draw(new Line2D.Double(marg, height-marg, width-marg, height-marg));

        //find value of x and scale to plot points
        double x = (double)(width-2*marg)/(cord.length-1);
        double scale = (double)(height-2*marg)/getMax();

        //set color for points
        graph.setPaint(Color.RED);
        Point start = null;
        Point.setWidth(3);
        // set points to the graph
        for(int i=0; i<cord.length; i++){
            Point p = new Point(marg+i*x,height-marg-scale*cord[i]);
            graph.fill(new Ellipse2D.Double(p.x, p.y, p.width, p.width));
            if (start != null)
            graph.drawLine((int) start.x, (int) start.y, (int) p.x, (int) p.y);
            start = p;
        }
    }

    //create getMax() method to find maximum value
    private double getMax(){
        double max = -Integer.MAX_VALUE;
        for(int i=0; i<cord.length; i++){
            if(cord[i]>max)
                max = cord[i];

        }
        return max;
    }

}