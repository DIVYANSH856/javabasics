package com.company;

import java.util.Locale;
import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        int i=0;
        while (i<10){
            System.out.println(i);
            i+=1;
        }
        String input="";
        Scanner scanner =  new Scanner(System.in);
        while(!input.equals("quit")){
            System.out.println("input :");
            input=scanner.next().toLowerCase();
            System.out.println(input);
        }
        //do while loop
        String a;
        a="";
        do{
            System.out.println("a :");
            input= scanner.next().toLowerCase();
            System.out.println(a);
        }while (!input.equals("quit"));

    }
}