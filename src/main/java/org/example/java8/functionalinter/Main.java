package org.example.java8.functionalinter;

public class Main {

    public static void main(String[] args) {
        // Example usage of Compare interface


        Compare compare = (a, b) -> Integer.compare(a, b);

        System.out.println("Comparing 5 and 10: " + compare.compare(5, 1));
        System.out.println("Is 5 greater than 10? " + compare.isGreater(5, 10));
        System.out.println("Is 5 less than 10? " + Compare.isLess(5, 10));


        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running task in thread: " + Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(task);
        t1.start();



        Runnable task1 = () -> System.out.println("Running task in thread: " + Thread.currentThread().getName());

        Thread t2 = new Thread(task1);
        t2.start();
    }


}
