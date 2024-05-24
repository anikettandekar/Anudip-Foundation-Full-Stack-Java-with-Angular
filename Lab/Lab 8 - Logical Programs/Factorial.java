package com.anudip.logicalProgramsLab8;

import java.util.Scanner;

// 1.Write a Java program that prompts the user to enter a positive integer and calculates its factorial using a while loop. The program should display the factorial as the output.


public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = scanner.nextInt();	
		 
		int fact = 1;
		while(n > 0) {
			fact *= n;
			n--;
		}
		
		System.out.println("Factorial =  "  + fact);
		scanner.close();
	}
}
