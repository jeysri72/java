package com.bootcamp.practice;

import java.util.Scanner;

public class CircleImplementation {
    public static void main (String[] args){
        double radius = -1;
        Scanner input = new Scanner(System.in);
        boolean isDouble = false;
        do {
            System.out.println("Enter the radius of the circle: ");
            try {
                String r = input.next();
                radius = Double.parseDouble(r);
                Circle firstCircle = new Circle(radius);
                System.out.println("Area = " + firstCircle.calculateArea());
                System.out.println("Circumference = " + firstCircle.calculateCircumference());

            }catch (Exception e){
                radius = -1;
            }

        } while (radius < 0);
    }
}
