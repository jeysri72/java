package com.demo;
// If I want to run this application,
public class Test {
    public static void main (String[] args){
        double myDouble = 5.6817;
// Type casting - Converting from one data type to another data type
        System.out.printf("myDouble = %f\n", myDouble);
        System.out.printf("myDouble = %.2f\n", myDouble);
        System.out.printf("myDouble = %.0f\n", myDouble);
        // int - ignores the decimals only. Won't round off
        System.out.printf("double to int (type casting) = %d\n", (int) myDouble);

        System.out.printf("double to int = %d\n",  myDouble);
    }
}
