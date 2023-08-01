package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {

        // create properties

        Properties capitals = new Properties();

        // add elements in capital

        capitals.put("Russian", "Moscow");
        capitals.put("Francia", "Paris");
        capitals.put("England", "London");
        capitals.put("China", "Pekin");

        Set<?> country = capitals.keySet();


        for (Object city : country) {
            System.out.println("The capital of country " + city + "-" + capitals.getProperty((String) city) + ".");

        }


        String str = capitals.getProperty("Canada", "not search");

        System.out.println("The capital of country Canada " + str);


    }
}
