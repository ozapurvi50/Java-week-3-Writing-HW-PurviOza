package javaweek3homewordk;

import java.util.Scanner;
/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT : use Ternary operator (? : )
 */
public class Programme_1_OddEvenTernaryOperator {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number :");
        int number = scanner.nextInt();
        //closing the scanner object
        scanner.close();

    }
    //Checking the number is even or odd
    public static void isITOddOrEvenNumber(int number){
        //ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The" + number + evenOrOdd + "number");
    }
}