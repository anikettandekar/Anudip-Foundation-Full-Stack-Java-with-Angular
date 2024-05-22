package com.demo;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the month you want");
		int month=sc.nextInt();
		System.out.println("enter year");
		int year=sc.nextInt();
		
		if(month>=1 && month<=12)
		{
			int days=0;
			
			switch(month)
			{
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				days=31;
				break;
				
			case 4: case 6: case 9: case 11:
				days=30;
				break;
				
			case 2:
				if(year%4==0)
				{
					days=29;
				}
				else
				{
					days=28;
				}
				break;
				
			
			}
			System.out.println("the number of days in month "+month+" are "+days);
		}
		else
		{
			System.out.println("invalid input");
		}
		

	}

}
