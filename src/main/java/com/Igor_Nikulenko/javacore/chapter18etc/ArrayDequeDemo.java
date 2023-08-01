package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        // enter elements in stack array deque

        arrayDeque.push("A");
        arrayDeque.push("B");
        arrayDeque.push("C");
        arrayDeque.push("D");
        arrayDeque.push("E");

        while (arrayDeque.peek()!=null)
            System.out.println(arrayDeque.pop()+" ");

    }
}
