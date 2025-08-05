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


        //
        Address address = new Address("123 Main St", "Springfield", "IL");
        Address address2 = new Address("456 Elm St", "Springfield", "IL");
        Customer customer1 = new Customer("Mahesh", 25, address);
        Customer customer2 = new Customer("Bhavya", 25, address2);
        Customer customer3 = new Customer("Sreeja", 25, address2);

        Set<Customer> customerSet = new HashSet<>();

        customerSet.add(customer1);
        customerSet.add(customer2);
        customerSet.add(customer3);

        CustomerService customerService = new CustomerService();



        for (Customer customer : customerSet) {

            customerService.addCustomer(customer);

        }

        customer1.setAge(24);

        customerService.updateCustomer(customer1);

        customerService.removeCustomer(customer2);

      Customer sreeja =    customerService.findCustomerByName("Sreeja");

        System.out.println("Found Customer: " + sreeja);









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
