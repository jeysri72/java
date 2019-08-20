package com.bootcamp.practice;

public class IntegerIsTooLongException extends Exception {
    public IntegerIsTooLongException (String errMessage){
        super(errMessage);
    }
}
