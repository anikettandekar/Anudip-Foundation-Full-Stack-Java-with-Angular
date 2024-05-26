/* Question: Write a java programs to perform basic calculators operations(Input from user using switch case) */

package com.anudip.labprograms;

import java.util.Scanner;

class BasicCalculator {

    public static void main(String[] args) {
        // Created Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompted user to enter the first number
        System.out.print("Enter first number: " );
        // Here reading the first number
        float num1 = scanner.nextFloat(); 
        
        // Prompted user to enter the second number
        System.out.print("Enter second number: ");
        // Here reading the second number
        float num2 = scanner.nextFloat();
        
        // Prompted user to choose an operation
        System.out.print("Choose an operation: +, -, *, /:  ");
        // Here reading the second number
        char operation = scanner.next().charAt(0);
        
        // Variable to store the result of the calculation
        float result; 
        
        // Performing calculation based on the chosen operation by user
        switch (operation) {
        	
        	// Addition Operation
            case '+': 
                result = num1 + num2; 
                System.out.println("The result is: " + result);
                break;
                
            // Subtraction Operation
            case '-':
                result = num1 - num2; 
                System.out.println("The result is: " + result);
                break;
                
            // Multiplication Operation
            case '*':
                result = num1 * num2; 
                System.out.println("The result is: " + result);
                break;
                
            // Division Operation
            case '/':
                // Checking for division by zero situation and handling it in else part of conditional statement
                if (num2 != 0) {
                    result = num1 / num2; 
                    System.out.println("The result is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
                
            // invalid operation handling
            default:
                System.out.println("Error: Invalid operation.");
                break;
        }
        
        // Closing scanner to free up resources
        scanner.close();
    }
}
