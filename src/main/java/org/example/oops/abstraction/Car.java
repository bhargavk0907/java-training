package org.example.oops.abstraction;

public class Car extends Vehicle{

    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car() {
        // Default constructor
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    //Run time polymorphism
    @Override
    public void stop(String type) {
        System.out.println( "My Car is stopping");
    }
}
