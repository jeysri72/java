package com.bootcamp.demo;

public class Employee {
    String name;
    String department;
    double salary;

    public Employee(){

    }

    // Name is as same as the class name
    // No need to declare the return type
    public Employee(String pName){
        this.name = pName;
    }

    public void increment(double incAmount){
        //this.salary = this.salary +incAmount;
        this.salary += incAmount;
    }

    public void changeDepartment(String newDepartment){
        this.department = newDepartment;
    }
}



