package com.pfs.demo;
/**
 * @author Jeyashree
 * @version 1.0
 * @since Sep 23
 * 
 * Access identifiers, also known as access modifiers, are keywords 
 * that specify the visibility and accessibility of classes, methods, 
 * fields, and other members within a Java program
 * 
 * This class can't run as it doesn't have main method. 
 * To test the implementation, create TestMyClass.java
 * To test the protected scope, create a new package com.pfs.external.
 * Copy TestMyClass.java and run
 */
public class MyClass {
    public String publicField = "Public: Accessible from anywhere."; // Accessible from anywhere
    private String privateField  = "Private: Accessible only within class."; // Accessible only within MyClass
    protected String protectedField = "Protected: Accessible within the same package and by subclasses"; // Accessible within the same package and by subclasses
    String defaultField = "Accessible within the same package (default access)"; // Accessible within the same package (default access)

    public void publicMethod() {
        // Accessible from anywhere
        System.out.println("I am a public method and accessible from anywhere.");
    }

    private void privateMethod() {
        // Accessible only within MyClass
        System.out.println("I am a private method and accessible within MyClass");
    }

    protected void protectedMethod() {
        // Accessible within the same package and by subclasses
        System.out.println("I am a protected method and accessible within the same package and by subclasses");
    }

    void defaultMethod() {
        // Accessible within the same package (default access)
        System.out.println("I am without access identifier. Accessible within the same package. But it is not a good practice");
    }
}
