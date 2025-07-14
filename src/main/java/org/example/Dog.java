package org.example;

public class Dog {
    private String name;
    private String breed;
    private int age; // in years
    private double weight; // in kg

    public Dog(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    // add method for bark
    public String bark() {
        return name + " says Woof!";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // add method for sleep void
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
