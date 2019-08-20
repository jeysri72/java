package com.bootcamp.demo;
/**
        * @author Jeyashree
        * @version 1.0
        *
        * HelloWorld Program
        * package - Grouping mechanism to collate the classes related to each other.
        * It is just a directory where you group your classes, interfaces, abstracts, etc.,
        *
        * com.bootcamp - Create the folder com->bootcamp under the project src folder
        *
        * Java class starts with access modifier public
        * HelloWorld is the class name. Class name has to be same as the file name stored in src folder.
        * It is created with .java extension.
        *
        * Build project converts the java file to class file.
        * .class  files will be located under out->production-><project name>-><package folder>->HelloWorld.class
 *
         *
         * main - is a method. It is Runnable. It has one parameter 'args' as a string array
         *
         * void - Return type
         *
         * System.out.println - Standard console output
         *
         * Follow the coding standards - Naming conventions, comments, wrapping lines etc
         * Class Name - Studly Caps - First letter of all the words must be capitalized
         * Method Name - Camel Case - First letter is lower case and the first letter
         * of all other words must be capitalized
         *
         * Wrapping line - Try not to type more than your screen width.
         *
         */
public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World!");

    }
}
