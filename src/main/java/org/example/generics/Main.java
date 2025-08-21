package org.example.generics;

public class Main {

    public static void main(String[] args) {
        // Example usage of PrintInteger


        // Example usage of GenericConcat
        GenericConcat<String> stringConcat = new GenericConcat<>("Hello");
        GenericConcat<Integer> integerConcat = new GenericConcat<>(42);
        GenericConcat<Double> doubleConcat = new GenericConcat<>(3.14);
        stringConcat.concat(" World");
        integerConcat.concat(58);
        doubleConcat.concat(1.86);



    }
}
