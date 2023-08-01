package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.*;

public class EducationDemo {
    public static void main(String[] args) {

        Comparator<String> comparator = ((o1, o2) -> {
            return
                    o1.substring(o1.lastIndexOf(' '))
                            .compareTo(o2.substring(o2.lastIndexOf(' ')));

        });

        Comparator<String>comparatorThen=comparator.thenComparing((o1, o2) ->o1.compareTo(o2) );

        TreeMap<String, Double> contributors = new TreeMap<>(comparatorThen);


        contributors.put("Ivan Anufriev", 250.0);
        contributors.put("Alexander Antonov", 1500.50);
        contributors.put("Matt Garrison", 2250.0);
        contributors.put("Tom Lee", 25250.0);
        contributors.put("Michael George", 135250.12);
        contributors.put("Zochan Apollo", 135250.12);



        Set<Map.Entry<String, Double>> set = contributors.entrySet();

        for (Map.Entry<String, Double> element : set) {
            System.out.print(element.getKey() + " - ");
            System.out.println(element.getValue());
        }
    }


}



