package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortgagecalculator {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR= 12;
        final byte PERCENT=100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("principal:");
        int principal=scanner.nextInt();

        System.out.print("annual_interst:");
        float annual_interest=scanner.nextFloat();
        float monthly_interest=annual_interest/PERCENT/MONTHS_IN_YEAR;

        System.out.print("period (years) :");
        byte years= scanner.nextByte();
        int no_of_payments= years*MONTHS_IN_YEAR;

        System.out.print("mortgage:");
        double mortgage = principal*(monthly_interest
                *Math.pow(1+monthly_interest,no_of_payments)
                /(Math.pow(1+monthly_interest,no_of_payments-1)));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("mortgage: "+ mortgageFormatted);
    }

}
