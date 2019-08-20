package com.bootcamp.demo;



public class EmployeeTest {


    public static void main (String[] args){
        Employee jey = new Employee();

        jey.name = "Jeyashree";
        jey.department ="Web Developmet";
        jey.salary =2000;


        Employee john = new Employee("John");

        System.out.println(jey.name );
        System.out.println(john.name);
    }


}
