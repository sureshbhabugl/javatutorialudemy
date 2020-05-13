package com.javatutorial.controlflow.forloop;

public class CalculateInterest {
    public static void main(String[] args) {

        /*
        using for...loop, calculate the interest for amount 10_000 at the rate 2,3,4,5,6,7 & 8
         */

        for(int i=2;i<9;i++){
            System.out.println("Interest for the rate of "+i+"% for a sum of 10000 = "+calculateInterest(10_000,i));

            // A new method to format the decimal places upto 2 decimal places is using the String.format() method

            System.out.println(" SF: Interest for the rate of "+i+"% for a sum of 10000 = "+String.format("%.2f",calculateInterest(10_000,i)));

        }

        /* Challenge 2

        Use the same above method but do it in reverse.

         */

        System.out.println("Challenge 2:  ******* Reverse Order *******  ");

        for(int i=8;i>=2;i--){

            System.out.println(" SF: Interest for the rate of "+i+"% for a sum of 10000 = "+String.format("%.2f",calculateInterest(10_000,i)));

        }
    }

    private static double calculateInterest(double amount, double interestRate){

        return (amount*(interestRate/100));
    }
}
