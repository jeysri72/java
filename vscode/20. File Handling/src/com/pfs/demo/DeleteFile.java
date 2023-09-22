package com.pfs.demo;
import java.io.File;
/**
 * @author Jeyashree
 * @version 1.0
 * @since Sep 23
 * Delete a file using delete() method
 * Check for file existance before delete it 
 */
public class DeleteFile {
    public static void main(String[] args) {

        File file = new File("myfile.txt"); // Create file object to mainpulate
        if (file.exists()) { // Check for file existance
            if (file.delete())
                System.out.println(file.getName() + " is deleted");
            else
                System.out.println("Failed in deleting the file.");
        } else {
            System.out.println(file.getName() + " is not found.");
        }

    }
}
