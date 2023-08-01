package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.Enumeration;
import java.util.Hashtable;

public class HTDemo {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();

        Enumeration<String> names;

        String str;
        Double bal;

        balance.put("Ivan Niconov", 250.0);
        balance.put("Alexander Pelsh", 1500.50);
        balance.put("Matt Garrison", 2250.0);
        balance.put("Tom Lee", 25250.0);
        balance.put("Michael George", 135250.12);

        // display from balance
        names = balance.keys();
        while (names.hasMoreElements()) {
            str = names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();
        // enter 1000 to check Tom Lee ");
        bal = balance.get("Tom Lee");
        balance.put("Tom Lee", bal + 1000);

        System.out.println("Display check Tom Lee after enter ");
        System.out.println(balance.get("Tom Lee"));


    }

}
