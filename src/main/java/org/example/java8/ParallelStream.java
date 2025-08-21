package org.example.java8;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStream {

    public static void main(String[] args) {
        // Example usage of parallel stream

        List<Integer> numbers = IntStream.rangeClosed(1, 1000) // 1 to 10000 inclusive
                .boxed()               // Convert int to Integer
                .collect(Collectors.toList());


        System.out.println("Start PARALLEL STREAM" + LocalDateTime.now());
        numbers.parallelStream()
                // Square the even numbers
                .filter(n -> n % 2 == 0) // Filter even numbers
                .map(n -> n * n)         // Square each number
                .forEach(System.out::println); // Print each squared number
        System.out.println("End PARALLEL STREAM" + LocalDateTime.now());
        System.out.println("sTART  STREAM" + LocalDateTime.now());
        numbers.stream()
                // Square the even numbers
                .filter(n -> n % 2 == 0) // Filter even numbers
                .map(n -> n * n)         // Square each number
                .forEach(System.out::println); // Print each squared number
        System.out.println("End  Stream STREAM" + LocalDateTime.now());

    }


}
