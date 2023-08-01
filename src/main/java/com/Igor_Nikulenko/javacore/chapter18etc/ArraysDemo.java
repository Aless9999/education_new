package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        // create massive

        int array[] = new int[10];
        // add elements in array

        for (int i = 0; i < array.length; i++) {
            array[i] = i * -3;
        }
        // display content in array
        System.out.println("Content array: ");
        display(array);
        System.out.println();


        //array sort

        Arrays.sort(array);
        System.out.println();
        System.out.println("Display array after sort: ");
        display(array);
        System.out.println();
        System.out.println();


        // enter elements and display content

        Arrays.fill(array, 2, 6, -1);
        System.out.println("Display array after method fill(): ");
        display(array);
        System.out.println();
        System.out.println();


        System.out.println("Display array after sort: ");
        Arrays.sort(array);
        display(array);

        System.out.println();
        System.out.println();
        System.out.println("Do a binary search number -9: ");
        int index=Arrays.binarySearch(array,-9);
        System.out.println("Number -9 be in position "+index);
        

    }


    private static void display(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
