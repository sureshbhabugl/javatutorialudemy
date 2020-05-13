package com.javatutorial.MethodOverloading;

public class SecondsAndMinutesChallenge {

    static final int NUMBEROFMINITESINANHOUR = 60;
    static  final int NUMBEROFSECONDSINAMINUTE = 60;

    public static void main(String[] args) {

        System.out.println(getDurationString(66,0));
        System.out.println(getDurationString(3601));
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes<0 || seconds <0 || seconds > 59){
            return "Invalid Value";
        }

        int hour = (int) minutes/NUMBEROFMINITESINANHOUR;
        int totalMinutes = (int) minutes%NUMBEROFMINITESINANHOUR;

       return hour+" hrs "+totalMinutes+" mins "+seconds+" seconds";
    }


    public static String getDurationString(int seconds){
        if(seconds <0 ){
            return "Invalid Value";
        }


        int totalMinutes = (int) seconds/NUMBEROFSECONDSINAMINUTE;
        int totalSeconds = (int) seconds%NUMBEROFSECONDSINAMINUTE;

        return getDurationString(totalMinutes, totalSeconds);
    }
}
