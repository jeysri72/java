package com.bootcamp.demo;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){
        int i = 5;
        int reminder;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number : ");
        i = input.nextInt();
        reminder = i%2;

        if (reminder == 0){
            System.out.println(i + " is an even");
        }else{
            System.out.println(i + " is an odd");
        }

        switch (reminder){
            case 0:
                System.out.println(i + " is an even");
                break;
            case 1:
                System.out.println(i + " is an odd");
                break;
            default:
        }
    }
}
