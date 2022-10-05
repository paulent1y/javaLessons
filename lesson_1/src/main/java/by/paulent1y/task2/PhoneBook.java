package by.paulent1y.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public HashMap<String, ArrayList<String>> data;

    public PhoneBook() {
        data = new HashMap<>();
    }

    public void add(String name, String number){
        if (number.length() < 5) {
            System.out.println("Number must be at least 6 digits long");
            return;
        }
        if (data.containsKey(name)) {
            ArrayList<String> nums = data.get(name);
            nums.add(number);
        }
        else {
            data.put(name, new ArrayList<>());
            data.get(name).add(number);

        }
    }

    public void add(String name, int number){
        add(name, "+" + String.valueOf(number));
    }

    public void get(String name){
        if (!data.containsKey(name)) {
            System.out.println("No such users in phonebook");
            return;
        }
        ArrayList<String> nums = data.get(name);
        for(String s: nums)
            System.out.println("Contact: " + name + " Number: " + s);
    }
}
