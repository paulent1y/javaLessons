package by.paulent1y;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class app {

    public static void main(String[] args) throws Exception {

        AppData ad2 = new AppData();
        ad2.readFrom("generated.txt");
        System.out.println("Read data from file");
        System.out.println(ad2);
        ad2.writeTo("fromRead.txt");

        String[] headers = {"History", "Math", "Chemistry", "Physics"};
        AppData ad = new AppData(headers);
        ad.buildRandomData(headers.length,10);
        ad.writeTo("generated.txt");
        System.out.println("Written generated data to file");
        System.out.println(ad);


    }




}