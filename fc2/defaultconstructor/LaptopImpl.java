package com.acwd.pfs.fc2.defaultconstructor;

import com.acwd.pfs.fc2.defaultconstructor.Laptop;

import java.sql.Connection;

public class LaptopImpl {
    public static void main(String[] args) {
        // ClassName   instance/objectName =  keyword(new) ConstructorMethod
        // what is constructor method?
        //      to initialize the object values
        // Laptop() - Default constructor Method - Method with no parameters
        Laptop windows = new Laptop(); // Instantiation - Creating an Object
        Laptop mac = new Laptop();

        // How to assign the values for the properties
        windows.brand = "Windows";
        mac.brand = "Apple";

        // How to print the value of the properties
        System.out.println(windows.brand);
        System.out.println(mac.brand);


        System.out.println(Laptop.id); // id is a static variable.
                                        // can be shared among the instance
                                        // Instantiation is not required

        System.out.println(windows.id);
        System.out.println(mac.id);


        // System.out.println(Laptop.brand);   // Instantiation is required to access
                                                // the instance variable

        // How to access the associate class
//        windows.configuration.hddSpace = 1;
//        windows.configuration.ram   = 24;
//        Exception in thread "main" java.lang.NullPointerException
//        at com.acwd.pfs.fc2.defaultconstructor.LaptopImpl.main(LaptopImpl.java:35)
//        Configuration hasn't instantiated

        Configuration conf = new Configuration();
        conf.hddSpace = 1;
        conf.ram = 24;

        windows.configuration = conf;

        System.out.println(windows.configuration.hddSpace);
        System.out.println(windows.configuration.ram );
    }
}
