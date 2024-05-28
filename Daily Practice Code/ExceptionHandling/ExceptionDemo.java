package com.anudip.aniket;
/*Hierarchy Of Exceptions In Java
//java.lang
*                   
* 				Exception                       Error
* 				can be easily manageable        quite difficult handle the error
*             
*              Checked Exception
*              -Checked exceptions are known to compiler i.e
*              they are the exceptions that are checked at compile time.
*             
*             
*              Unchecked Exception
* 				They are the exceptions that are not checked at compile time,
* 				 because they occur only at
* 				run time.That’s why these exceptions are also called run time exceptions.
*                                   
*						+++++++++	Exception Hierarchy   +++++++++
*                                   Object
* 									
* 									Throwable
* 		       			 Exception                              			Error
*
* Unchecked Exception        			CheckedException          		VirtualMachineException                                                           			StackOverFlowException
* (RuntimeException)         	 		(Compile-time Exception)        OutOfMemoryError
* 	^^^^^^^^^^^^^^^^^^^^^^^^			^^^^^^^^^^^^^^^^^^^^^^^^		StackOverflow Exception 	
*    ArithmethisExcpetion  				InteruptedException
*    NumberFormatException				SQLException
*    IllegalArgumentExcpetion			IOException
*    ArrayIndexOutOfBoundException
*    NullPointerException
* 			
*/
public class ExceptionDemo {
	/*no of statements
	try
	catch
	finally
	throw
	throws
	1st statement
	2st statement
	3st statement
	4st statement - problem - logical problem- program stop for execution
	5st statement
	6st statement
	....
	1000 statement*/
	public static void main(String[] args) {
	
		int a=0; //1st statement
		
		int b=7; // 2nd statement
		try
		{
		System.out.println(b/a); // 3rd statement
		}
		catch(Exception ex)
		{
			System.out.println("Some problem has occured");
		}
		System.out.println("This will print"); // 4th statement
		//JVM
	/*	                                     predefineClass/divide by 0
		Exception in thread "main" java.lang.ArithmeticException: / by zero
		at ExceptionHandlingDemo/com.anudip.padmaja.ExeptionDemo.main(ExeptionDemo.java:25)
          ProjectName           package name className               filename     stack-trace*/ 
	}
}

