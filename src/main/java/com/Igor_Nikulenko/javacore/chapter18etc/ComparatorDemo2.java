package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.TreeSet;

public class ComparatorDemo2 {
    public static void main(String[] args) {
        // create tree set with comparator
        TreeSet<String> set = new TreeSet<>((o1, o2) -> o2.compareTo(o1));


        //enter elements in tree set

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("FF");
        set.add("AAA");
        System.out.println("Display content from set: ");

        for(String element:set){
            System.out.print(element+" ");
        }






    }
}
