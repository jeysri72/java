package com.acwd.pfs.fc3.stage2;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee alice = new Employee();
        alice.setName( "Alice");
        alice.setSalary( 20000);
        alice.setDepartment ( "Production");
        alice.setRole ("Director");
        System.out.println(alice);
        System.out.println(alice.getName());
        System.out.println(alice.getDepartment());

        alice.applyLeave(5);
    }
}
