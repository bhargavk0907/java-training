package org.example.java8.functionalinter;

@FunctionalInterface
public interface Compare {

    int compare(int a, int b);
    default boolean isGreater(int a, int b) {
        return compare(a, b) > 0;
    }
    static boolean isLess(int a, int b) {
        return a < b;
    }
    default boolean isInteger(int a, int b) {
        return compare(a, b) > 0;
    }


}
