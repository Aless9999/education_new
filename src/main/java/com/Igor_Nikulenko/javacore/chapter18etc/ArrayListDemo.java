package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // create list array
        ArrayList<String> arrayList=new ArrayList<>();
        System.out.println("Initial size array list "+arrayList.size());

        // enter elements in array list
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add(1,"F3");

        System.out.println("Size array list after enter "+arrayList.size());

        //withdraw array list
        System.out.println("Content array list "+arrayList);

        //remove elements from array list
        arrayList.remove("D");
        arrayList.remove(2);
        //array list after remove
        System.out.println("Content array list "+arrayList);
    }
}
