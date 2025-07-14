package org.example.operators;

public class Operators {

    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;




        System.out.println("Addition: " + (a + b)); // 15
        System.out.println("Subtraction: " + (a - b)); // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b)); // 2
        System.out.println("Modulus: " + (a % b)); // 0

        // Relational Operators
        System.out.println("Is a greater than b? " + (a > b)); // true
        System.out.println("Is a less than b? " + (a < b)); // false
        System.out.println("Is a equal to b? " + (a == b)); // false

        // Logical Operators
        boolean x = true;
        boolean y = false;

        // T T -- T T F ,

        System.out.println("Logical AND: " + (x && y)); // false
        System.out.println("Logical OR: " + (x || y)); // true
        System.out.println("Logical NOT: " + (!x)); // false

        // Bitwise Operators
        int m = 2; // 0101 in binary
        int n = 3; // 0011 in binary
        System.out.println("Bitwise AND: " + (m & n)); // 1 (0001)
        System.out.println("Bitwise OR: " + (m | n)); // 7 (0111)
        System.out.println("Bitwise XOR: " + (m ^ n)); // 6 (0110)

        if(!(m>n)){
            System.out.println("n is not greater than m");
        } else {
            System.out.println("m is greater than n");
        }
    }
}
