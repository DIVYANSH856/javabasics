package com.company;

public class ternaryoperator {
    public static void main(String[] args) {
        int income=250000;
        String className = income>150000 ? "first"  : "economy";
        System.out.println(className);
    }
}
