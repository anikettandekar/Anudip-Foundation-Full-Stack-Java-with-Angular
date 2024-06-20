// Question: Write a Java program to create a method that reads a file and throws an exception if the file is not found.

package com.aniket.labfourtyone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderException {
	// Method to read a file and throw FileNotFoundException if not found
	public static void readFile(String filename) throws FileNotFoundException {
		File file = new File(filename);

		// Check if the file exists
		if (!file.exists()) {
			throw new FileNotFoundException("File '" + filename + "' not found.");
		}

		// If file exists, read its contents
		try (Scanner scan = new Scanner(file)) {
			System.out.println("Reading file contents:");
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				System.out.println(line);
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the file name to read: ");
		String filename = input.nextLine();

		try {
			// Attempt to read the file
			readFile(filename);
		} catch (FileNotFoundException e) {
			// Catch and handle the FileNotFoundException
			System.out.println(e.getMessage());
		} finally {
			input.close(); // Closing the scanner to prevent resource leak
		}
	}
}

/*  Dry run 	
 
	1. Define a class FileReaderException which contains:
	   - A static method readFile(String filename) that:
	     - Takes a string filename as input.
	     - Creates a File object file with the provided filename.
	     - Checks if the file exists using file.exists().
	     - Throws a FileNotFoundException with a message "File '<filename>' not found." if the file does not exist.
	     - If the file exists, attempts to read its contents:
	       - Opens a Scanner object scanner to read from the file.
	       - Prints "Reading file contents:" to indicate file reading has started.
	       - Reads each line of the file using scanner.nextLine() until there are no more lines (scanner.hasNextLine() is false).
	       - Prints each line read from the file.
	
	   - The main method:
	     - Creates a Scanner object input to read input from the user.
	     - Prints "Enter the file name to read: " to prompt the user to enter a file name.
	     - Reads the input filename using input.nextLine().
	     - Tries to call readFile(filename) within a try-catch block to handle FileNotFoundException:
	       - If readFile throws a FileNotFoundException, catches it and prints the exception message obtained from e.getMessage().
	     - Finally, closes the Scanner object input to prevent resource leak.
	
	3. Example execution:
	   - User input: Enter the file name to read: sample.txt
	     - Assuming "sample.txt" exists in the current directory:
	       - The program successfully reads the contents of "sample.txt" and prints each line.
	   
	   - User input: Enter the file name to read: non-existent-file.txt
	     - Assuming "non-existent-file.txt" does not exist in the current directory:
	       - The program throws a FileNotFoundException and catches it, printing "File 'non-existent-file.txt' not found."

*/

// Example Execution:
// Reading file contents:
// Line 1
// Line 2
// Line 3
