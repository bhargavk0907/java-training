package org.example.oops.polymorphism;

public class Operations {

    public int add(int a, int b) {
        return addTwoNumbers(a, b);
    }


    private int addTwoNumbers(int a, int b) {
        System.out.println(" Calling addTwoNumbers method");
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public int add(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
