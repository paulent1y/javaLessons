package by.paulent1y.reading;

import java.util.*;

public class app {

    static final String tweetsFile22 = "tweets/2022.csv";
    static final String tweetsFile21 = "tweets/2021.csv";
    static final String tweetsFile20 = "tweets/2020.csv";
    static final String[] allTweets = {"tweets/2012.csv","tweets/2013.csv","tweets/2014.csv","tweets/2015.csv","tweets/2016.csv","tweets/2017.csv","tweets/2018.csv","tweets/2019.csv","tweets/2020.csv","tweets/2021.csv","tweets/2022.csv"};
    static final String teslaStocksFile = "TSLA.csv";
    static final String dogeStocksFile = "DOGE-USD.csv";

    public static void main(String[] args) throws Exception {
        String f = "file.txt";

        //Writer.writeTo(f, "\nrick and morty");
        ArrayList<Tweet> tweets = new ArrayList<>();
        tweets.addAll(TweetsReader.readFrom(tweetsFile22));
        tweets.addAll(TweetsReader.readFrom(tweetsFile21));
        tweets.addAll(TweetsReader.readFromOld(tweetsFile20));
        tweets.sort(Comparator.reverseOrder());

        ArrayList<Stock>  teslaStocks = StocksReader.readFrom(teslaStocksFile);
        Collections.sort(teslaStocks, Comparator.comparing(Stock::getDayPercent));

        ArrayList<Stock>  dogeStocks = StocksReader.readFrom(dogeStocksFile);
        Collections.sort(dogeStocks, Comparator.comparing(Stock::getDayPercent));


        System.out.println(tweets.get(0));
        System.out.println(tweets.get(tweets.size()-1));
        System.out.println(tweets.size());

        System.out.println(teslaStocks.get(0));
        System.out.println(teslaStocks.get(teslaStocks.size()-1));
        System.out.println(teslaStocks.size());

        System.out.println(dogeStocks.get(0));
        System.out.println(dogeStocks.get(dogeStocks.size()-1));
        System.out.println(dogeStocks.size());

    }




}