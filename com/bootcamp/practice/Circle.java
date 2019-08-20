package com.bootcamp.practice;

public class Circle {
    final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        double result;
        result = PI*radius*radius;
        return result;
    }

    public double calculateCircumference(){
        return 2 * PI * radius;
    }
}