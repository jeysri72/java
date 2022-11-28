package com.acwd.pfs.fc2.constructor;



public class Laptop {
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
    public Laptop(String os){
        this(); // Executes the default constructor method.
                // It should be the first line of the method
        this.os = os;   // this - Current instance
        //this.laptopId = id;
    }

    public Laptop(String os, String processor) {
        this();
        this.os = os;  // Can't changed after purchasing the laptop
                        // Getter method
        this.processor = processor; // I can upgrade/ replace the existing
                                    // after sometime
                                    // Getter and Setter
        //this.laptopId = id;

    }

    public Laptop(String os, int size) {
        this();
        this.os = os;  // Can't changed after purchasing the laptop
        // Getter method
        this.size = size; // I can upgrade/ replace the existing
        // after sometime
        // Getter and Setter
        //this.laptopId = id;

    }
    public Laptop() {
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

    // Method overloading - Same method name with different parameters or
    // different data type
    public void developCode(){
        System.out.println("Launch the code editor");
        System.out.println("Write the program");
        System.out.println("Execute the program ");
    }

    public void developCode(String os){

    }

    public void installSoftware(){
        System.out.println("It will behave differently based on the instance");
    }

    // String representation of the object
    @Override
    public String toString() {
        return "Laptop{" +
                "laptopId=" + laptopId +
                ", os='" + os + '\'' +
                '}';
    }
}
