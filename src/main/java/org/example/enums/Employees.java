package org.example.enums;

public enum Employees {

    IT("Information Technology", 1, "Regular"),
    MANAGERS("Management", 2, "Contract");

    private String department;
    private int id;
    private String type;

    Employees(String department, int id, String type) {
        this.department = department;
        this.id = id;
        this.type = type;
    }


    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    //get departname by id
    public static String getDepartmentById(int id) {
        for (Employees employee : Employees.values()) {
            if (employee.getId() == id) {
                return employee.getDepartment();
            }
        }
        return null; // or throw an exception if preferred
    }

    //get type by id
    public static String getTypeById(int id) {
        for (Employees employee : Employees.values()) {
            if (employee.getId() == id) {
                return employee.getType();
            }
        }
        return null; // or throw an exception if preferred
    }







}
