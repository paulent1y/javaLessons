package by.paulent1y.uniqTags;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.Map.Entry;

public class app {
    public static void main(String[] args) {
        List<String> allTags = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("lmf.txt"))){
            String l;
            while ((l= reader.readLine()) != null) {
                allTags.addAll(Arrays.asList(l.split(" ")));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        Set<String> tags = new HashSet<>(allTags);
        Map<String, Integer> tagsRepeated = new HashMap<>();
        for (String s:tags){
            tagsRepeated.put(s, Collections.frequency(allTags, s));
        }
        Map<String, Integer> sortedTags= sortByValue(tagsRepeated);
        for (Entry<String, Integer> pair: sortedTags.entrySet()) {
            if (pair.getValue()>1)
            System.out.println(pair.getKey());
        }
    }

    public static <K, V extends Integer> Map<K, V> sortByValue(Map<K, V> map) {
        List<Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.comparingByValue(Comparator.reverseOrder()));
        Map<K, V> result = new LinkedHashMap<>();
        for (Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

}
