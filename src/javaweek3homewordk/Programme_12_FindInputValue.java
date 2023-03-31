package javaweek3homewordk;

import java.util.Scanner;
/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme_12_FindInputValue {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch= scanner.next().charAt(0);

        //Object creation
        Programme_12_FindInputValue inputValue = new Programme_12_FindInputValue();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        //Closing the scanner object
        scanner.close();
    }
    //Find the input value is Alphabet, DIGIT or Symbol
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch){
        if ((ch>= 'a' && ch <= 'z') || (ch>= 'A' && ch <= 'Z')){
            System.out.print(ch + " is an Alphabet.");
        } else if (ch>= '0' && ch <= '9'){
            System.out.print(ch + " is a Digit.");
        } else {
            System.out.print(ch + " is a Symbol.");
        }
    }
}
