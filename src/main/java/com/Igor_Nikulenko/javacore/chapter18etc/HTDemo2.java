package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HTDemo2 {
    public static void main(String[] args) {
        // create hashtable

        Hashtable<String, Double> balance = new Hashtable<>();

        // add object in balance

        balance.put("Ivan Niconov", 250.0);
        balance.put("Alexander Pelsh", 1500.50);
        balance.put("Matt Garrison", 2250.0);
        balance.put("Tom Lee", 25250.0);
        balance.put("Michael George", 135250.12);
        //get set object

        Set<Map.Entry<String, Double>> set = balance.entrySet();


        // display balance
        for (Map.Entry<String, Double> element : set) {
            System.out.print(element.getKey() + "-");
            System.out.println((element.getValue()));
            System.out.println();

        }
    }


}
