package com.bootcamp.demo;


import java.util.Scanner;

/**
 * @author Jeyashree
 * version 1.0
 *
 * Java array is a collection of variables of the same type.
 * int array is a collection of int varibles only.
 * String array is a collection of String varibles only
 *
 * The variables are stroed in an array with index.
 * Here is an illustration of Java arrays:
 * int[] myArray = new int[] {5, 6, 10 }
 * Array Length = 3. Array Index start with 0.
 * The values are stored as below
 * myArray[0] = 5
 * myArray[1] = 6
 * myArray[2] = 10
 *
 */
public class Arrays {
    public static void main(String[] args){

        int varName;

        // Declaration of integer array
        int[] intArray ={0,0,0,0,0};

        // Initialization of integer array with 10 items
        intArray = new int[10];


        Scanner input = new Scanner(System.in);
        for (int i = 0; i < intArray.length; i++ ){
            // assigning value to an array element
           // intArray[i] = i+100;
            System.out.printf("Enter the element at index %d", i);
            intArray[i] = input.nextInt();
        }

        // Traversing array to print the values
        for (int i = 0; i < intArray.length; i++ ){
            System.out.printf ("Element at index %d = %d",
                    i, intArray[i]);
            System.out.println("");
        }


        // Multi dimensional Array
        int[][] mulDimArray = new int[2][5];
        // mulDimArray.length - Returns the number of rows - 2
        // mulDimArray[i].length - Returns the number of columns - 5
        for(int i=0; i < mulDimArray.length; i++){
            for(int j=0; j < mulDimArray[i].length; j++){
                mulDimArray[i][j] = i+j;
            }
        }

        for(int i=0; i < mulDimArray.length; i++){
            for(int j=0; j < mulDimArray[i].length; j++){
                System.out.printf ("mulDimArray[%d][%d] = %d \t",
                        i, j, mulDimArray[i][j]);

            }
            System.out.println("");
        }

        // Multi dimensional Array
        int[][][] mulDimArray2 = new int[2][5][3];
        // mulDimArray.length - Returns the number of rows - 2
        // mulDimArray[i].length - Returns the number of columns - 5
        for(int i=0; i < mulDimArray2.length; i++){
            for(int j=0; j < mulDimArray2[i].length; j++){
                for(int k=0; k < mulDimArray2[j].length; k++){
                    mulDimArray2[i][j][k] = i+j;

                    if (i==1 || j==1 || k==1 ){

                    }
            }
        }}


    }

}
