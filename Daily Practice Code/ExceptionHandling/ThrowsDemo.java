package com.anudip.aniket;

import java.io.IOException;

/**
 * Demonstrates the use of the 'throws' keyword in Java.
 * If a method is capable of throwing an exception that it cannot handle,
 * it should specify that exception using the 'throws' keyword.
 * This helps the callers of that method handle the exception.
 */
public class ThrowsDemo {

    /**
     * Method that throws an IOException.
     * The 'throws' keyword indicates that this method might throw an IOException,
     * which must be handled by the caller of this method.
     * 
     * @throws IOException if an I/O error occurs.
     */
    void method1() throws IOException {
        // Simulate an I/O error by throwing an IOException
        throw new IOException("Some error cocuured by device");
    }

    /**
     * Method that calls method1 and propagates the IOException.
     * Since method1 can throw an IOException, method2 must also declare that
     * it throws IOException to propagate the exception.
     * 
     * @throws IOException if an I/O error occurs in method1.
     */
    void method2() throws IOException {
        // Call method1, which might throw an IOException
        method1();
    }

    /**
     * Method that calls method2 and handles the IOException.
     * This method uses a try-catch block to handle the IOException thrown by method2.
     */
    void method3() {
        try {
            // Attempt to call method2, which can throw an IOException
            method2();
        } catch (IOException e) {
            // Handle the IOException thrown by method2 or method1
            System.out.println("Exception handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create an instance of ThrowsDemo
        ThrowsDemo td = new ThrowsDemo();

        // Call method3, which handles any IOException internally
        td.method3();

        // Print a message indicating that the rest of the code will execute
        System.out.println("Rest of the code will execute");
    }
}
