package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        // enter elements in hashSet

        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("F");
        System.out.println("Content hashSet " + hashSet);
    }
}
