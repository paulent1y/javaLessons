package by.paulent1y.reading;

import java.util.Date;

public class Stock extends DatedEvent{

    double priceIn;
    double priceOut;
    int amount;
    double change;
    double dayChange;
    double dayPercent;

    public Stock(Date date, double priceIn, double priceOut,  double change) {
        super(date);
        this.priceIn = priceIn;
        this.priceOut = priceOut;
        this.change = change;
        dayChange = priceOut-priceIn;
        dayPercent = (dayChange*100)/priceIn;
    }

    public String toString(){
        return simpleDate() + " " + priceIn +" " + priceOut + " " + dayChange + " " + dayPercent;
    }

    public int getDayPercent(){
        return (int)dayPercent;
    }


}
