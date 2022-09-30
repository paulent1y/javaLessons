package by.paulent1y;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Writer {

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
