package com.bootcamp.demo;

import java.util.Scanner;

public class SumOfTwoNumbers2 {
    static int num1;
    static int  num2;
    static int sum;

    //Declare scanner object to get the input
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) { //for: start
            System.out.println("Iteration number " + i);
            //Get the user input
            num1 = getUserInput("first");
            num2 = getUserInput("second");

            //Calculate the sum of the two numbers
            sum = num1 + num2;

            if (i == 5){
                continue; //Skip the current iteration and resume with the next
            }
            //Print the output
            System.out.printf("Sum of %d and %d = %d \n", num1, num2, sum);
        }//for: end
    }
 // Method Overloading
 // Multiple methods with the same same but different number of paratmeters
    public static int getUserInput(){
        int num;
        //Prompt the user to input the number
        System.out.print("Intput the number: ");

        //Get the user input
        num = input.nextInt();

        return num;
    }

    public static int getUserInput(String numberOrder){
        int num;
        //Prompt the user to input the number
        System.out.printf("Intput the %s number: ", numberOrder);

        //Get the user input
        num = input.nextInt();

        return num;
    }

}
