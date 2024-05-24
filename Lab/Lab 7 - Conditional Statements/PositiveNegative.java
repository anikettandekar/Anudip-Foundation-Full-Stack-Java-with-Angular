package com.anudip.practiceprograms;

import java.util.Scanner;

// Write a Java program to get a number from user and print whether it is positive or negative                                             

public class PositiveNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number :  ");
		int n= sc.nextInt();
		
		if(n > 0) 
			System.out.println("Its a positive number");
		else if(n<0) 
			System.out.println("Its a negative number");
		else 
			System.out.println("Its zero");
		
		sc.close();
	}
}
