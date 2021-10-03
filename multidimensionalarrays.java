package com.company;

import java.util.Arrays;

public class multidimensionalarrays {
    public static void main(String[] args) {
        int[][] numbers = new int[2][5];
        numbers[0][0]=2;
        numbers[1][1]=6;
        System.out.println(Arrays.deepToString(numbers));//for multi dimensional we use deeptostring
        int[][] numbers1 = {{1,2},{1,2,3,4,5}};
        System.out.println(Arrays.deepToString(numbers1));
    }
}
