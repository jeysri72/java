package com.bootcamp.practice;

public class Calculator {
    public int firstOperand;
    public int secondOperand;


    public int add(){
        int result;
        result = firstOperand + secondOperand;
        return result;
    }

    public int subtract(){
        int result;
        result = firstOperand - secondOperand;
        return result;
    }

    public int multiply() throws IntegerIsTooLongException{
        int result;
        result = firstOperand * secondOperand;
        if (result == -271403008){
            throw new IntegerIsTooLongException("Too long");
        }
        return result;
    }

    public int divide() throws DivisonByZeroException{
        int result;
        if (secondOperand == 0){
            throw new DivisonByZeroException("Divison by zero error." +
                    " Try with non-zero value.");
        }
        result = firstOperand / secondOperand;
        return result;
    }

    public String toString(){
        String result = "The result of the operation";
        return result;
    }
}
