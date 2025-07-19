package org.example.oops.encapsulation;

public class Encapsulation {


    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person("John Doe", 30);

        // Access and modify the person's name and age using getters and setters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Update the person's name and age
        person.setName("Mahesh");
        person.setAge(25);

        // Display the updated information
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());

        Person aditya = new Person();
        aditya.setName("Aditya");
        aditya.setAge(20);

        System.out.println("Aditya's Name: " + aditya.getName());
        System.out.println("Aditya's Age: " + aditya.getAge());

        aditya.setName("Aditya Kumar");
        aditya.setAge(21);

        System.out.println("Aditya's Name: " + aditya.getName());
        System.out.println("Aditya's Age: " + aditya.getAge());
    }
}
