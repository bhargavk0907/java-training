package org.example.generics;

public class PrintDouble {

    Double value;

    public PrintDouble() {
    }

    public PrintDouble(Double value) {
        this.value = value;
    }

    public void print() {
        if (value != null) {
            System.out.println("Double value: " + value);
        } else {
            System.out.println("No value to print");
        }
    }
}
