package com.demo.day3.assignment2;

public class TechnicalEmployee extends Employee {
    public int checkIns = 0;

    public TechnicalEmployee(String name) {
        super(name,75000.0);
    }

    @Override
    public String employeeStatus() {
        return this.getEmplyoeeId() + " " + this.getName() +
                " has " + this.checkIns + " successful check ins";
    }
}
