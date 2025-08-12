package org.example.collections.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewMapApp {

    public static void main(String[] args) {
        // Create a new map to store customer data

        List<String> veggies = new ArrayList<>();
        veggies.add("Carrot");
        veggies.add("Broccoli");

        for (String veggie : veggies) {
            System.out.println("Veggie: " + veggie);
        }


        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");

        List<String> proteinsList = new ArrayList<>();
        proteinsList.add("Chicken");
        proteinsList.add("Fish");
        proteinsList.add("Tofu");

        List<String> grainsList = new ArrayList<>();
        grainsList.add("Rice");
        grainsList.add("Wheat");
        grainsList.add("Oats");
        grainsList.add("Quinoa");

        List<String> dairyList = new ArrayList<>();
        dairyList.add("Milk");
        dairyList.add("Cheese");
        dairyList.add("Yogurt");


        Map<String, List<String>> foodMap = new HashMap<>();
        foodMap.put("Vegetables", veggies);
        foodMap.put("Fruits", fruitsList);
        foodMap.put("Proteins", proteinsList);
        foodMap.put("Grains", grainsList);
        foodMap.put("Dairy", dairyList);

        System.out.println("Food Categories and Items:" + foodMap);

        for (Map.Entry<String, List<String>> entry : foodMap.entrySet()) {
            if (entry.getKey().equals("Fruits")) {

//                List<String>    fruits = entry.getValue();
//                fruits.add("Mango");
//                foodMap.put("Fruits", fruits);

                foodMap.get(entry.getKey()).add("Strawberry");
                foodMap.get(entry.getKey()).add("Pineapple");

                System.out.println("Updated " + entry.getKey() + ": " + foodMap.get(entry.getKey()));


            }

            List<String> items = entry.getValue();

            for (String item : items) {
                System.out.println("Category: " + entry.getKey() + ", Item: " + item);
            }


        }
    }


}
