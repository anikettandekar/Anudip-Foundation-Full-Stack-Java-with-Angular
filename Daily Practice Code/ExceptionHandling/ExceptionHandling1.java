package com.anudip.aniket;
public class ExceptionHandling1 {
	public static void main(String[] args) {
		try
		{
			//int num=Integer.parseInt("FullStackJava");
			
			//System.out.println(num);
			
			int arr[] = new int[5];
           arr[6] = 9;
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Number Format Excpetion");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("array size is 5 only");
		}
	}
}
