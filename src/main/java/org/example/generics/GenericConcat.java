package org.example.generics;

public class GenericConcat<T> {

    private T value;

    public GenericConcat() {
    }
    public GenericConcat(T value) {
        this.value = value;
    }

    public void concat(T value) {
        System.out.println("Concatenating value: " + value + " with existing value: " + this.value);
    }



}
