// Question: Write a program for a voting application, taking user's age as input and terminating if age is less than 18.

package com.aniket.labfourtyone;

import java.util.Scanner;

public class VotingApplication {

	// Custom exception class for underage voters
	static class UnderAgeException extends Exception {
		public UnderAgeException(String message) {
			super(message);
		}
	}

	// Method to check if user is eligible to vote
	public static void checkEligibility(int age) throws UnderAgeException {
		if (age < 18) {
			throw new UnderAgeException("You are not eligible to vote as you are under 18 years old.");
		} else {
			System.out.println("You are eligible to vote. Thank you for participating!");
			// Additional voting logic or actions can be added here
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = scan.nextInt();

		try {
			checkEligibility(age);
		} catch (UnderAgeException e) {
			System.out.println(e.getMessage()); // Handle exception
			// Terminate program gracefully after catching exception
			System.exit(0);
		}
		scan.close();
		
	}
	
	/*  Dry run:
	    
	    Example 1: Age entered: 20
	    - Calls checkEligibility(20)
	    - Prints: "You are eligible to vote. Thank you for participating!"
	    
	    Example 2: Age entered: 16
	    - Calls checkEligibility(16)
	    - Throws UnderAgeException with message: "You are not eligible to vote as you are under 18 years old."
	    - Prints: "You are not eligible to vote as you are under 18 years old."
	    - Program terminates gracefully after catching exception.
    */
}
