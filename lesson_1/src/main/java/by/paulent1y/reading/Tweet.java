package by.paulent1y.reading;

import java.util.Date;

public class Tweet extends DatedEvent{

    String text;
    String link;
    public Tweet(Date date, String text, String link) {
        super(date);
        this.text = text;
        this.link = link;
    }

    public String toString(){
        return simpleDate() + " " + text + " " + link;
    }
}
