package org.example.collections.sets;

public class Customer {

    private String name;
    private int age;

    private Address address;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Customer(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Customer() {
        // Default constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
