/* Question: Write a Java program to calculate the average value of array elements. */

package com.anudip.labten;

import java.util.Scanner;

class ArrayValueAverage {
    public static void main(String[] args) {
    	
        // Creating a Scanner object to read input from the user
    	Scanner scan = new Scanner(System.in);
    	
    	//Prompt for user about program
    	System.out.println("Question:\tWrite a Java program to calculate the average value of array elements." + "\nSolution Output:\t ");
    	
    	// Getting array size from user
    	System.out.print("Enter the size of Array: ");
    	int arraySize = scan.nextInt();
    	
    	// Initialization of an array
    	Float[] values = new Float[arraySize];
        
    	// Adding values in Array from user
    	System.out.print("Enter values of array: ");
        for(int index = 0; index < arraySize; index++) {
        	values[index] = scan.nextFloat();        
        	}
        
        // Calling avgArray method and store it's result
        Float average = avgArray(values);
        
        // Printing result 
        System.out.println("Average of the values in array is: " + average);
        
        // Closing the scanner to free up resources
        scan.close();
    }
    
    // This method takes an array of integers and returns the sum of its elements.
    public static float avgArray(Float[] values) {
        // Initializing a variable to store the sum
        float sum = 0f, average = 0f;
        
        // Loop through each element in array
        for (int i = 0; i < values.length; i++) {
            // Adding current element to the sum
            sum += values[i];
        }
        
        // Calculating average of array values
        average = sum/values.length;
        
        // Returning final average value
        return average;
    }
}
