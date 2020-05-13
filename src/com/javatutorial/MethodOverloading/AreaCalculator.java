package com.javatutorial.MethodOverloading;

public class AreaCalculator {

    public static void main(String[] args) {

        System.out.println( area(3));

        System.out.println(area(10,20));

    }

    // This method is to calculate the area of a cicle
    public static double area(double radius){

        if(radius<0){
            return -1.0;
        }

        return 3.14159*Math.pow(radius,2);
    }

    //Overloading the area method for a rectangle

    public static double area(double length, double width){

        if((length<0) || (width<0)){
            return -1.0;
        }

        return length*width;

    }


}


