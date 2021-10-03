package com.company;

import java.util.Locale;

public class strings {
    public static void main(String[] args) {
        String message = "hello world"+"!!";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("h"));
        System.out.println(message.indexOf("e"));
        System.out.println(message.replace("!","*"));
        System.out.println(message);//as string is immutable it will print helloworld!!
        System.out.println(message.toUpperCase(Locale.ROOT) );
    }
}
