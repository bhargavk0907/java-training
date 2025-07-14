package org.example.oops;

public class Inheritence {

    public static void main(String[] args) {
        // Create an instance of the Child class
       Employee employee = new Employee("John Doe", "123 Main St", "E001", "HR");

        System.out.println(employee.toString());

        // Student

        Student student = new Student("Jane Doe", "456 Elm St", "S001", "Computer Science");
        System.out.println(student.toString());


        Cat cat = new Cat();

        // sout
       cat.eat();
        cat.sleep();

    }



}
