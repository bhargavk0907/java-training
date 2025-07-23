package org.example.files;

import java.io.*;

public class FilesMain {

    public static void main(String[] args)  {

        try {
            File file = new File("data.txt");
            if (file.createNewFile()) {
                System.out.println("File created!");
            } else {
                System.out.println("File already exists.");
            }
            System.out.println("Path: " + file.getAbsolutePath());


            BufferedWriter bw = new BufferedWriter(new FileWriter("data2.txt"));
            bw.write("Hello, world!");
            bw.newLine();
            bw.write("Another line.");
            bw.newLine();
            bw.write("Third line.");
            bw.close();


            //read the file
            BufferedReader br = new BufferedReader(new FileReader("data1.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();


        }catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
            System.out.println("File operations completed.");
        }

    }
}
