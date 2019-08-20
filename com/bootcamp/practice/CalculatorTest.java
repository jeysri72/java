package com.bootcamp.practice;

import java.io.PrintStream;

public class CalculatorTest {
    // Entry point to the class to execute it
    public static void main (String[] args){
       // Creating the new instance of the calculator class
        Calculator myCal    = new Calculator();

        //Assign the values to your instance variables
        myCal.firstOperand = 147483648;
        myCal.secondOperand = 999999978;


        //Print the value of the instance
        System.out.println(myCal.toString());

        System.out.printf(" %d + %d = %d.\n",
                             myCal.firstOperand,
                             myCal.secondOperand,
                             myCal.add());
        System.out.printf(" %d - %d = %d.\n",
                            myCal.firstOperand,
                            myCal.secondOperand,
                            myCal.subtract());


        try {System.out.printf(" %d * %d = %d.\n",
                myCal.firstOperand,
                myCal.secondOperand,
                myCal.multiply()) ;
        } catch (IntegerIsTooLongException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf(" %d / %d = %d.\n",
                    myCal.firstOperand,
                    myCal.secondOperand,
                    myCal.divide());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
