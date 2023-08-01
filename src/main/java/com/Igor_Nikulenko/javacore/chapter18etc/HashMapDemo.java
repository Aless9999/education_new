package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        // create hash map
        HashMap<String, Double> contributors = new HashMap<>();

        // enter contributors in hash map

        contributors.put("Ivan", 250.0);
        contributors.put("Alexander", 1500.50);
        contributors.put("Matt", 2250.0);
        contributors.put("Tom", 25250.0);
        contributors.put("Michael", 135250.12);

        //get set entry
        Set<Map.Entry<String, Double>> entrySet = contributors.entrySet();

        //display hash map contributors


        for (Map.Entry<String, Double> element : entrySet) {
            System.out.print(element.getKey()+" - ");
            System.out.println(element.getValue());

        }

        //change value
        System.out.println("Check Michael before change check: ");
        System.out.println(contributors.get("Michael"));

        double check = contributors.get("Michael");
        contributors.put("Michael", check + 125);

        System.out.println("Check Michael after change check: ");
        System.out.println(contributors.get("Michael"));

    }
}
