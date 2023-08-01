package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        // create tree set
        TreeSet<String> treeSet = new TreeSet<>(new MyComparator());

        // enter elements in tree set
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("D");
        treeSet.add("E");
        treeSet.add("F");

        // display content from tree set

        for (String element : treeSet) {
            System.out.print(element+" ");
        }
    }
}
