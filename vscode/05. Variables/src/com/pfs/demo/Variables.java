package com.pfs.demo;

/**
 * @author Jeyashree
 * @version 1.0
 * @since Sep 23
 *
 *        Java core concepts
 *        1. Variables
 *        2. Operations
 *        3. Classes + Objects
 *        3.1 Fields
 *        3.2 Constructors
 *        3.3 Methods
 *        4. Interfaces
 *        5. Packages
 *
 *        variable is a symbolic name or identifier that is used to represent a
 *        value stored in the computer's memory. Variables allow programmers to
 *        work with and manipulate data in their programs. They serve as
 *        containers for storing and retrieving information during the execution
 *        of a program.
 * 
 *        Key characteristics of variables in most programming languages
 *        include:
 * 
 *        Name: A variable has a name, which is used to refer to it in the code.
 *        Variable names are typically chosen to be meaningful and descriptive,
 *        helping programmers understand the purpose of the variable.
 * 
 *        Data Type: Variables have a data type that specifies the kind of data
 *        they can store. Common data types include integers, floating-point
 *        numbers, characters, strings, boolean values, and custom data types.
 * 
 *        Value: A variable can hold a specific value of its associated data
 *        type. This value can change during the execution of the program, which
 *        is why it's called a "variable."
 * 
 *        Memory Location: Variables are associated with a specific memory
 *        location or address in the computer's memory where their values are
 *        stored.
 * 
 *        
 *        Types of Variables
 *        1. Non-static/ Instance fields - It belongs to the object (instence of the class).
 *        That means the field's value can't be shared among the instances of same class
 *        Ex: Class A,
 *        Has variable x
 *        Instances m, n, o
 *        The value of 'x' can be different in all three instances
 * 
 *        2. Static fields - It belongs to the class. It is shared among all the objects
 *        Ex: Class
 *        Has variable x
 *        Instances m, n, o
 *        The value of 'x' is same in all three instances. It sould be declared
 *        as static
 *
 *        3. Local variables - It is defined inside the method. Accessed only by
 *        the method.
 *
 *        4. Parameters - It is a variable that passed to method as an argument
 *        from the caller
 *
 *        5. Final Fields - It is final. The value can't be changed. Mostly used
 *        to define the constants.
 *
 *
 *        Data Types of Variables
 *        1. Primitive Data types
 *        List of types are not objects and not referenced to objects
 *        boolean - A binary value of either true or false
 *        byte - 8 bit signed value, values from -128 to 127
 *        short - 16 bit signed value, values from -32.768 to 32.767
 *        char - 16 bit Unicode character ('\u0000' to '\uFFFF' Can be treated as integer in the range of [0, 65535] in arithmetic operations).
 *        int - 32 bit signed value. Number without decimals
 *        long - 64 bit signed value. Number without decimals
 *        float - 32 bit floating point value. Number with decimals
 *        double - 64 bit floating point value. Number with decimals
 *
 *        List of types are as objects
 *        Boolean - A binary value of either true or false
 *        Byte - 8 bit signed value, values from -128 to 127
 *        Short - 16 bit signed value, values from -32.768 to 32.767
 *        Character - 16 bit Unicode character
 *        Integer - 32 bit signed value, values from -2.147.483.648 to
 *        2.147.483.647
 *        Long - 64 bit signed value, values from -9.223.372.036.854.775.808 to
 *        9.223.372.036.854.775.808
 *        Float - 32 bit floating point value
 *        Double - 64 bit floating point value
 *        String - N byte Unicode string of textual CourseManager. Immutable
 *
 *        Note that the non-object primitive data type begins with lower case (long),
 *        where as the object begins with upper case (Long)
 *
 *        Variables should be declared as <Data Type> variableName.
 *        Variables should be defined using camel case
 *
 *
 */

public class Variables {
  int myInstance;
  static int mySatic;

  public static void main(String[] args) {
    double pi;          // Declaration of a double variable named "pi"
    pi = 3.14159265359; // Assignment of a value to "pi"
    
    double temperature = 98.6; // Declaration and initialization of a double variable "temperature"
    
    double x, y, z;            // Declaration of multiple double variables in one line separated by ,
    
     
 
 
    // Declaration of primitive data type - non-object

    int varInt = 88;
    short varShort = 888;
    long varLong = 8888888;

    double varDouble = 55.0;
    float varFloat = 88.88f;

    char varChar = 'j';

    boolean varBoolean = false;

    byte varByte = 127;

    // Wrapper classes

    Integer intValue; // Declaration
    intValue = 42; // Initialization

    Double doubleValue = 3.14159265359; // Declaration and initialization

    Character charValue = 'A'; // Declaration and initialization

    Boolean booleanValue = true; // Declaration and initialization

    Long longValue = 1234567890L; // Declaration and initialization
    
    Short shortValue = (short) 32000; // Declaration and Initialization (casting is required for short)
    

    /*
     * System.out.println(varInt);
     * System.out.println(varShort);
     * System.out.println(varLong);
     * System.out.println(varDouble);
     * System.out.println(varFloat);
     * System.out.println(varChar);
     * System.out.println(varBoolean);
     * System.out.println(varByte);
     */

  }

}