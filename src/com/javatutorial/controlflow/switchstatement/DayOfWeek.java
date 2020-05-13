package com.javatutorial.controlflow.switchstatement;

public class DayOfWeek {
    public static void main(String[] args) {

        printDayOfWeek(1);

        printDayOfWeek(10);

        printDayOfWeek(-1);

        printDayOfWeekUsingIf(1);

        printDayOfWeekUsingIf(10);

        printDayOfWeekUsingIf(-1);

    }

    private static void printDayOfWeek(int day){
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tueday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid Day");
        }
    }

    private static void printDayOfWeekUsingIf(int day){
        if(day==0)
            System.out.println("Sunday");
        else if (day==1)
            System.out.println("Monday");
        else if (day==2)
            System.out.println("Tuesday");
        else if (day==3)
            System.out.println("Wednesday");
        else if (day==4)
            System.out.println("Thursday");
        else if (day==5)
            System.out.println("Friday");
        else if (day==6)
            System.out.println("Saturday");
        else
            System.out.println("Invalid Day");
    }
}
