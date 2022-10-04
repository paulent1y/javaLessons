package by.paulent1y;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class app {

    public static void main(String[] args) {
        String[] headers = {"History", "Math", "Chemistry", "Physics"};
        AppData ad2 = new AppData();
        AppData ad = new AppData(headers);

        if (new File("generated.txt").exists()) {
            load("generated.txt", ad2);
            System.out.println("Read data from file\n" + ad2);
            save("fromRead.txt", ad2);
        }

        save("generated.txt", ad);
        System.out.println("Written generated data to file");
        System.out.println(ad);
    }

    public static void load (String filename, AppData data){
        String line;
        int index=0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            data.setHeaders(reader.readLine().split(";"));
            int[][] vals = new int[Files.readAllLines(Path.of(filename)).size() - 1][];
            while ((line = reader.readLine()) != null) {
                vals[index++] = fillDataRow(line);
            }
            data.setData(vals);

        } catch (Exception e) {
            System.out.println("Error in loading from file " + e);
        }
    }

    public static int[] fillDataRow(String line) {
        String[] strValues = line.split(";");
        int[] intValues = new int[strValues.length];
        for (int i = 0; i < strValues.length; i++)
            intValues[i] = Integer.parseInt(strValues[i]);
        return intValues;
    }

    public static void save (String filename, AppData data){
        if (data.getHeaders() == null || data.getData() == null) {
            System.out.println((data.getHeaders() == null)
                    ? "headers is null, please fill or read it from file"
                    : "data is null, please buildRandomData(), fill or read from file");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.append(data.toString());
        } catch (Exception e) {
            System.out.println("Error in writing to file " + e);
        }
    }






}