package com.demo;

import java.util.Scanner;
public class Cube {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer");
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			int cube=i*i*i;
			System.out.println(i+" ^3 = "+cube);
		}
		
	}

}
