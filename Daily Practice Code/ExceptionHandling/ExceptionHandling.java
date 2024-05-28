package com.anudip.aniket;

public class ExceptionHandling {
    public static void main(String[] args) {
        
        try {
            // Attempt to access the length of a null string, which will cause a NullPointerException
            String s = null;
            System.out.println(s.length());

            // Un-commenting the below line will cause an ArithmeticException due to division by zero
            // int i = 10 / 0;

        } 
        // Catch specific exceptions and handle them appropriately
        catch (NumberFormatException ex) {
            System.out.println("Invalid data: Number format exception.");
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid data: Array index out of bounds.");
        }
        catch (IllegalArgumentException ex) {
            System.out.println("Invalid data: Illegal argument.");
        }
        catch (ArithmeticException ex) {
            System.out.println("Divide by 0 is not possible.");
        }
        /*
        catch (NullPointerException ex) {
            System.out.println("String is null.");
        }
        catch (Exception ex) {
            System.out.println("Invalid data: General exception.");
        }
        */
        finally {
            // This block will always execute, regardless of whether an exception was thrown
            System.out.println("This will surely execute.");
        }

        // This line will execute if no exception is thrown or after the finally block
        System.out.println("This will also executed.");
    }
}
