package com.company;

public class catsingtype {
    public static void main(String[] args) {
        //implicit casting - automatic conversion
        //this happens whenever you are not gonna loose data there is no chance
        //byte>short>int>long>float>double
        short a = 2;
        int b = a + 8;
        System.out.println(b);
        //explicit casting - when we manually have to convert data type
        ////this happens whenever you are gonna loose data there is chance
        double x=2;
        int y = (int) x + 8;
        System.out.println(y);
        //in case of strings we have parse
        String q= "1";
        int w = Integer.parseInt(q)+9;
        System.out.println(w);

    }
}
