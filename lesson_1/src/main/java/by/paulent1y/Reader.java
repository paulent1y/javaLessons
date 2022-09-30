package by.paulent1y;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Reader {

    public static void readFrom(String filename) {
        try (FileReader file = new FileReader(filename);
             BufferedReader reader = new BufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] l = line.split(",");
//                System.out.println(l[10] + " " + l[11]);
                System.out.println(Arrays.toString(l));
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Damn boy");
        }
    }
}
