package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        //create array list
        ArrayList<Integer> arrayList = new ArrayList<>();

        //enter elements in array list

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);

        System.out.println("Display content array list: ");
        for (Integer element : arrayList) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Display sum content array list: ");
        int sum = 0;
        for (Integer element : arrayList) {
            sum += element;
        }
        System.out.println(sum);
    }
}
