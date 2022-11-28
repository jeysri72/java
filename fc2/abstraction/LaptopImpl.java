package com.acwd.pfs.fc2.abstraction;

public class LaptopImpl {
    public static void main(String[] args) {
        // Can't instantiate the abstract class
       // Laptop windows = new Laptop("Windows", "Intel 7");

        WindowsLaptop acer = new WindowsLaptop("Intel 7");
        MacLaptop apple = new MacLaptop( "M1 Chip");

        System.out.println(acer);
        System.out.println(apple);

        acer.installSoftware();
        apple.installSoftware();

        acer.developCode();
        apple.developCode();

    }
}

