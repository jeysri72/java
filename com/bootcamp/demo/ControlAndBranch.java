package com.bootcamp.demo;
/** @author Jeyashree
 * version 1.0
 * Control and Branching statements are used to change the sequence
 * of program execution
 * Control and Brnaching statements are
 * 1. if
 * 2. if ... else
 * 3. switch ... case
 *    case block must end with break
 *
 */

import java.util.Scanner;

public class ControlAndBranch {
    public static void main(String[] args) {

        // Some useful conditions:
        System.out.println(5 == 5);
        System.out.println(10 != 11);
        System.out.println(3 < 6);
        System.out.println(10 > 100);

        // Using loops with "break":
        int loop = 0;

        while(true) {
            System.out.println("Looping: " + loop);
            //if the loop value is equal to three break the loop.
            //It changes the program execution sequence
            if(loop != 3) {
                break; //Exit the loop pre-maturely
            }
            loop++;
            System.out.println("Running");
        }

        //get the command from the user
        String command = getUserCommand();

        // Branch out to different sequence based on the input
        switch (command) {
            case "start":
                System.out.println("Starting the Service!");
                break;

            case "stop":
                System.out.println("Stopping the service.");
                break;

            default:
                System.out.println("Command is not recognized");
        }
    }
    private static String getUserCommand(){
        // Create scanner object to read the user input
        Scanner input = new Scanner(System.in);

        // Output the prompt
        System.out.println("Enter the status: ");

        // Wait for the user to enter something.
        String status = input.next();
        return  status;

    }
}
