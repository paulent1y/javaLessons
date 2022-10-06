package by.paulent1y.uniqTags;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class app {
    public static void main(String[] args) {
        Set<String> tags = new HashSet<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("lmf.txt"))){
            String l = new String();
            while ((l= reader.readLine()) != null) {
                tags.addAll(Arrays.asList(l.split(" ")));
                System.out.println(l);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(tags);
    }

}
