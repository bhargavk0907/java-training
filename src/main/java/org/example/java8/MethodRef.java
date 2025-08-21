package org.example.java8;

import java.util.List;

public class MethodRef {


    public static void main(String[] args) {
        // Using method reference to refer to a static method

        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

//        names.stream()
//                .map(String::toUpperCase) // Method reference to the static method
//                .forEach(Logger::log); // Method reference to an instance method of a particular object

        names.stream()
                .map(User::new) // Constructor reference
                .forEach(person -> Logger.log(person.getName())); // Using the Logger class to log user names
    }




}
