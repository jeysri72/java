package com.bootcamp.demo;

/** @author Jeyashree
 * version 1.0
 * Loops are used to repeat the same steps
 * Loops in java
 * 1. For
 * 2. While
 * 3. Do ... While
 *
 * Do ... While loop will be executed atleast once
 */
public class Loops {
    public static int value = 5;

    public static void main(String[] args) {

        System.out.println(forLoop());
        whileLoop();
        doWhileLoop();

    }

    public  static String forLoop(){
        System.out.println("For Loop");
        for(int i=1; i <5; i++) {
            System.out.printf("The value of i is: %d\n", i);
        }

        for(int j=5; j >0; j--) {
            System.out.printf("The value of j is: %d\n", j);
        }


        System.out.println("---------------------------------------");
        return "For Loop is completed";
    }



    public static void whileLoop(){
        System.out.println("While Loop");
        while(value > 5)
        {
            System.out.println("Hello " + value);
            value = value - 1;
        }
        System.out.println("---------------------------------------");
    }

    public static void doWhileLoop(){
        System.out.println("Do While Loop");
        do {
            System.out.println("Hello " + value);
            --value;
        }
        while (value > 5);
        System.out.println("---------------------------------------");
    }


}