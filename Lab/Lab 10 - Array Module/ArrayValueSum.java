/* Question: Write a Java program to sum values of an array. */

package com.anudip.labten;

import java.util.Scanner;

class ArrayValueSum {
    public static void main(String[] args) {
    	
        // Creating a Scanner object to read input from the user
    	Scanner scan = new Scanner(System.in);
    	
    	//Prompt for user about program
    	System.out.println("Question:\tWrite a Java program to sum values of an array." + "\nSolution Output:\t ");
    	
    	// Getting array size from user
    	System.out.print("Enter the size of Array: ");
    	int arraySize = scan.nextInt();
    	
    	// Initialization of an array
    	int[] values = new int[arraySize];
        
    	// Adding values in Array from user
    	System.out.println("Enter values of array: ");
        for(int index = 0; index < arraySize; index++) {
        	values[index] = scan.nextInt();
        }
        
        // Calling sumArray method and store it's result
        int sum = sumArray(values);
        
        // Printing result 
        System.out.println("Sum of the values in array is: " + sum);
        
        // Closing the scanner to free up resources
        scan.close();
    }
    
    // This method takes an array of integers and returns the sum of its elements.
    public static int sumArray(int[] array) {
        // Initializing a variable to store the sum
        int sum = 0;
        
        // Loop through each element in array
        for (int i = 0; i < array.length; i++) {
            // Adding current element to the sum
            sum += array[i];
        }
        
        // Returning final sum value
        return sum;
    }
}
