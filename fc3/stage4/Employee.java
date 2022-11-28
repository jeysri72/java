package com.acwd.pfs.fc3.stage4;

public class Employee {
    private int id = 1;
    private String name;
    private double salary;
    private String department;
    private String role;
    private Employee manager;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public void applyLeave(int noOfDays){
        System.out.println("Applied leave for " + noOfDays);
    }

    // intialize the instance variables
    // Method name = Class Name
    // NO Return type
    // Can have multiple constructor methods with different number of parameters
    // or different data type = Constructor Method Overloading

    public Employee(String name, double salary, String department, String role) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.role = role;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary, String name) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(){}

    @Override
    public String toString() {
        return "Employee{" +
                " id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                ", manager=" + manager +
                '}';
    }
}
