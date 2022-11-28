package com.acwd.pfs.fc2.abstraction;

public class WindowsLaptop extends  Laptop{
    // WindowsLaptop - Child/ Derived/ Sub class
    // Laptop - Parent / Base / Supper class
    // IN java - we use the term sub and super

    public WindowsLaptop(String processor){
        super("Windows", processor);
    }

    @Override
    public void developCode(){
        super.developCode();
        System.out.println("excuting from sub class");
        System.out.println("Launch the code editor");
        System.out.println("Write the program");
        System.out.println("Execute the program ");
    }
    @Override
    public void installSoftware() {
        System.out.println("Execute exe file/ msi file");
    }
}
