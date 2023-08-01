package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String>treeSet=new TreeSet<>();

        //enter elements in treeSet
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("D");
        treeSet.add("E");

        System.out.println("Contents in treeSet "+treeSet);
    }
}
