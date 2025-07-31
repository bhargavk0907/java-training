package org.example.collections;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {

    private String name;
    private int capacity;

   private List<Student> students = new ArrayList<>();

    public ClassRoom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public ClassRoom(String name, int capacity, ArrayList<Student> students) {
        this.name = name;
        this.capacity = capacity;
        this.students = students;
    }

    public ClassRoom() {
        // Default constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

}
