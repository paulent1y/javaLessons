package by.paulent1y;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

public class AppData {
    private String[] headers;

    private int[][] data;

    public AppData(String[] headers, int[][] data) {
        this.headers = headers;
        this.data = data;
    }

    public AppData(String[] headers) {
        this.headers = headers;
        buildRandomData(headers.length, 10);
    }

    public AppData() {
    }

    public void buildRandomData(int columns, int rows) {

        data = new int[rows][columns];
        Random r = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = r.nextInt(100);
            }
        }
    }

    public void readFrom(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            String l = reader.readLine();
            headers = l.split(";");
            int rows = Files.readAllLines(Path.of(filename)).size() - 1;
            data = new int[rows][];
            int i = 0;
            while ((l = reader.readLine()) != null) {
                data[i++] = fillDataRow(l);
            }

        } catch (Exception e) {
            System.out.println("Error in writing" + e);
        }
        System.out.println("Read successfully");
    }

    public int[] fillDataRow(String line) {
        String[] vals = line.split(";");
        int[] valsInt = new int[vals.length];
        for (int i = 0; i < vals.length; i++)
            valsInt[i] = Integer.parseInt(vals[i]);
        return valsInt;
    }

    public boolean writeTo(String filename) {
        if (headers == null || data == null) {
            System.out.println((headers == null)
                    ? "headers is null, please fill or read it from file"
                    : "data is null, please buildRandomData(), fill or read from file");
            return false;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {

            writer.append(toString());
        } catch (Exception e) {
            System.out.println("Error in writing");
            System.out.println(e);
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (headers != null) {
            for (String header : headers) {
                sb.append(header).append(";");
            }
            sb.deleteCharAt(sb.length() - 1).append("\n");
        }
        if (data != null) {
            for (int[] row : data) {
                for (int cell : row) {
                    sb.append(Integer.toString(cell)).append(";");
                }
                sb.deleteCharAt(sb.length() - 1).append("\n");
            }
        }
        return sb.toString();
    }
}
