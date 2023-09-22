package com.pfs.demo;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Jeyashree
 * @version 1.0
 * @since Sep 23
 * Writing a file using a FileWritter object
 */

public class WriteFile {
    public static void main(String[] args)
    {
        try {
            FileWriter fileWritter = new FileWriter("myfile.txt");  // Create FileWriter object to write
            fileWritter.write("Java is Fun!!");                         // Write line using write method
            fileWritter.close();
            System.out.println("Successfully written.");
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
