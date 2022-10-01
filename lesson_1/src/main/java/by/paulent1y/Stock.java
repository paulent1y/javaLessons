package by.paulent1y;

import java.util.Date;

public class Stock extends DatedEvent{

    float priceIn;
    float priceOut;
    int amount;
    float change;

    public Stock(Date date, float priceIn, float priceOut, int amount, float change) {
        super(date);
        this.priceIn = priceIn;
        this.priceOut = priceOut;
        this.amount = amount;
        this.change = change;
    }

    public Stock(Date date, float priceIn){
        this(date, priceIn, 0,0,0);
    }
}
