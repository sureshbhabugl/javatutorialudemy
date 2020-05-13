package com.javatutorial.MethodOverloading;

public class FeetInchToCentimeterConverter {
    static final double FOOTTOINCH = 12.00;
    static final double INCHTOCENT = 2.54;

    public static void main(String[] args) {

        System.out.println(calcFeetAndInchesToCentimeter(6,0));

        System.out.println(calcFeetAndInchesToCentimeter(72));
        
    }

    public static double calcFeetAndInchesToCentimeter(double feet, double inches){

        if(feet<0 || inches<0 || inches>12){
            return -1;
        }

        double totalInches = feet*FOOTTOINCH+inches;
        double result = totalInches*INCHTOCENT;
        return result;

    }

    public static double calcFeetAndInchesToCentimeter(double inches){

        if(inches<0){
            return -1;
        }

        double totalFeet = (int)(inches/FOOTTOINCH);
        double totalInches = inches%FOOTTOINCH;
        System.out.println("Total Feet = "+totalFeet);
        System.out.println("Total Inches = "+totalInches);
        double result = calcFeetAndInchesToCentimeter(totalFeet,totalInches);

        return result;

    }

}
