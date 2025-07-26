package org.example.exception;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

    public void test1(String[] args) {

        File file = new File("non_existent_file.txt");
        BufferedReader br = null;

        try {
            file.createNewFile();
             br = new BufferedReader(new FileReader("data10.txt"));   // This will throw IOException if the file cannot be created
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }finally {

            System.out.println("Finally block executed");
            // Clean up resources, if necessary
            // For example, delete the file if it was created
           if( file.exists()) {
               file.delete();

            }
           if(br != null) {
               try {
                   br.close();
               } catch (IOException e) {
                   System.out.println("Error closing BufferedReader: " + e.getMessage());
               }
           }
        }

    }
}
