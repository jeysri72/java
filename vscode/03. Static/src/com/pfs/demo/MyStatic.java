package com.pfs.demo;

/**
 * @author Jeyashree
 * @version 1.0
 * @since Sep 23
 * 
 * `Static` keyword is used to define a member (variable or method)
 * that belongs to the class rather than to any specific instance (object) of
 * the class. When a member is declared as `static`, it means the following:
 * 
 * 1. Static Variables (Class Variables): A static variable, also known as a
 * class variable, is shared among all instances of a class. It's stored in a
 * common memory location that is allocated when the class is loaded by the Java
 * Virtual Machine (JVM). All objects of the class share the same static
 * variable, and any changes made to it are reflected across all instances.
 * Static variables are often used for constants, counters, or data that should
 * be common to all instances of a class.
 * 
  * 2. Static Methods: A static method is associated with the class itself
 * rather than with any specific object of the class. You can call a static
 * method using the class name without needing to create an instance of the
 * class. Static methods are commonly used for utility methods, where the
 * operation doesn't depend on the state of any specific object.
 * 
 * 3.Static Blocks: A static block is a block of code enclosed in `{}` and
 * preceded by the `static` keyword. It is executed only once when the class is
 * loaded by the JVM, typically used for initializing static variables or
 * performing other setup tasks that need to be done once when the class is
 * first loaded.
 * 
.*/
public class MyStatic {
    public static String staticVariable = "Static: Shared among instances"; // Static variable shared among all
                                                                            // instances
    public String publicVariable = "Public: Requires instance to access";

    public static void staticMethod() {
        // Static method logic
        System.out.println("Static method doesn't require instantiation");
    }

    public void publicMethod() {
        // Public method logic
        System.out.println("Public method requires instantiation to access");
    }

    static {
        // Static block logic (executed when the class is loaded)
    }

}
