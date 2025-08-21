package org.example.generics;

public class Gadget {

    private String name;
    private String type;

    public Gadget() {
    }

    public Gadget(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void displayInfo() {
        System.out.println("Gadget Name: " + name + ", Type: " + type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
