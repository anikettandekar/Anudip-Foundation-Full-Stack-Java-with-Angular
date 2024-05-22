package com.anudip.practiceprograms;

import java.util.Scanner;

public class SumNaturalNos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number :  ");
		int n= sc.nextInt();
		int sum = 0 ;
	
		for(int i=1 ; i<=n ; i++) {
			System.out.print(i + "  ");
			sum += i;
		}
		System.out.println("\nSum = " + sum);
		
		sc.close();
}
}
