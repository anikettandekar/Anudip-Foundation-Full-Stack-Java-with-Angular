package com.demo;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter an integer");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			
			System.out.println(i);
			sum+=i;
		}
		System.out.println("Sum is: "+sum);
	}

}
