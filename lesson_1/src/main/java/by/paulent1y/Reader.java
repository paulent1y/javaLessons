package by.paulent1y;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;

public class Reader {


    public static void readFrom(String filename) {
        String[] headers = {};
        try (FileReader file = new FileReader(filename);
             BufferedReader reader = new BufferedReader(file)) {
            headers = reader.readLine().split(",");
            HashMap<String,String> tweetData = new HashMap<>();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] l = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                for (int i = 0; i < l.length; i++) {
                    tweetData.put(headers[i], l[i]);
                }
                if (tweetData.get("reply_to").length()<5)
                System.out.println(tweetData.get("tweet"));
//                            break;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Damn boy");
        }
        printAr(headers);

    }

    public static <T> void printAr(T[] ar) {
        System.out.print("(" + ar.length + ")");
        for (int i = 0; i < ar.length; i++) {
            System.out.print("[" + i + "]" + "\"" + ar[i] + "\"");
        }
        System.out.println();
    }
}
