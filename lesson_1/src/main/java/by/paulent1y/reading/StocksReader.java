package by.paulent1y.reading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class StocksReader {

    public static ArrayList<Stock> readFrom(String filename) {
        ArrayList<Stock> stocksList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine(); // skipping headers line
//            System.out.println(line);
            while ((line = reader.readLine()) != null) {
                String[] l = line.split(","); //thanks to stackoverflow, helps for not taking commas inside a quotes
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

                Date date = formatter.parse(l[0]);
                double priceIn = Double.parseDouble(l[1]);
                double priceOut = Double.parseDouble(l[4]);
                double change = stocksList.size()==0
                        ?0
                        :priceIn - stocksList.get(stocksList.size()-1).priceOut;
                stocksList.add(new Stock(date, priceIn, priceOut,change));
               // Utils.printAr(l);

            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        stocksList.sort(Comparator.naturalOrder());
        return stocksList;
    }
}
