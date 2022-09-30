package by.paulent1y;

import java.util.ArrayList;
import java.util.Date;

public class TweetsData {
    ArrayList<Tweet> tweets;
    private class Tweet{
        Date date;
        String text;

        public Tweet(Date _date, String _text){
            date = _date;
            text = _text;
        }
    }


    public TweetsData() {

    }
}
