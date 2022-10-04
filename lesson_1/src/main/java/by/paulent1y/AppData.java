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

    public String[] getHeaders() {
        return headers;
    }

    public void setHeaders(String[] headers) {
        this.headers = headers;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
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
