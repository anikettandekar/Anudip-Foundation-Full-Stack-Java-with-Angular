// Question: Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd

package com.aniket.labfourtyone;

import java.util.Scanner;

//Custom exception class for handling odd numbers
class OddException extends Exception {
	public OddException(String message) {
		super(message);
	}
}

public class OddNumException {

	// Method to check if the number is odd and throw exception if true
	public static void checkOdd(int num) throws OddException {
		if (num % 2 != 0) {
			throw new OddException("The entered number is odd.");
		} else {
			System.out.println("Entered number is even.");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.print("Enter a number: ");
			int num = scan.nextInt();

			// Check if the number is odd
			checkOdd(num);

		} catch (OddException e) {
			// Catching and handling the custom exception for odd numbers
			System.out.println("Exception caught: " + e.getMessage());
		} catch (Exception e) {
			// Catching any other unexpected exceptions
			System.out.println("Invalid input. Please enter a valid integer.");
		} finally {
			scan.close(); 
		}
	}
}

/*  Dry run
	
	1. Define a custom exception class OddException that extends Exception.
	
	2. Define a class OddNumException which contains:
	   - A static method checkOdd(int num) that:
	     - Takes an integer num as input.
	     - Checks if num is odd using the condition num % 2 != 0.
	     - Throws an OddException with the message "The entered number is odd." if num is odd.
	     - Prints "Entered number is even." if num is even.
	   
	   - The main method which:
	     - Creates a Scanner object scanner to read input from the user.
	     - Prompts the user to enter a number.
	     - Reads the integer input using scanner.nextInt().
	     - Calls checkOdd method within a try-catch block to handle OddException.
	       - If checkOdd throws an OddException, catches it and prints "Exception caught: " followed by the exception message.
	     - Catches any other exceptions (like InputMismatchException) using a generic Exception catch block and prints "Invalid input. Please enter a valid integer."
	     - Finally, closes the Scanner object scanner in the finally block to prevent resource leaks.
	
	3. Example execution:
	   - User input: Enter a number: 5
	     Output: Exception caught: The entered number is odd.
	   
	   - User input: Enter a number: 8
	     Output: Entered number is even.
	   
	   - User input: Enter a number: abc
	     Output: Invalid input. Please enter a valid integer.
*/

// Output:
// Entered number is even.
