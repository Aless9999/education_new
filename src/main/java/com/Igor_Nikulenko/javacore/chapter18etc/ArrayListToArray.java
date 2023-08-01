package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {
        //create list array
        ArrayList<Integer> arrayList = new ArrayList<>();
        //enter elements in array list
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);



        System.out.println("Content array list " + arrayList);

        //create array
        Integer[] array = new Integer[arrayList.size()];

        //convert array list to array

        array=arrayList.toArray(array);
        int sum=0;
        for (Integer ar:array) {
            sum+=ar;

        }
        System.out.println("Sum "+sum);

    }

}
