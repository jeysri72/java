package com.bootcamp.demo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOfTwoNumbers {
    static int num1;
    static int  num2;
    static int sum;

    //Declare scanner object to get the input
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        //Prompt the user to input the first number
        System.out.print("Intput the first number: ");

        //Get the user input
        num1 = input.nextInt();


        //Prompt the user to input the second number
        System.out.print("Intput the second number: ");

        //Get the user input
        num2 = input.nextInt();

        //Calculate the sum of the two numbers
        sum = num1 + num2;

        //Print the output
        System.out.print("Sum of the two numbers = " + sum);
        System.out.println("Sum of  + num1 +  and " +
                num2 + "= "+ sum);
        System.out.printf("Sum of %d and %d = %d", num1, num2, sum  );
    }


}
