package org.example.multithreading;

import org.example.oops.Employee;

import java.util.List;

public class SendGreetings extends Thread{


     List<Customer> customersList;
     String name ;

    public SendGreetings() {

    }
    public SendGreetings(String name, List<Customer> customersList) {
        this.name = name;
        this.customersList = customersList;
    }



    @Override
    public void run() {

        if(name.equalsIgnoreCase("email")) {
            sendEmail();
        } else if(name.equalsIgnoreCase("sms")) {
            sendSMS();
        } else {
            System.out.println("Invalid notification type");
        }
    }


    public void sendEmail(){

        for (Customer  customer : customersList) {
            System.out.println("Sending email to: " + customer.getEmail());
            // Simulate sending email
            try {
                Thread.sleep(200); // Simulating delay in sending email
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    public void sendSMS(){

        for (Customer  customer : customersList)  {
            System.out.println("Sending SMS to: " + customer.getPhoneNumber());
            // Simulate sending SMS
            try {
                Thread.sleep(200); // Simulating delay in sending SMS
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }



}
