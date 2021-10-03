package com.company;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];//right after int we add [] and 5 is length of array
        int[] numbers2 = {7,6,8};
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));

    }
}
