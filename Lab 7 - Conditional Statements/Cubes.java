package com.anudip.practiceprograms;

import java.util.Scanner;

public class Cubes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number :  ");
		int n= sc.nextInt();
	
		for (int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.println(i + "\t" + cube);
        }
		sc.close();
}
}