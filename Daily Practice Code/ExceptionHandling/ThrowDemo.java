package com.anudip.aniket;
/*The Java throw keyword is used to explicitly throw an exception.
We can throw either checked or unchecked exception in java by throw keyword.
The throw keyword is mainly used to throw custom exception(UserDefined).*/
public class ThrowDemo {

    static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age is less than 18");
        } else {
            System.out.println("Please vote");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(13); // Call the validateAge method with an age of 13
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // This line will now execute even if an exception is thrown
        System.out.println("Rest of the code will execute");
    }
}

