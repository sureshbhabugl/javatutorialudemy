package com.javatutorial.leapyearcalculator;

public class Main {

    public static void main(String[] args) {
        System.out.println(LeapYear.isLeapYear(-1600));
        System.out.println(LeapYear.isLeapYear(1600));
        System.out.println(LeapYear.isLeapYear(2017));
        System.out.println(LeapYear.isLeapYear(2000));

//        The following years are not leap years:
//        1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
//        This is because they are evenly divisible by 100 but not by 400


        System.out.println("The following years are not leap years:");
        System.out.println(LeapYear.isLeapYear(1700));

        System.out.println(LeapYear.isLeapYear(1900));
        System.out.println(LeapYear.isLeapYear(2100));
        System.out.println(LeapYear.isLeapYear(2200));
        System.out.println(LeapYear.isLeapYear(2300));
        System.out.println(LeapYear.isLeapYear(2500));
        System.out.println(LeapYear.isLeapYear(2600));


        /*

        The following years are leap years:
        1600, 2000, 2400
        This is because they are evenly divisible by both 100 and 400.
         */

        System.out.println("The following years are leap years:");
        System.out.println(LeapYear.isLeapYear(1924));
        System.out.println(LeapYear.isLeapYear(2000));
        System.out.println(LeapYear.isLeapYear(2400));
        System.out.println(LeapYear.isLeapYear(2020));
        System.out.println(LeapYear.isLeapYear(1800));

    }
}
