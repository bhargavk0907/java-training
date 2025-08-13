package org.example.generics;

public class PrintString {

    String value;

    public PrintString() {
    }

    public PrintString(String value) {
        this.value = value;
    }

    public void print() {
        if (value != null) {
            System.out.println("String value: " + value);
        } else {
            System.out.println("No value to print");
        }
    }
}
