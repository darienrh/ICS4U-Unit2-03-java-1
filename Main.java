/*
* The "factorial" program outputs the factorial of the users input recursively
*
* @author  Darien R-H
* @version 1.0
* @since   2021-12-18
*/

import java.util.Scanner;

/**
* This is a program that blanks.
*/
final class Main {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }
     public static int  factorial(final int fnumber) {
        if (fnumber == 1) {
            return 1;  //end the recursion
        } else {
            return fnumber * factorial(fnumber - 1);  //#! = # * (#-1)!
        }
    }
    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        int number;
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter a integer :  ");

        // Block of code to try
        try {
                number = myInput.nextInt();  //get a positive integer
                System.out.println("The factorial of "
                + number + " is: " + factorial(number));
        } catch (java.util.InputMismatchException errorCode) {
        // Block of code to handle errors
                System.out.println("\nYou have not entered a valid input.");
        }

        System.out.println("\nDone.");
    }
}
