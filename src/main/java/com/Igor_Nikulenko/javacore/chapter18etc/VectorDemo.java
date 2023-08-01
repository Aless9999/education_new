package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        // create vector size 3 increment 2
        Vector<Integer> vector = new Vector<>(3, 2);

        System.out.println("Start size vector "+vector.size());
        System.out.println("Start capacity vector "+vector.capacity());

        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);


        System.out.println("Capacity vector after enter four elements "+vector.capacity());

        vector.addElement(5);

        System.out.println("Capacity vector after enter five elements "+vector.capacity());

        vector.addElement(6);
        vector.addElement(7);
        System.out.println("Capacity vector "+vector.capacity());

        vector.addElement(9);
        vector.addElement(10);
        System.out.println("Capacity vector "+vector.capacity());

        vector.addElement(11);
        vector.addElement(12);

        System.out.println("Fist element from vector "+vector.firstElement());

        System.out.println("Last element from vector "+vector.lastElement());

        if(vector.contains(3))
            System.out.println("Vector contains 3");

        Enumeration<Integer>enumeration= vector.elements();

        System.out.println("Content vector ");
        while(enumeration.hasMoreElements()){
            System.out.print(enumeration.nextElement()+" ");

        }
        System.out.println();
        System.out.println();

        Iterator<Integer>iterator= vector.iterator();

        System.out.println("Display vector with iterator ");

        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Display vector with foreach ");

        for(int element:vector){
            System.out.print(element + " ");
        }

    }


}
