package com.acwd.pfs.fc2.abstraction;

public class MacLaptop extends Laptop {
    public MacLaptop( String processor) {
        super("iOS", processor);
    }

    @Override
    public void installSoftware() {
        System.out.println("run dmg file/ unzip and copy");
        System.out.println( "Drag and Dro into Applications");

    }
}
