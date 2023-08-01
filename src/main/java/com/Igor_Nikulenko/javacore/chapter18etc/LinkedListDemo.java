package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //create Linked list
        LinkedList<String> linkedList = new LinkedList<>();

        //enter elements to linked list

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("F");
        linkedList.addLast("A");
        linkedList.addFirst("Z");
        linkedList.add(1, "U");
        System.out.println("Content linked list " + linkedList);

        //remove to linked list

        linkedList.remove("F");
        linkedList.remove(3);

        System.out.println("Content linked list after remove " + linkedList);

        //remove first and last elements

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Content linked list after remove first and last elements " + linkedList);

        //get and set value

       String val= linkedList.get(2);
        linkedList.set(2,"X");
        System.out.println("Content linked list after get "+val+" and set value "+linkedList);
    }
}
