package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[]{3, 8, 15, 17};
        int number = new Scanner(System.in).nextInt();

        getIndex(number, array);

    }

    private static void getIndex(int number, int[] array) {
        int[] result = new int[2];
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (flag) {
                for (int j = 1; j < array.length; j++) {
                    if (array[i] + array[j] == number) {
                        result[0] = i;
                        result[1] = j;
                        flag = false;
                        System.out.println(Arrays.toString(result));
                        break;

                    }

                }
            } else {
                break;
            }
        }
    }
}
