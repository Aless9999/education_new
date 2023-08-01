package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.Comparator;

public class MyComparator  implements Comparator<String> {

    public int compare(String a ,String b){
        return a.compareTo(b);
    }

}
