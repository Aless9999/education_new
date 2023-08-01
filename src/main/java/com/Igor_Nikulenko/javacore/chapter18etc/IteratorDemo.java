package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        //create array list
        ArrayList<String> arrayList = new ArrayList<>();

        //enter elements in array list

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");

        // use iterator for content output
        System.out.println("Initial content array list: ");
        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }

        //modify object

        ListIterator<String> listIterator = arrayList.listIterator();

        while (listIterator.hasNext()) {
            String element = listIterator.next();
            listIterator.set(element + "+");

        }
        System.out.println();

        System.out.println("Modify state array list: ");

        iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Display content reverse order: ");

        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.print(element + " ");
        }

    }

}
