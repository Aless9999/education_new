package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2a {
    public static void main(String[] args) {
        // create tree map

        TreeMap<String,Double> contributors=new TreeMap<>(new ComparatorForLastNameAndName());

        // add elements in contributors

        contributors.put("Ivan Anufriev", 250.0);
        contributors.put("Alexander Antonov", 1500.50);
        contributors.put("Matt Garrison", 2250.0);
        contributors.put("Tom Lee", 25250.0);
        contributors.put("Michael George", 135250.12);
        contributors.put("Zochan Apollo", 135250.12);

        // get set elements

        Set< Map.Entry<String,Double>> set=contributors.entrySet();

        // display elements from contributors

        for(Map.Entry<String, Double>elements:set){
            System.out.print(elements.getKey()+" --");
            System.out.println(elements.getValue());

        }
    }

}
 class ComparatorForLastNameAndName implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int k;
        int j;
        int o;
        k = o1.lastIndexOf(' ');
        j = o2.lastIndexOf(' ');
        o = o1.substring(k).compareTo(o2.substring(j));
        if (o != 0){
            return o;
        }
        return o1.compareTo(o2);
    }
}
