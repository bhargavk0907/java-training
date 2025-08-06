package org.example.collections.maps;

import java.util.*;

public class MapProcessor {

    Map<String, Customer> customerMap = new HashMap<>();

    Map<String, List<Customer>> cityCustomerMap = new HashMap<>();

    Map<String, List<Gadget>> brandGadgetMap = new HashMap<>();

    Map<String, Set<Gadget>> brandGadgetSetMap = new HashMap<>();


    public void addCustomer( Customer customer) {
        if (customer != null && customer.getName() != null) {
            customerMap.put(customer.getName(), customer);
        } else {
            System.out.println("Invalid customer data");
        }
    }

    public void addCustomersByCity(Customer customer) {
        if (customer != null && customer.getCity() != null) {


           if(cityCustomerMap.containsKey(customer.getCity())) {

               //map.get(key) returns the value for the key

               List<Customer> existingCustomers = cityCustomerMap.get(customer.getCity());

               existingCustomers.add(customer);
               cityCustomerMap.put(customer.getCity(), existingCustomers);


           } else {

               List <Customer> customers = new ArrayList<>();

               customers.add(customer);

               cityCustomerMap.put(customer.getCity(), customers);
           }
        } else {
            System.out.println("Invalid customer data");
        }

        for(Map.Entry<String, List<Customer>> entry : cityCustomerMap.entrySet()) {

            System.out.println("City: " + entry.getKey() + ", Customers: " + entry.getValue().size());
        }


    }

    public void addGadgetByBrand(Gadget  gadget) {
        if (gadget != null && gadget.getBrand() != null) {
            if(brandGadgetMap.containsKey(gadget.getBrand())) {

                //map.get(key) returns the value for the key

//                List<Gadget> existingGadgets = brandGadgetMap.get(gadget.getBrand());
//
//                existingGadgets.add(gadget);
//                brandGadgetMap.put(gadget.getBrand(), existingGadgets);

                brandGadgetMap.get(gadget.getBrand()).add(gadget);
                brandGadgetSetMap.get(gadget.getBrand()).add(gadget);


            } else {

//                List <Gadget> gadgets = new ArrayList<>();
//
//                gadgets.add(gadget);
//
//                brandGadgetMap.put(gadget.getBrand(), gadgets);
                brandGadgetMap.put(gadget.getBrand(), new ArrayList<>(List.of(gadget)));
                brandGadgetSetMap.put(gadget.getBrand(), new HashSet<>(Set.of(gadget)));
            }
            // Logic to add gadget by brand
        } else {
            System.out.println("Invalid gadget data");
        }
        System.out.println("Brand Gadget Map: " + brandGadgetMap);
    }

    public void iterateSets(){

        for(Map.Entry<String, Set<Gadget>> entry : brandGadgetSetMap.entrySet()) {

            //key, value //String, Set<Gadget>

            //for(Gadget gadget : gadgetSet) {

            Set<Gadget> gadgetSet = entry.getValue();

            for(Gadget gadget : gadgetSet) {
                System.out.println("Brand: " + entry.getKey() + ", Gadget: " + gadget.getName());
            }

            System.out.println("Brand: " + entry.getKey() + ", Gadgets: " + entry.getValue().size());
        }


    }


    //| Method                        | Description                                                      |
    //| ----------------------------- | ---------------------------------------------------------------- |
    //| `put(K key, V value)`         | Adds or updates the value for the specified key.                 |
    //| `get(Object key)`             | Returns the value for the specified key, or `null` if not found. |
    //| `remove(Object key)`          | Removes the mapping for the specified key.                       |
    //| `containsKey(Object key)`     | Checks if the map contains the specified key.                    |
    //| `containsValue(Object value)` | Checks if the map contains the specified value.                  |
    //| `size()`                      | Returns the number of key-value mappings.                        |
    //| `isEmpty()`                   | Returns `true` if the map is empty.                              |
    //| `clear()`                     | Removes all mappings from the map.                               |


//| Method       | Description                                                       |
//| ------------ | ----------------------------------------------------------------- |
//| `keySet()`   | Returns a `Set<K>` of all keys.                                   |
//| `values()`   | Returns a `Collection<V>` of all values.                          |
//| `entrySet()` | Returns a `Set<Map.Entry<K, V>>` to iterate over key-value pairs. |



}
