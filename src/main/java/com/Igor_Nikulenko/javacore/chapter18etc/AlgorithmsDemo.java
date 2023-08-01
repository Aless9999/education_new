package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        // create linked list

        LinkedList<Integer> linkedList = new LinkedList<>();

        // add elements in linkedList

        linkedList.add(1);
        linkedList.add(10);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(16);
        linkedList.add(160);

        // create comparator
        Comparator<Integer> comparator = Comparator.reverseOrder();

        // use comparator
        Collections.sort(linkedList, comparator);

        System.out.println("Display linked list after sort: ");
        for (int i : linkedList) {
            System.out.print(i + " ");
        }
        System.out.println();


        Collections.shuffle(linkedList);
        System.out.println("Linked list after shuffle: ");
        for (int i : linkedList) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Min: " + Collections.min(linkedList));
        System.out.println("Max: " + Collections.max(linkedList));
    }
}
