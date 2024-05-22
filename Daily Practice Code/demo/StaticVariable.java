package com.demo;

public class StaticVariable {

	static int a=10;
	
	void display()
	{
		a=a+1;
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		
		StaticVariable sv=new StaticVariable();
		sv.display();
		//sv.display();
		StaticVariable sv1=new StaticVariable();
		sv1.display();
		

	}

}
