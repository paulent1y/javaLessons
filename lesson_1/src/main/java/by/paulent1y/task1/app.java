package by.paulent1y.task1;

import java.util.*;

public class app {

    /*
    Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).


    */
    public static void main(String[] args) {
        String[] allWords = {"follow","crazy","bubble","orange","crash","whole","loss","oval","rapid","magical","trade","property"};
        Random r = new Random();


        //working with List interface
        //Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        final int WORDS_NUM = 20;
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < WORDS_NUM; i++) {
            words.add(allWords[r.nextInt(allWords.length)]);
        }
        System.out.println(words);

        //working with Set interface
        //Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        Set<String> uniqWords = new HashSet<>(words);
        System.out.println("List of unique words:");
        System.out.println(uniqWords);

        //working with Map interface
        //Посчитать, сколько раз встречается каждое слово.
        Map<String, Integer> repeats = new HashMap<>();
        for (String word: words){
            if (repeats.containsKey(word))
                repeats.put(word, repeats.get(word)+1);
            else
                repeats.put(word, 1);
        }
        System.out.println(repeats);
    }

}

