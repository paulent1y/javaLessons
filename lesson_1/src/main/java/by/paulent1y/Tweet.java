package by.paulent1y;

import java.util.Date;

public class Tweet extends DatedEvent{

    String text;

    public Tweet(Date date, String text) {
        super(date);
        this.text = text;
    }
}
