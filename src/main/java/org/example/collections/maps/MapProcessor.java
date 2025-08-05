package org.example.collections.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapProcessor {

    Map<String, Customer> customerMap = new HashMap<>();

    Map<String, List<Customer>> cityCustomerMap = new HashMap<>();


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


}
