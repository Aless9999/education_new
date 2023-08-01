package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {

        // comparator sort for lastname
        ComparatorForLastName comparatorForLastName = new ComparatorForLastName();

        // comparator sort for name after sort lastname

        Comparator<String> comparator = comparatorForLastName.thenComparing(new ComparatorForName());
        //create tree map with comparator thenComparing

        TreeMap<String, Double> contributors = new TreeMap<>(comparator);

        // enter elements in contributors

        contributors.put("Ivan Anufriev", 250.0);
        contributors.put("Alexander Antonov", 1500.50);
        contributors.put("Matt Garrison", 2250.0);
        contributors.put("Tom Lee", 25250.0);
        contributors.put("Michael George", 135250.12);
        contributors.put("Zochan Apollo", 135250.12);
        contributors.put("Alexander Anufriev", 135250.12);

        // get set
        Set<Map.Entry<String, Double>> set = contributors.entrySet();

        //display content from contributors

        for (Map.Entry element : set) {
            System.out.print(element.getKey() + " ---- ");
            System.out.println(element.getValue());

        }


    }
}
class ComparatorForLastName implements Comparator<String> {


    public int compare(String o1, String o2) {
        int i, j;
        i = o1.lastIndexOf(' ');
        j = o2.lastIndexOf(' ');
        return o1.substring(i).compareTo(o2.substring(j));
    }
}

 class ComparatorForName implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
