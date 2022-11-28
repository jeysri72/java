package com.acwd.pfs.fc3.stage1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee alice = new Employee();
        alice.name = "Alice";
        alice.salary = 20000;
        alice.department = "Production";
        alice.role = "Director";
        System.out.println(alice);
        System.out.println(alice.name);
        System.out.println(alice.department);

        alice.applyLeave(5);
    }
}
