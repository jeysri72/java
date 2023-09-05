package com.pfs.demo;
/**
 * @author Jeyashree
 * @version 1.0
 * @since Sep 23
 */
public class TestMyClass {
    public static void main(String[] args) {
        // To access the methods and fields in MyClass, create the instance of MyClass

        // <Class Name> <Instance Name> = <Keyword> <Default Constructor Method>
        MyClass myCls = new MyClass();

        // Call public method and execute. You will see the display in the console
        // "I am a public method and accessible from anywhere."
        myCls.publicMethod();

        
        // Call protected method and execute. You will see the display in the console
        // "I am a protected method and accessible within the same package and by subclasses"
        myCls.protectedMethod();
        

        // Call default access method and execute. You will see the display in the console
        // "I am without access identifier. Accessible within the same package. But it is not a good practice"
        myCls.defaultMethod(); 


        // Call private method and execute. You will see the compliation error in problems window
        // "The method privateMethod() from the type MyClass is not visible"
        // myCls.privateMethod();

        System.out.println(myCls.publicField);
        System.out.println(myCls.protectedField);
        System.out.println(myCls.defaultField);
        // System.out.println(myCls.privateField); // Compilation error The field MyClass.privateField is not visible
        



    }
}
