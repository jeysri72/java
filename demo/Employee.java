package com.demo.day3.assignment2;

public abstract class Employee {
    static  int id = 1;
    private int emplyoeeId;
    private String name;
    private double baseSalary;
    private  Employee manager;

    public int getEmplyoeeId() {
        return emplyoeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee e){
        this.manager = e;
    }

    public boolean equals(Employee other){
        if (this.emplyoeeId == other.emplyoeeId){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){ return this.emplyoeeId + " " + this.getName();}

    /*
    public String employeeStatus(){
        return "Will be implemented in the sub class";
    }*/
    abstract  public String employeeStatus();

    public Employee(String name, double baseSalary){
        this.emplyoeeId = id;
        this.name = name;
        this.baseSalary = baseSalary;
        id++;
    }
}
