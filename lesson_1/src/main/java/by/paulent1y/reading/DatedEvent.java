package by.paulent1y.reading;

import java.util.Date;

public class DatedEvent implements Comparable<DatedEvent> {
    public Date date;
    public long unixDate;

    public DatedEvent (Date date) {
        this.date = date;
        unixDate = date.getTime();
    }

    public int compareTo(DatedEvent d){
        return Long.compare(unixDate, d.unixDate);
    }

    public String simpleDate() {
        return date.getDate() + "." + (date.getMonth()+1) + "." + (date.getYear() + 1900);
    }
}
