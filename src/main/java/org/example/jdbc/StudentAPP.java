package org.example.jdbc;

import java.util.ArrayList;
import java.util.List;

public class StudentAPP {



    public static void main(String[] args) {
        // Example usage of Student class
        StudentProcess studentProcess = new StudentProcess();
        // Create a LIST OF 100  student in list and iterate
        List<Student> students = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            students.add(new Student(i, "Student " + i, 20 + (i % 5))); // Age between 20 and 24
        }
        //In Java 8, you can use the forEach method to iterate over a list of students and print their details.

        for(Student student : students) {
           studentProcess.insertStudent(student.getId(), student.getName(), student.getAge());
        }

    }
}
