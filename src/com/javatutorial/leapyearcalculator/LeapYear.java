package com.javatutorial.leapyearcalculator;

public class LeapYear {

    public static boolean isLeapYear(int year){
        //The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

        //If the parameter is not in that range return false.

        boolean isLeap = false;

        if(year<=1 || year>=9999){
           return false;
        }
        if (year%400==0) {
            isLeap = true;
        }else if (year%100==0){
            isLeap=false;
        } else if(year%4==0){
            isLeap=true;
        }else{
            isLeap = false;
        }
        return isLeap;
    }
}
