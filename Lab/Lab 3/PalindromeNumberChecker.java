/* Question: WAP to check whether the number is palindrome or not. */

package com.anudip.labprograms;

import java.util.Scanner;

public class PalindromeNumberChecker {

    public static void main(String[] args) {
    	
        // Created Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompted user to enter a number
        System.out.print("Enter a number: ");
        // Here reading the user input number
        int number = scanner.nextInt();

        // Calling isPalindrome() function
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        // Close the scanner to free up resources
        scanner.close();
    }

    // Logic for checking if a number is a palindrome or not
    public static boolean isPalindrome(int num) {
    	// To Store original number
        int originalNum = num; 
        // To store reversed number
        int reversedNum = 0; 

        // Logic to reverse the number
        while (num != 0) {
        	// Using mod 10 rule to get last digit
            int digit = num % 10; 
            // Appending digit in reverse number
            reversedNum = reversedNum * 10 + digit; 
            // Remove last digit which is processed to get new last digit
            num /= 10; 
        }

        // Comparing to check if original number is equal to the reversed number
        return originalNum == reversedNum;
    }
}
