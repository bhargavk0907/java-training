package org.example.multithreading;

import java.util.ArrayList;
import java.util.List;

public class MultiExample {


    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();

        for(int i = 0; i < 10000; i++) {
            customers.add(new Customer("Customer" + i, "customer" + i + "@example.com", "123456789" + i));
        }

        SendGreetings emailThread = new SendGreetings("email", customers);

        SendGreetings smsThread = new SendGreetings("sms", customers);

        emailThread.start();
        smsThread.start();
        try {
            emailThread.join();
            smsThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All greetings sent successfully!");
    }



}
