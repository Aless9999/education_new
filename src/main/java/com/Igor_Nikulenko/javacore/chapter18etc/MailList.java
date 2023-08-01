package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;

public class MailList {
    public static void main(String[] args) {
        LinkedList<Address>linkedList=new LinkedList<>();
        linkedList.add(new Address("Martin","Texas","Grodno","1548"));
        linkedList.add(new Address("Matty","Texas","Belfast","25648"));
        linkedList.add(new Address("Leon","Texas","Toronto","31548"));
        //Display list
        for(Address element:linkedList){
            System.out.println(element+"\n");
        }

    }

}
