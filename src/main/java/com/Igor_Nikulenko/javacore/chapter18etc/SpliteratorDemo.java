package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();

        //enter elements in array list

        arrayList.add(1.0);
        arrayList.add(2.0);
        arrayList.add(3.0);
        arrayList.add(4.0);
        arrayList.add(5.0);
        arrayList.add(6.0);

        System.out.println("Display content array list with tryAdvance(): ");
        Spliterator<Double> splitter = arrayList.spliterator();

        while (splitter.tryAdvance(n ->
                System.out.println(n))) ;

        //create new array list containing sqrt from arrayList

        splitter = arrayList.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();


        while (splitter.tryAdvance(n -> sqrs.add(Math.sqrt(n)))) ;

        Spliterator<Double> spliterator = sqrs.spliterator();

        System.out.println("Display content from sqrs list with forEachRemaining: ");
        spliterator.forEachRemaining(n ->
                System.out.println(n));


    }
}
