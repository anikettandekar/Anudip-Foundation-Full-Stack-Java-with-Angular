package com.anudip.aniket;

/**
 * Demonstrates various types of unchecked exceptions in Java.
 * Unchecked exceptions are subclasses of RuntimeException and do not need to be declared or caught explicitly.
 */
public class UncheckedExceptionsDemo {

    /**
     * Demonstrates ArithmeticException by attempting to divide by zero.
     */
    void demonstrateArithmeticException() {
        // Thrown when an exceptional arithmetic condition has occurred.
        // Demonstrated by attempting to divide by zero.
        int result = 10 / 0;
    }

    /**
     * Demonstrates NullPointerException by attempting to call a method on a null object.
     */
    void demonstrateNullPointerException() {
        // Thrown when an application attempts to use null in a case where an object is required.
        // Demonstrated by attempting to call a method on a null object.
        String str = null;
        int length = str.length();
    }

    /**
     * Demonstrates ArrayIndexOutOfBoundsException by attempting to access an invalid index in an array.
     */
    void demonstrateArrayIndexOutOfBoundsException() {
        // Thrown to indicate that an array has been accessed with an illegal index.
        // Demonstrated by attempting to access an invalid index in an array.
        int[] arr = new int[5];
        int element = arr[10];
    }

    /**
     * Demonstrates NumberFormatException by attempting to convert an invalid string to a number.
     */
    void demonstrateNumberFormatException() {
        // Thrown to indicate that the application has attempted to convert a string to one of the numeric types, but that the string does not have the appropriate format.
        // Demonstrated by attempting to convert an invalid string to a number.
        int number = Integer.parseInt("invalid");
    }

    /**
     * Demonstrates ClassCastException by attempting an invalid type cast.
     */
    void demonstrateClassCastException() {
        // Thrown to indicate that the code has attempted to cast an object to a subclass of which it is not an instance.
        // Demonstrated by attempting an invalid type cast.
        Object obj = new Object();
        String str = (String) obj;
    }

    public static void main(String[] args) {
        UncheckedExceptionsDemo demo = new UncheckedExceptionsDemo();

        // Handling Exceptions:
        // Each method that throws an unchecked exception is surrounded by a try-catch block in the main method.
        // The catch blocks handle specific exceptions and print appropriate messages.

        // Demonstrate ArithmeticException
        try {
            demo.demonstrateArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled: " + e.getMessage());
        }

        // Demonstrate NullPointerException
        try {
            demo.demonstrateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled: " + e.getMessage());
        }

        // Demonstrate ArrayIndexOutOfBoundsException
        try {
            demo.demonstrateArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled: " + e.getMessage());
        }

        // Demonstrate NumberFormatException
        try {
            demo.demonstrateNumberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled: " + e.getMessage());
        }

        // Demonstrate ClassCastException
        try {
            demo.demonstrateClassCastException();
        } catch (ClassCastException e) {
            System.out.println("ClassCastException handled: " + e.getMessage());
        }

        // Flow of Control:
        // Even if an exception is thrown in any of the demonstration methods, it is caught and handled,
        // allowing the program to continue executing and print "Rest of the code will execute".

        // Print a message indicating that the rest of the code will execute
        System.out.println("Rest of the code will execute");
    }
}
