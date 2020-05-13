package com.javatutorial.controlflow.forloop;

public class PrimeNumbersInARange {
    public static void main(String[] args) {

        int count=0;
        for(int i=1; i<=100; i++){
            if(count ==3)
                break;
            if(isPrime(i)){
                System.out.println(i +" is a prime number");
                count++;

            }

        }
    }

    private static boolean isPrime(int number){
        if (number==1){
            return false;
        }

        for(int i=2; i<=number/2; i++){
            if (number%i==0)
                return false;
        }
        return true;
    }
}
