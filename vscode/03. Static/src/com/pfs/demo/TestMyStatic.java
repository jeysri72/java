package com.pfs.demo;

/**
 * @author Jeyashree
 * @version 1.0
 * @since Sep 23
 * 
 * Call Static methods
 */
public class TestMyStatic {
    public static void main(String[] args) throws Exception {
        MyStatic.staticMethod();
        System.out.println(MyStatic.staticVariable);

        // MyStatic.publicMethod(); //Cannot make a static reference to the non-static method publicMethod() from the type MyStatic
        // To resolve the error in the above line, create an instance of MyStatic and try 

        MyStatic myStatic = new MyStatic();                 // Create an instance to access public method/ variable
                                                            // This applies to all non-static methods / variables
        myStatic.publicMethod();
        System.out.println(myStatic.publicVariable);

        

    }
}
