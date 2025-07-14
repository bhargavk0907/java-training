package org.example;

public class Laptop {
    private String brand;
    private String model;
    private int ramSize; // in GB
    private int storageSize; // in GB
    private double price;

    public Laptop(String brand, String model, int ramSize, int storageSize, double price) {
        this.brand = brand;
        this.model = model;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    // Method to display laptop details
    public String displayDetails() {
        return "Laptop Details:\n" +
               "Brand: " + brand + "\n" +
               "Model: " + model + "\n" +
               "RAM Size: " + ramSize + " GB\n" +
               "Storage Size: " + storageSize + " GB\n" +
               "Price: $" + price;
    }


    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Dell", "XPS 13", 16, 512, 1299.99);
        System.out.println(myLaptop.displayDetails());
    }


}
