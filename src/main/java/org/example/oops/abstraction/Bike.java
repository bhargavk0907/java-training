package org.example.oops.abstraction;

public class Bike extends Vehicle {

    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void stop(String type) {
        super.stop(type);
        System.out.println("Bike is stopping");
    }

    public void ride() {
        System.out.println("Riding the bike");
    }



}
