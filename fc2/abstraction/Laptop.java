package com.acwd.pfs.fc2.abstraction;


public abstract class Laptop {
    static int id = 1;

    private int laptopId;

    // Instance variable or Field - Can't be shared among the instances
    private String os;
    protected String brand;
    private String color;
    private int size;
    private Configuration configuration;
    private String processor;

    // Constructor method with single parameter
    public Laptop(String os, String processor){
        this.os = os;   // this - Current instance
        this.processor = processor;
        this.laptopId = id;
        ++id;
    }



    // Getter & Setter method to access the private fields

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public String getOs() {
        return os;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void developCode(){
        System.out.println("executing from super class");
        System.out.println("Launch the code editor");
        System.out.println("Write the program");
        System.out.println("Execute the program ");
    }

    // Abstract method - Method signature without method body
    public abstract void installSoftware();

    // String representation of the object
    @Override
    public String toString() {
        return "Laptop{" +
                "laptopId=" + laptopId +
                ", os='" + os + '\'' +
                '}';
    }
}
