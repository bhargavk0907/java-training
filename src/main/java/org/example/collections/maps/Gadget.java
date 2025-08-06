package org.example.collections.maps;

public class Gadget {

    private String name;

    private String brand;

    public Gadget(String name) {
        this.name = name;
    }
    public Gadget(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }
    public Gadget() {
        // Default constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
