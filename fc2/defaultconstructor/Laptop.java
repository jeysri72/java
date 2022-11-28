package com.acwd.pfs.fc2.defaultconstructor;

import com.acwd.pfs.fc2.defaultconstructor.Configuration;

public class Laptop {
    static int id = 1;

    // Instance variable or Field - Can't be shared among the instances
    String brand;
    String color;
    int size;
    Configuration configuration;
    String processor;

    public void developCode(){
        System.out.println("Launch the code editor");
        System.out.println("Write the program");
        System.out.println("Execute the program ");
    }

    public void installSoftware(){
        System.out.println("It will behave differently based on the instance");
    }
}
