// Question: Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels

package com.aniket.labfourtyone;

import java.util.Scanner;

//Define the custom exception class for handling cases where no vowels are found
class NoVowelException extends Exception {
	public NoVowelException(String message) {
		super(message);
	}
}

public class VowelsException {

	// Method to check if the input string contains any vowels
	public static void checkForVowels(String s) throws NoVowelException {
		// Regular expression to check for vowels (both uppercase and lowercase)
		if (!s.matches(".*[AEIOUaeiou].*")) {
			// Throw custom exception if no vowels are found
			throw new NoVowelException("The string does not contain any vowels.");
		}
		// Print message if vowels are found
		System.out.println("The string contains vowels.");
	}

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string:");
		// Read a line of input from the user
		String str = scan.nextLine();

		// Try to check for vowels and handle the custom exception if thrown
		try {
			checkForVowels(str);
		} catch (NoVowelException e) {
			// Print the exception message if no vowels are found
			System.out.println(e.getMessage());
		}

		// Close the scanner to avoid resource leaks
		scan.close();
	}
}

/*  Dry run

	1. Define a custom exception class NoVowelException that extends Exception.
	
	2. Define a class VowelsException which contains:
	   - A static method checkForVowels(String s) that:
	     - Uses a regular expression ".*[AEIOUaeiou].*" to check if the string contains any vowels.
	     - Throws a NoVowelException with a message "The string does not contain any vowels." if no vowels are found.
	     - Prints "The string contains vowels." if vowels are found.
	   
	   - The main method which:
	     - Creates a Scanner object to read input from the user.
	     - Prompts the user to enter a string.
	     - Reads the string input.
	     - Calls checkForVowels method within a try-catch block to handle NoVowelException.
	     - Catches and prints the exception message if no vowels are found.
	     - Closes the Scanner object to release resources.
	
	3. Example execution:
	   Enter a string:
	   Hello
	   The string contains vowels.
	
	   Enter a string:
	   Hll
	   The string does not contain any vowels.
*/

// Output:
// The string contains vowels.
