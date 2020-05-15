package arrays;

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program
// should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

import java.util.Arrays;
import java.util.Scanner;

public class ReserveSorting {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] intArray = getIntgers(5);
        printArray(intArray);
       System.out.println("The sorted Array is : "+Arrays.toString(sortIntegers(intArray)));
        //Using bubble sort
        System.out.println("The sorted Array is : "+Arrays.toString(sortIntegersV1(intArray)));

    }

    @Deprecated
    private static int[] sortIntegers(int[] intArray) {
        int[] sortedArray = Arrays.copyOf(intArray,intArray.length);
        int temp =0;
        for(int j=0;j<sortedArray.length;j++){
            System.out.println("Count = "+j);
            for(int i=0;i<(sortedArray.length)-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                }
            }
        }


        return sortedArray;

    }

    public static int[] sortIntegersV1(int[] intArray){
        // Implementing the sorting using bubble sort
        // Here you'll have an outer loop which keeps the tab of if the
        // iteration went successfully without swapping. In other words
        // The while loop initiates one swapping per iteration only if the
        // previous iteration happened without a swap. Hence, have a flag
        // called isSorted which checks if the previous iteration went without
        // swapping.
        // Time complexity is O(n^2)

        int[] sortedArray = Arrays.copyOf(intArray,intArray.length);
        int temp = 0;
        boolean isSorted = false;
        int counter =0;
        while(!isSorted){
            //Set the initial value of isSorted to true so that we assume that this
            // iteration is going to execute without swapping
            isSorted = true;
            counter++;
            for(int i=0; i<sortedArray.length-1 /*-1 due to last element check is not required*/; i++){
                //Checking if the values of the adjacent elements are sorted properly
                if(sortedArray[i]<sortedArray[i+1]){
                    //Initiating a swap
                    temp=sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    //++++Very IMPORTANT++++++
                    // Set the flag "isSorted" to false indicating that a swap has occured.
                    isSorted = false;
                }
            }
        }
        System.out.println("Counter = "+counter);
        return sortedArray;


    }

    private static void printArray(int[] intArray) {
        if(intArray.length==0){
            System.out.println("Nothing to print....");
        }else{
            for(int i=0;i<intArray.length;i++){
                System.out.println("Element in index "+i+" has a value of " +intArray[i]);
            }
        }
    }

    private static int[] getIntgers(int size) {
        System.out.println("Enter "+size+ " integer values \r");
        int[] intArray = new int[size];
        for(int i=0; i<size;i++){
            intArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return intArray;
    }
}
