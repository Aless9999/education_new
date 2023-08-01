package main.java.com.Igor_Nikulenko.javacore.chapter18etc;

public class Address {
    private String name;
    private String state;
    private String city;
    private String code;

    public Address(String name, String state, String city, String code) {
        this.name = name;
        this.state = state;
        this.city = city;
        this.code = code;
    }

    @Override
    public String toString() {
        return "" +
                name + '\n' +
                state + '\n' +
                city + '\n' +
                code + '\''
                ;
    }
}
