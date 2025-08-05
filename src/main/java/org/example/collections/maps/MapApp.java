package org.example.collections.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapApp {

    public static void main(String[] args) {
        // Create a new Customer object
//        Customer customer = new Customer("John Doe", 30, "New York");
//
//        // Print customer details
//        Customer customer2 = new Customer("Jane Smith", 25, "Los Angeles");
//
//        MapProcessor mapProcessor = new MapProcessor();
//
//        mapProcessor.addCustomer(customer);
//        mapProcessor.addCustomer(customer2);


        HashMap<String, String> map = new HashMap<>();

        map.put("A", "Apple");
        map.put("B", "Banana");
        map.put("C", "Cherry");
        map.put("D", "Date");
        map.put("E", "Elderberry");



        Map<Integer, String> map1 = new HashMap<>();

        map1.put(1, "January");
        map1.put(2, "February");
        map1.put(3, "March");
        map1.put(4, "April");
        map1.put(5, "May");
        map1.put(6, "June");
        map1.put(6, "May");


        System.out.println("Map contents: " + map1.keySet() + map1.values());

        for(Map.Entry<Integer, String> entry : map1.entrySet()) {

            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


        List<String> values = new ArrayList<>(map1.values());

        for(String value : values) {
            System.out.println("Value: " + value);
        }







        System.out.println("Map contents: " + map.keySet());

        map.get("A");



        List<String> fruits = new ArrayList<>();
        fruits.add("Fig");
        fruits.add("Grapes");

        fruits.add("Honeydew");
        fruits.add("Apple");

        for(String fruit : fruits) {
            System.out.println(fruit.charAt(0));
        }










    }

}
