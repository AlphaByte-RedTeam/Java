package com.java.learn;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.print("Number: ");
        int number = read.nextInt();
        
        int fizzDiv = 5;
        int buzzDiv = 3;

        if(number % fizzDiv == 0 && number % buzzDiv == 0){
            System.out.println("FizzBuzz");
        }

        else if(number % fizzDiv == 0){
            System.out.println("Fizz");
        }

        else if(number % buzzDiv == 0){
            System.out.println("Buzz");
        }

        else{
            System.out.println(number);
        }
    }
}
