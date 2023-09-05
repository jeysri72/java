package com.pfs.demo;

/**
 * @author Jeyashree
 * @version 1.0
 * @since Sep 23
 *        Comments are used to provide explanations, descriptions, or notes
 *        within your code.
 *        Comments are ignored by the compiler and do not affect the execution
 *        of the program.
 *        Comments are solely for human readability and understanding.
 *        Comments are a crucial part of good coding practices because they help
 *        you and others
 *        understand the code'spurpose and functionality.They are particularly
 *        valuable for maintaining
 *        and documenting large or complex codebases.
 * 
 *        There are three types of comments in Java
 *        1. Single line
 *        2. Multi line
 *        3. DocumentorBlock
 */

public class App {

    // This is a single-line comment
    int x=42; // You can also add a comment at the end of a line of code


    /*
    * This is a multi-line comment.
    * It can span multiple lines.
    * Useful for longer explanations.
    */
    int y=24;

      /**
       * This is a documentation comment for a class or method.
       * It provides information about the class or method.
       *
       * @param param1 Description of the first parameter
       * @param param2 Description of the second parameter
       * @return Description of the return value
       * 
       *         Using documentation comments with Javadoc-style tags allows you to
       *         generate professional documentation for your code,making it easier
       *         for others to understand and use your classes and methods.
       */
      public int myMethod(int param1, int param2) {
        // Method logic here
        return param1 + param2;
      }

      // Practice to call this myMethod by creating a test class with main method

}