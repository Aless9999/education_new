package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {3, 8, 15, 17};
        int number = 25;

        getIndex(number, array);

    }

    private static void getIndex(int number, int[] array) {
        int[] result = new int[2];
        List<Integer> integerList = new ArrayList<>();
        for (int elem : array) {
            integerList.add(elem);
        }

        for (int i = 0; i < integerList.size(); i++) {
            int current = number - integerList.get(i);
            if (integerList.contains(current)) {
                result[0] = i;
                result[1] = integerList.indexOf(current);
                break;
            }

        }
        System.out.println(Arrays.toString(result));
    }
}
