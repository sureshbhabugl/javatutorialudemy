package com.javatutorial.DecimalComparator;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        boolean equalNumbers = false;

        firstNumber = firstNumber*1000;
        secondNumber=secondNumber*1000;
        int x = (int)firstNumber;
        int y = (int)secondNumber;

        System.out.println(x);
        System.out.println(y);

        if(x==y){
            equalNumbers=true;
        }

        return equalNumbers;

    }
}
