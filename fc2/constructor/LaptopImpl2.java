package com.acwd.pfs.fc2.constructor;

public class LaptopImpl2 {
    // Demo the usage of static variable

    public static void main(String[] args) {
        Laptop acer = new Laptop("Windows");
        Laptop apple = new Laptop( "Mac");
        Laptop hp = new Laptop();
        Laptop asus = new Laptop("Windows", "Intel 7");
        acer.installSoftware();
        //acer.toString();
        System.out.println(acer); // toString method will be executed
        System.out.println(Laptop.id);
        System.out.println(apple);
        System.out.println(Laptop.id);
        System.out.println(hp);
        System.out.println(Laptop.id);
        System.out.println(asus);
        System.out.println(Laptop.id);
        System.out.println(acer.id);
        System.out.println(hp.id);
        System.out.println(apple.id);
        System.out.println(asus.id);

    }
}
