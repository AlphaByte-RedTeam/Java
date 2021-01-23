package com.java.learn;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main( String[] args ) {

        final byte MONTHS_IN_YEAR = 12; // Declaring 12 months in a variable to calculate monthly interest
        final byte PERCENT = 100;       // Declaring percentage to calculate monthly interest

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;
        float annualInterest;

        Scanner read = new Scanner(System.in);  // Declaring input classes

        while( true ) {
            System.out.print( "Principal: Rp. " );   // Asking for the principal amount
            principal = read.nextInt();             // Inputting principal amount
            if( principal >= 1000 && principal <= 1_000_000 ) {
                break;
            }

            else {
                System.out.println( "Enter a value between 1K and 1M" );
            }
        }

        while( true ) {
            System.out.print( "Annual Interest Rate: " );   // Asking for annual interest rate
            annualInterest = read.nextFloat();             // Inputting the amount, Ex Input: 
            if( annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = ( annualInterest / PERCENT ) / MONTHS_IN_YEAR;
                break;
            }

            else {
                System.out.println("Enter a value between 1 and 30");
            }
        }

        while(true){
            System.out.print("Period(Years): ");
            byte years = read.nextByte();
            if(years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }

            else {
                System.out.println("Enter a value between 1 and 30");
            }
        }

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                          / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}

/*

*/