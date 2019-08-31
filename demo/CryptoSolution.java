package com.demo.day2.assignment1;

import java.util.Scanner;

public class CryptoSolution {
    public static void main (String[] args){
        // get user input for text, shift value groupvalue
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to encrypt : ");
        String originalText = input.nextLine();

        // You can enhance using error handling
        System.out.println("Enter the number of characters to shift : ");
        int shiftNumber = input.nextInt();

        System.out.println("Enter the number of characters to group : ");
        int groupNumber = input.nextInt();


        // Instantiate the crypto object
        Crypto crypto = new Crypto();

        // Call encrypt method
        String encryptedString;
        encryptedString = crypto.encryptString(originalText,
                                               shiftNumber,
                                               groupNumber);

        System.out.println("Encrypted String - " + encryptedString);
    }
}

