package org.example.generics;

public class Phones extends Gadget{

    private String brand;
    private String model;

    public Phones() {
        super();
    }


    public Phones(String name, String type, String brand, String model) {
        super(name, type);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phones{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
