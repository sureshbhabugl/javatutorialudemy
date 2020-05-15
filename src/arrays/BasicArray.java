package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BasicArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5); // Method to create an array of 5 and then assign values
        printArray(myIntegers);
        System.out.println("The average of "+ Arrays.toString(myIntegers)+" is "+getAverage(myIntegers));
    }

    public static int[] getIntegers(int size){
        System.out.println("Enter "+size+ " integer values \r");
        int[] values = new int[size];
        for(int i=0;i<values.length;i++){
             values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] printArray){
        if(printArray.length==0){
            System.out.println("Nothing to print....");
        }else{
            for(int i=0;i<printArray.length;i++){
                System.out.println("Element in index "+i+" has a value of " +printArray[i]);
            }
        }
    }

    public static double getAverage(int[] intArray){
        if(intArray.length==0){
            return -1;
        }
        double sum=0.0;
        for(int i=0;i<intArray.length;i++){
            sum+=intArray[i];
        }
        return (sum/intArray.length);
    }

}
