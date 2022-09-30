package by.paulent1y;

import java.util.Arrays;
import java.util.Random;
import java.io.*;

public class app {

    static final String tweets = "elon_musk_tweets.csv";
    static final String stocks = "TSLA.csv";
    public static void main(String[] args) throws Exception {
        String f = "file.txt";

        writeTo(f, "\nrick and morty");


        readFrom(tweets);
    }

    public static void readFrom(String filename) {
        try (FileReader file = new FileReader(filename);
             BufferedReader reader = new BufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Damn boy");
        }
    }

    public static void writeTo(String filename, String text) {
        try (FileWriter file = new FileWriter(filename, true);
             BufferedWriter writer = new BufferedWriter(file)) {
            writer.append(text);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Damn boy");
        }
    }
}