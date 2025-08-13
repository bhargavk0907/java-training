package org.example.generics;

public class GenMain {


    public static void main(String[] args) {

        PrintInteger printInteger = new PrintInteger(42);
        printInteger.print();

        PrintString printString = new PrintString("Hello, Generics!");
        printString.print();
        PrintDouble printDouble = new PrintDouble(3.14);
        printDouble.print();

        GenericPrint<String,   String> genericPrintString = new GenericPrint<>("Generic String", "String Type", "String");
        genericPrintString.print();
        GenericPrint<Integer , String> genericPrintInteger = new GenericPrint<>(100, "Integer Type",    "Integer");
        genericPrintInteger.print();
            GenericPrint<Double, Integer> genericPrintDouble = new GenericPrint<>(2.718,     1000 , "Double Type");
        genericPrintDouble.print();

    }

    public static <V> V  printGeneric(V value, String typeName) {
        if (value != null) {
            System.out.println("Value: " + value + " of type: " + (typeName != null ? typeName : value.getClass().getSimpleName()));
        } else {
            System.out.println("No value to print");
        }

        return value;
    }
}
