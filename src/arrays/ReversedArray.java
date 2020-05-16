package arrays;

import java.util.Arrays;
import java.util.Scanner;

/*

-Write a method called reverse() with an int array as a parameter.

-The method should not return any value. In other words, the method is allowed to modify the array parameter.

-In main() test the reverse() method and print the array both reversed and non-reversed.

-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.


Tip:
	-Create a new console project with the name ÅeReverseArrayChallengeÅf
 */
public class ReversedArray {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = readIntegers(5);
        System.out.println("Array before reverse "+ Arrays.toString(myArray));
        reverse(myArray);
        System.out.println("Array after reverse "+ Arrays.toString(myArray));

    }

    private static void reverse(int[] array){
        int temp=0;
        int size = array.length-1;
        for(int i=0; i<(size/2)+1;i++){
            temp = array[i];
            array[i]=array[size-i];
            array[size-i] = temp;
        }
    }

    private static int[] readIntegers(int size) {
        System.out.println("Enter "+size+ " integer values \r");
        int[] intArray = new int[size];
        for(int i=0; i<size;i++){
            intArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return intArray;
    }
}
