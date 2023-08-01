package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.io.*;
import java.util.Properties;

public class PhoneBook {

    public static void main(String[] args) throws IOException {
        Properties basePhoneBook = new Properties();

        BufferedReader br = new BufferedReader
                (new InputStreamReader(System.in));
        String name, number;

        FileInputStream fil = null;
        boolean changed = false;

        try {
            fil = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try{
            if(fil!=null){
                basePhoneBook.load(fil);
                fil.close();
            }

    } catch (IOException e) {
            throw new RuntimeException(e);
        }


    do {
        System.out.println("Enter the name:");
        name = br.readLine();
        System.out.println("Enter the number:");
        number = br.readLine();
        basePhoneBook.put(name, number);
        changed = true;
    }while (!name.equals("Close"));

        FileOutputStream  out = new  FileOutputStream("phonebook.dat");
        basePhoneBook.store(out,  "PhoneBook");
        out.close();

        do  {
            System.out.println("Enter the name for search: ");
            name  =  br.readLine();

            number =  (String)  basePhoneBook.get(name);
            System.out.println(number);

        }while (!name.equals("Close"));
        }}
