package com.demo;

import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		if(n>=1 && n<=7)
		{
			String weekday="";
			
			switch(n)
			{
			case 1:
				weekday="Monday";
				break;
				
			case 2:
				weekday="Tuesday";
				break;
				
			case 3:
				weekday="Wednesday";
				break;
				
			case 4:
				weekday="Thursday";
				break;
				
			case 5:
				weekday="Friday";
				break;
				
			case 6:
				weekday="Saturday";
				break;
				
			case 7:
				weekday="Sunday";
				break;
			}
			System.out.println("the weekday corresponds to "+n+" is "+weekday);
		}
		else
		{
			System.out.println("invalid input");
		}
	}

}
