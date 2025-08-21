package org.example.java8.lambdas;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // Example usage of PrintInteger

        //List<Integer> integers1 = List.of(10, 2, 3, 4, 5);

        List<Integer> integers = Arrays.asList(10, 2, 3, 4, 5);


        Collections.sort(integers, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer a, Integer b) {

                        return a.compareTo(b);
                    }
                }
        );

        // Using a lambda expression for sorting
        Collections.sort(integers, (a, b) -> a.compareTo(b));

        integers.forEach(integer -> {
            System.out.println("Integer: " + integer);
            if (integer > 3) {
                System.out.println("Integer greater than 3: " + integer);
            }
        });

        for(Integer itn1 : integers) {
            System.out.println("Integer: " + itn1);
            if (itn1 > 3) {
                System.out.println("Integer greater than 3: " + itn1);
            }
        }



        // Using a lambda expression for filtering 16 and above
        List<Integer> filteredIntegersLambda = integers.stream()
                .filter(integer -> integer > 3)
                .toList();


        //List<Integer> filteredIntegersLambda = integers.stream()
        //        .filter(integer -> integer > 3)   // This is the lambda
        //        .toList();


        List<Integer> list = new ArrayList<>();
        for(Integer itn2 : integers) {

            if(itn2 > 3) {
                System.out.println("Integer greater than 3: " + itn2);
                list.add(itn2);
            }
        }


        //Difference between collectors and tolist 8 and above
        List<Integer> filteredIntegersCollector = integers.stream()
                .filter(integer -> integer > 3)
                .collect(Collectors.toList());





        System.out.println("Sorted integers: " + integers + "    "+  filteredIntegersLambda);

    }

}
