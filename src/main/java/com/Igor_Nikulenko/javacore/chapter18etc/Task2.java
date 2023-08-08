package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {4, 86, 76, 55, 6, 5};


        System.out.println(findDuplicateInArray(array));


    }

    public static boolean findDuplicateInArray(int[] array) {
        Set<Integer> integerSet = new HashSet<>();
        for (int element : array) {
            integerSet.add(element);
        }
        if (array.length == integerSet.size()) {
            return false;
        } else {
            return true;
        }
    }
}





