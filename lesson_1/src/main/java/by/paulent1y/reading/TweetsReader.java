package by.paulent1y.reading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TweetsReader {

    public static ArrayList<Tweet> readFrom(String filename) {
        System.out.println(filename);
        ArrayList<Tweet> tweetsList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine(); // skipping headers line
            while ((line = reader.readLine()) != null) {
                String[] l = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)"); //thanks to stackoverflow, helps for not taking commas inside a quotes
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                // concatenating columns with date and time and parsing them to date variable
                Date date = formatter.parse((l[3] + " " + l[4]));
                tweetsList.add(new Tweet(date, l[10], l[20]));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return tweetsList;
    }

    public static ArrayList<Tweet> readFromOld(String filename) {
        System.out.println(filename);
        ArrayList<Tweet> tweetsList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine(); // skipping headers line
            while ((line = reader.readLine()) != null) {
                String[] l = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)"); //thanks to stackoverflow, helps for not taking commas inside a quotes
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

                // concatenating columns with date and time and parsing them to date variable
                Date date = formatter.parse(l[4]);
                tweetsList.add(new Tweet(date, l[7], l[17]));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return tweetsList;
    }

}
