package by.paulent1y;

import java.util.Arrays;
import java.util.Random;
import java.io.*;

public class app {

    static final String tweets = "elon_musk_tweets.csv";
    static final String stocks = "TSLA.csv";
    public static void main(String[] args) throws Exception {
        String f = "file.txt";

        //Writer.writeTo(f, "\nrick and morty");


        Reader.readFrom(tweets);
    }




}