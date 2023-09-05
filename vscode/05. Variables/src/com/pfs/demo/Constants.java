package com.pfs.demo;

/**
 * Constants are fixed values that do not change during the execution of a program.
 * They are used to represent data that remains the same throughout the program's execution.
 * 
 * Characteristics:
 * Fixed Value: Constants have a value that does not change.
 * Immutable: Constants cannot be modified or reassigned once they are defined.
 * Named: Constants are typically given meaningful names using snake casing to make the code more
 * readable and understandable.
 * 
 * Use Cases: Mathematical constants (e.g., pi), configuration settings, 
 * and literal values used in calculations or comparisons.
 */
public class Constants {
    public static final double PI = 3.14159265359;
    public static final int MAX_VALUE = 100;
    public static final String GREETING = "Hello, World!";
    
    public static void main(String[] args) {
        System.out.println("The value of PI is: " + PI);
        System.out.println("The maximum value is: " + MAX_VALUE);
        System.out.println(GREETING);
    }
}

