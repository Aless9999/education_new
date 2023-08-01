package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[]{4,86, 76, 55, 6,5};
        findDuplicateInArray(array);
    }

    private static void findDuplicateInArray(int[] array) {
        int count = 0;
        boolean result = false;
        List<Integer> list = new ArrayList<>();
        for (int element : array) {
            list.add(element);
        }
        for (int element : list) {
            count = Collections.frequency(list, element);
            if (count > 1) {
                result = true;
                System.out.println("Result: "+result);
                System.out.println("Number " + element + " repeat " + count);

                break;

            }
        }
        if (!result) {
            System.out.println("Result: "+result);
            System.out.println("No duplicates.");
        }

    }
}





