package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.EmptyStackException;
import java.util.Stack;

public class ClassStackDemo {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();

        showpush(st,42);
        showpush(st,66);
        showpush(st,99);
        showpop(st);
        showpop(st);
        showpop(st);

        try {showpop(st);
        }catch(EmptyStackException e){
            System.out.println("Stack is empty");
        }

    }
    public static void showpush(Stack<Integer>st,int a){
        st.push(a);
        System.out.println("push("+a+")");
        System.out.println("stack: "+st);
    }

    public static void showpop(Stack<Integer>st){
        System.out.println("pop->");
        Integer a = st.pop();
        System.out.println(a);
        System.out.println("stack "+st);
    }

}
