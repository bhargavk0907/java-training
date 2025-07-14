package org.example.oops;

public class Employee extends Person {
    private String employeeId;
    private String department;

    public Employee(String name, String address, String employeeId, String department) {
        super(name, address);
        this.employeeId = employeeId;
        this.department = department;
    }
//Default constructor


    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    //setters
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    //setters
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
