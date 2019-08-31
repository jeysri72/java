package com.demo.day3.assignment2;

public class CompanyStructure {
    public static void main (String[] args){
        // Abstract class can't be instantiated
        //Employee bob = new Employee("Bob", 50000.0);
        //Employee david = new Employee("David", 30000.0);

        //TechnicalEmployee bob = new TechnicalEmployee("Bob");
        //TechnicalEmployee david = new TechnicalEmployee("David");


        TechnicalLead bob = new TechnicalLead("Bob");
        SoftwareEngineer david = new SoftwareEngineer("David");
        SoftwareEngineer john = new SoftwareEngineer("John");
        SoftwareEngineer lim = new SoftwareEngineer("Lim");
        SoftwareEngineer alice = new SoftwareEngineer("Alice");

        bob.addReport(david);
        bob.addReport(john);
        bob.addReport(lim);
        bob.addReport(alice);

        SoftwareEngineer mary = new SoftwareEngineer("Mary");
        TechnicalLead peter = new TechnicalLead("Peter");
        peter.addReport(mary);


        System.out.println("Name = " + bob.getName());
        System.out.println("Base Salary = " + bob.getBaseSalary());

        System.out.println("Name = " + david.getName());
        System.out.println("Base Salary = " + david.getBaseSalary());
        System.out.println("David's Manager = " + david.getManager().getName());

        System.out.println(bob.equals(david));

        System.out.println(bob.toString());
        System.out.println(david.toString());

        david.setCodeAccess(true);
        david.checkInCode();
        david.checkInCode();
        lim.setCodeAccess(true);
        lim.checkInCode();
        lim.checkInCode();

        System.out.println(bob.employeeStatus());
        System.out.println(david.employeeStatus());
        System.out.println("Bob's team status \n");
        System.out.println(bob.getTeamStatus());

        System.out.println("Peter's team status \n");
        System.out.println(peter.getTeamStatus());
    }
}
