// Question: Write a Java program that throws an exception and catch it using a try-catch block.

package com.aniket.labfourtyone;

public class TryCatchException {

	public static void main(String[] args) {
		try {
			// Throw an ArithmeticException
			int result = divideNumbers(10, 0);
			System.out.println("Result of division: " + result);
		} catch (ArithmeticException e) {
			// Catch and handle the ArithmeticException
			System.out.println("Exception caught: " + e.getMessage());
		}
	}

	// Method that throws an ArithmeticException
	public static int divideNumbers(int dividend, int divisor) {
		if (divisor == 0) {
			// Throw an ArithmeticException if divisor is 0
			throw new ArithmeticException("Division by zero is not allowed.");
		}
		return dividend / divisor;
	}
}

/*  Dry run
	
	1. Define a class TryCatchException which contains:
	   - The main method:
	     - Tries to execute the following block of code:
	       - Calls the method divideNumbers(10, 0) which attempts to divide 10 by 0.
	       - Expects to store the result of the division in the variable result, but encounters an ArithmeticException due to division by zero.
	       - Attempts to print "Result of division: " followed by the value of result, which does not execute because of the exception.
	     - Catches and handles the ArithmeticException:
	       - Prints "Exception caught: " followed by the exception message obtained from e.getMessage(), which is "Division by zero is not allowed."
	
	   - The method divideNumbers(int dividend, int divisor):
	     - Takes two integers, dividend and divisor, as input.
	     - Checks if the divisor is 0.
	     - Throws an ArithmeticException with the message "Division by zero is not allowed." if the divisor is 0.
	     - Otherwise, performs the division dividend / divisor and returns the result.
	
	3. Example execution:
	   - Execution starts with the main method.
	   - Calls divideNumbers(10, 0) which throws an ArithmeticException because division by zero is attempted.
	   - Catches the ArithmeticException in the catch block.
	   - Prints "Exception caught: Division by zero is not allowed." due to the caught exception.

*/

// Output:
// Exception caught: Division by zero is not allowed.
