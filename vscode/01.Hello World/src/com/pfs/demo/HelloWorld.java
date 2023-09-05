package com.pfs.demo;

/**
 * @author Jeyashree
 * @version 1.0
 * @since Sep 23
 *
 *          HelloWorld Program
 *          package - Grouping mechanism to collate the classes related to each
 *          other.
 *          It is just a directory where you group your classes, interfaces,
 *          abstracts, etc.,
 *
 *          com.pfs.demo - Create the folder com->pfs->demo under the project
 *          src folder
 *
 *          Java class starts with access modifier / indetifier public
 *          HelloWorld is the class name. Class name has to be same as the file
 *          name stored in src folder.
 *          It is created with .java extension.
 *
 *          Build project converts the java file to class file.
 *          .class files will be located under
 *          out->production-><project name>-><package folder>->HelloWorld.class
 *          in IntelliJ IDEA
 *          bin-><package folder>->HelloWorld.class in Visual Studio Code
 *
 *
 *          main - is a method. It is Runnable. It has one parameter 'args' as a
 *          string array
 *
 *          void - Return type
 *
 *          System.out.println - Standard console output
 *
 *          Follow the coding standards - Naming conventions, comments, wrapping
 *          lines etc
 *          Class Name - Studly Caps - First letter of all the words must be
 *          capitalized
 *          Method Name - Camel Case - First letter is lower case and the first
 *          letter
 *          of all other words must be capitalized
 *
 *          Wrapping line - Try not to type more than your screen width.
 *
 */

// <Access Modifier> <Keyword> <Class Name> 
public class HelloWorld {                       // Save as HelloWorld.java


    //<Access Modifier> <Non-Access Modifier> <Return Type> <Method Name> (List of arguments)
    public static void main(String[] args) {    // Entry point to execute the program

        System.out.println("Hello World!");   // Displays Hello World! in the console 

    }
}