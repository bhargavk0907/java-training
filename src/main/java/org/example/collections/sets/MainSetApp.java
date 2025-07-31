package org.example.collections.sets;

import java.util.*;

public class MainSetApp {

    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();

        // Adding elements to the set
        stringSet.add("Hello");
        stringSet.add("World");
        stringSet.add("Hello"); // Duplicate, will not be added
        stringSet.add("Java");
        stringSet.add("Collections");
        stringSet.add("Sets");

        System.out.println("Set contents: " + stringSet);


        Set<Integer> integerSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet

        integerSet.add(10);

        integerSet.add(20);

        integerSet.add(30);

        integerSet.add(10);

        integerSet.add(40);

        System.out.println("LinkedHashSet contents: " + integerSet);


        Set<String> treeSet = new java.util.TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add("Banana");

        treeSet.add("Apple");

        treeSet.add("Cherry");

        treeSet.add("Cherry");
        treeSet.add("Date");

        System.out.println("TreeSet contents: " + treeSet);



        //| Method                            | What It Does                  |
        //| --------------------------------- | ----------------------------- |
        //| `add(E e)`                        | Add element if not present    |
        //| `addAll(Collection<? extends E>)` | Union with another collection |
        //| `remove(Object o)`                | Remove specific element       |
        //| `contains(Object o)`              | Membership test               |
        //| `isEmpty()`                       | Is the set empty?             |
        //| `size()`                          | Number of elements            |
        //| `clear()`                         | Remove all elements           |
        //| `iterator()`                      | For looping                   |
        //| `retainAll(Collection<?>)`        | Intersection                  |
        //| `removeAll(Collection<?>)`        | Difference                    |

        //| Method                   | What it does                      |
        //| ------------------------ | --------------------------------- |
        //| `first()`                | Smallest element                  |
        //| `last()`                 | Largest element                   |
        //| `headSet(E toElement)`   | Elements less than `toElement`    |
        //| `tailSet(E fromElement)` | Elements greater than or equal    |
        //| `subSet(E from, E to)`   | Elements in range                 |
        //| `comparator()`           | Returns custom comparator, if any |


    }
}
