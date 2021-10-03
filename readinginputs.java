package com.company;

import java.util.Scanner;

public class readinginputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("name :");
        String name = scanner.next();
        System.out.print("age :");
        byte age = scanner.nextByte();
        System.out.println("I am "+name);
        System.out.println("I am "+age+" years old");
    }
}
