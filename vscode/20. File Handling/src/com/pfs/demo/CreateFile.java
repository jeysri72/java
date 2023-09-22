package com.pfs.demo;
import java.io.File;
import java.io.IOException;
/**
 * @author Jeyashree
 * @version 1.0
 * @since Sep 23
 * create a File object by providing the file path as a string or a File object representing 
 * the parent directory and the file name.
 */
public class CreateFile {
    public static void main(String[] args)  {
        try {
            File file = new File("myfile.txt");                 // Declare the file object
            if (file.createNewFile()) {                                  // Create a file object
                System.out.println(file.getName() + " is created ");    
            }
            else {
                System.out.println(file.getName ()+ " already exists.");
            }
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
