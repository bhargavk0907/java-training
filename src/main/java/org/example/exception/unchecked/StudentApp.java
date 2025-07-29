package org.example.exception.unchecked;

public class StudentApp {

    public static void main(String[] args) {
        // Create an Address object

        Student student = new Student();
        // Create a StudentService object
        StudentService studentService = new StudentService();

        try {
            // Process the student
            studentService.processStudent(student);

        } catch (Exception e) {
            // Handle the exception
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}