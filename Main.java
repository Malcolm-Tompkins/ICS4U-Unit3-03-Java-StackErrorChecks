// Mr Coxall Stack main class.
// Created Dec 8th, 2021

import java.util.EmptyStackException;
import java.util.Scanner;
/**
* Main class.
*/

final class Main {

    /**
    * Constant for number 10.
    */

    public static final int MAGIC_10 = 10;

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

    /**
    * Main() function.
    *
    * @param args unused argument
    */
    public static void main(String[] args) {
        final Scanner myObj = new Scanner(System.in);
        final MrCoxallStack aStack = new MrCoxallStack();
        try {
            System.out.println("Input your number to be pushed: ");
            final int pushNumber = myObj.nextInt();
            aStack.push(pushNumber);
            aStack.showStack();
        } catch (java.util.InputMismatchException error) {
            System.out.println("Invalid input, must be a number");
            System.exit(0);
        }
        try {
            System.out.println(
                "Would you like to pop your stack (y,n): ");
            final char yesOrNo = myObj.next().charAt(0);
            if (yesOrNo == 'y') {
                try {
                    final int popedNumber = aStack.pop();
                    System.out.println("The popped number is: "
                        + popedNumber);
                } catch (EmptyStackException error) {
                    System.out.println("Cannot pop an empty stack");
                }
            }
            aStack.showStack();
        } catch (java.util.InputMismatchException error) {
            System.out.println(
                "Invalid input, must be character y or n");
        }
    }
}

