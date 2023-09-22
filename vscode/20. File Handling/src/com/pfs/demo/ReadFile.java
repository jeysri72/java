package com.pfs.demo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * @author Jeyashree
 * @version 1.0
 * @since Sep 23
 * Reading a file using a Scanner object
 */
public class ReadFile {
   public static void main(String[] args)
    {
        try {
            File file = new File("myfile.txt");
            Scanner fileReader = new Scanner(file);             // Create Scanner Object to read a file
            while (fileReader.hasNextLine()) {                  // Check for end of file
                String data = fileReader.nextLine();            // Read line by line 
                System.out.println(data);
            }
            fileReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    } 
}
