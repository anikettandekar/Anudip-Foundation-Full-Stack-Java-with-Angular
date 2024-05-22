package com.demo;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		int Greatestnumber = x;
		
		if(y>Greatestnumber)
		{
			Greatestnumber=y;
		}
		if(z>Greatestnumber)
		{
			Greatestnumber=z;
		}
		
		System.out.println("the greatest number is "+Greatestnumber);

	}

}
