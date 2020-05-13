package com.javatutorial.controlflow.whiledowhile;

public class SumDigits {

    public static void main(String[] args) {

        System.out.println(sumDigits(123));
    }

    public static int sumDigits(int number){
        if(number<10)
            return -1;

        int remainder = 0;
        int temp = number;
        while(temp>0){
            remainder += temp%10;
            temp/=10;
        }
        return remainder;
    }
}
