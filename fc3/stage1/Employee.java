package com.acwd.pfs.fc3.stage1;

public class Employee {
    String name;
    public double salary;
    String department;
    String role;
    Employee manager;

    public void applyLeave(int noOfDays){
        System.out.println("Applied leave for " + noOfDays);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                ", manager=" + manager +
                '}';
    }
}
