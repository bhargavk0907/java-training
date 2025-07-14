package org.example.oops;

public class Person {

    String name;
    String address;

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //add getter and setter methods
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
