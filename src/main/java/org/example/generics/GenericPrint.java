package org.example.generics;

public class GenericPrint<T, U> {

    private T value;

    private U additionalValue;
    private String typeName;

    public GenericPrint() {
    }




    public GenericPrint(T value, U additionalValue, String typeName) {
        this.value = value;
        this.additionalValue = additionalValue;
        this.typeName = typeName;
    }

    public void print() {
        if (value != null) {
            System.out.println("Value: " + value + " of type: " + (typeName != null ? typeName : value.getClass().getSimpleName()));
            if (additionalValue != null) {
                System.out.println("Additional Value: " + additionalValue);
            }
        } else {
            System.out.println("No value to print");
        }
    }
}
