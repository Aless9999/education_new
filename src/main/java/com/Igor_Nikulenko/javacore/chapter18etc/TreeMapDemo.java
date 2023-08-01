package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        //create tree map
        TreeMap<String, Double> contributors = new TreeMap<>();

        // enter elements in contributors

        contributors.put("Ivan Niconov", 250.0);
        contributors.put("Alexander Pelsh", 1500.50);
        contributors.put("Matt Garrison", 2250.0);
        contributors.put("Tom Lee", 25250.0);
        contributors.put("Michael George", 135250.12);

        // get set entry

        Set<Map.Entry<String, Double>> set = contributors.entrySet();

        //display tree map contributors

        for(Map.Entry<String,Double>element:set){
            System.out.print(element.getKey()+"-");
            System.out.println(element.getValue());
        }
        System.out.println();

        //contribute 1000 to check Tom
        System.out.println("Check Tom before change: ");
        double check=contributors.get("Tom Lee");
        System.out.println(check);
        contributors.put("Tom Lee",check+1000);
        System.out.println("Check Tom after change: ");
        System.out.println(contributors.get("Tom Lee"));



    }
}
