package org.example.generics;

public class PrintInteger {


    Integer value;

    public PrintInteger() {
    }
    public PrintInteger(Integer value) {
        this.value = value;
    }
    public void print() {
        if (value != null) {
            System.out.println("Integer value: " + value);
        } else {
            System.out.println("No value to print");
        }
    }
}
