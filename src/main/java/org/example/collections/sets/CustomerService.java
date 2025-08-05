package org.example.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class CustomerService {

    private Set<Customer> customerSet = new HashSet<>();



    public void addCustomer(Customer customer) {
        // Logic to add customer
        if (customerSet.add(customer)) {
            System.out.println("Customer added: " + customer);
        } else {
            System.out.println("Customer already exists: " + customer);
        }
    }

    public void removeCustomer(Customer customer) {
        // Logic to remove customer
        System.out.println("Removing customer: " + customer);
        if (customerSet.remove(customer)) {
            System.out.println("Customer removed: " + customer);
        } else {
            System.out.println("Customer not found: " + customer);
        }
    }

    public void updateCustomer(Customer customer) {
        // Logic to update customer   iterate the set and if it contains name than replace customer

        boolean found = false;

        for (Customer existingCustomer : customerSet) {
            if (existingCustomer.getName().equals(customer.getName())) {
                customerSet.remove(existingCustomer);
                customerSet.add(customer);
                System.out.println("Customer updated: " + customer);
                found = true;
                return;
            }
        }

        if (!found) {
            System.out.println("Customer not found for update: " + customer);
        }



    }

    public Customer findCustomerByName(String name) {
        // Logic to find a customer by name
        // For demonstration, returning a dummy customer
        for (Customer customer : customerSet) {
            if (customer.getName().equals(name)) {
                System.out.println("Customer found: " + customer);
                return customer;
            }
        }
        return null;
    }

}
