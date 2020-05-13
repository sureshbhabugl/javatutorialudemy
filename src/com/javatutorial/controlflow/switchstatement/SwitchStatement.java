package com.javatutorial.controlflow.switchstatement;

public class SwitchStatement {

    public static void main(String[] args) {

        // Create a switch statement
        // Create a char variable and assign a value
        // Test if the variable is either A, B, C, D or E
        // display if any of the above characters are found
        // add a default message that the characters are not found

        char swtichChar = 'F';
        switch(swtichChar){

            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Bingo! I can see that the character is "+swtichChar);
                break;

            default:
                System.out.println(":( Not a valid character");
                //break;
        }
    }
}
