package org.example.oops.polymorphism;

public class Polymorphism {

    public static void main(String[] args) {
        Operations operations = new Operations();

        System.out.println(operations.add(1, 2));
        System.out.println(operations.add(1.5, 2.5));
        System.out.println(operations.add("Hello", "World"));
        System.out.println(operations.add(new int[]{1, 2, 3, 4, 5}));
    }
}
