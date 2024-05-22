package com.demo;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int n=sc.nextInt();
		
		if(n>0)
		{
			System.out.println("Positive");
			
		}
		else if(n<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("The number is 0");
		}
	}

}
