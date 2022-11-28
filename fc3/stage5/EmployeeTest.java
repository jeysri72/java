package com.acwd.pfs.fc3.stage5;


public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("Static value of id " + Employee.id);
        Employee alice = new Employee();
        System.out.println("Static value of id " + Employee.id);

        alice.setName( "Alice");
        alice.setSalary( 20000);
        alice.setDepartment ( "Production");
        alice.setRole ("Director");
        System.out.println(alice);
        System.out.println(alice.getName());
        System.out.println(alice.getDepartment());

        alice.applyLeave(5);

        Employee bob = new Employee("Bob", 15000,
                 "Production", "Manager");
        System.out.println("Static value of id " + Employee.id);
        System.out.println(bob);

        Employee charlie = new Employee("Charlie", 10000);
        System.out.println("Static value of id " + Employee.id);
        System.out.println(charlie);

        Employee mia = new Employee(9000, "Mia");
        System.out.println("Static value of id " + Employee.id);
        System.out.println(mia);


    }
}
