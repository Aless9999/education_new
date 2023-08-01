package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemoWithDefault {
    public static void main(String[] args) {
        // create properties list default

        Properties propertiesDefault = new Properties();

        // add elements default

        propertiesDefault.put("Canada", "Ottawa");
        propertiesDefault.put("Brazil", "Brasilia");


        Properties capitals = new Properties(propertiesDefault);

        capitals.put("Russian", "Moscow");
        capitals.put("Francia", "Paris");
        capitals.put("England", "London");
        capitals.put("China", "Pekin");


        Set<?>country=capitals.keySet();

        // display capitals

        for(Object name:country){
            System.out.println("Capital of country "+name+"-"+capitals.getProperty((String)name));
        }

        String str= capitals.getProperty("Canada");
        System.out.println("Capital of country Canada "+str);

    }
}
