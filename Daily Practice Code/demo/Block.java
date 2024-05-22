package com.demo;


public class Block {

	{
		System.out.println("instance block");
	}
	
	Block()
	{
		System.out.println("Constructor");
	}
	
	static
	{
		System.out.println("Static method");
	}
	public static void main(String[] args) {
		
		Block b=new Block();
	}

}
