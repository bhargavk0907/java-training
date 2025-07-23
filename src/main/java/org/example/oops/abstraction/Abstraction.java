package org.example.oops.abstraction;

import java.util.*;

public class Abstraction {

    

    public   static void main(String[] args) {
        // Create a Car object
        Car car = new Car("Toyota", "Red");

        // Display car details
        System.out.println(car);

        // Start the vehicle
        car.start();

        car.stop("car");

        // Create a Vehicle object
       ;

        // Start the vehicle

        Vehicle vehicle = new Car("Honda", "Blue");

        vehicle.start();
        vehicle.stop("vehicle");

        vehicle.toString();

        ((Car) vehicle).getDetails();

        List<String> list = new LinkedList<>();

        Set<String> set = new TreeSet<>();


        Vehicle vehicle1 = new Bike();

        ((Bike) vehicle1).ride();

        vehicle1.start();
        vehicle1.stop("vehicle1");


        
















    }


}
