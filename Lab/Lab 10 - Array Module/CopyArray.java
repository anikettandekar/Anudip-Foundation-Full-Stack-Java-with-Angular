/* Question: Write a Java program to copy an array by iterating the array. */

package com.anudip.labten;

import java.util.Scanner;

class CopyArray {
    public static void main(String[] args) {
    	
        // Creating a Scanner object to read input from the user
    	Scanner scan = new Scanner(System.in);
    	
    	//Prompt for user about program
    	System.out.println("Question:\tWrite a Java program to copy an array by iterating the array." + "\nSolution Output:\t ");
    	
    	// Getting array size from user
    	System.out.print("Enter the size of Array: ");
    	int arraySize = scan.nextInt();
    	
    	// Initialization of an array
    	Float[] originalArray = new Float[arraySize];
        
    	// Adding values in Array from user
    	System.out.print("Enter values of array: ");
        for(int index = 0; index < arraySize; index++) {
        	originalArray[index] = scan.nextFloat();
        }
        
        // Initializing new array to store copy
        Float[] copyArray = new Float[arraySize];
        
        
        // adding values of original array in copy array
        for(int index = 0; index < arraySize; index++) {
        	copyArray[index] = originalArray[index];
        }
        
        // Original Array printing
        System.out.print("Original array: ");
        for(int index = 0; index < arraySize; index++) {
        	System.out.print(originalArray[index] + " ");
        }
        
        // Copy array printing
        System.out.print("\nCopy array: ");
        for(int index = 0; index < arraySize; index++) {
        	System.out.print(copyArray[index] + " ");
        }
        
        // Closing the scanner to free up resources
        scan.close();
    }
}
