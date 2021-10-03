package com.company;

public class maths {
    public static void main(String[] args) {
        int result= Math.round(1.1F);
        System.out.println(result);
        int result1 = (int)Math.ceil(1.1F);//ciel returns int greater than or equal to no.
        System.out.println(result1);
        int result2 = (int)Math.floor(1.1F);//floor returns int smaller than or equal to no.
        System.out.println(result2);
        int result3 = Math.max(10,5);
        System.out.println(result3);
        int result4 =Math.min(10,5);
        System.out.println(result4);
        double result6= Math.random() ;
        System.out.println(result6);
        int result5 = (int)(Math.random() *100) ;
        System.out.println(result5);
    }
}
