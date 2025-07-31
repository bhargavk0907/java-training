package org.example.collections;

import java.util.*;

public class ListApp {


    public static void main(String[] args) {
        // Example usage of the List class
        System.out.println("This is a placeholder for the List class.");

        ClassRoom classRoom = new ClassRoom();

        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));
        students.add(new Student("Alice", 20));
        students.add(new Student("Alice", 20));


        classRoom.setStudents((ArrayList<Student>) students);
        classRoom.setCapacity(students.size());
        classRoom.setName("Computer Science");

        System.out.println("Classroom Name: " + classRoom.getName());


        System.out.println("Classroom Capacity: " + classRoom.getCapacity());
        Employee employee1 = new Employee("John1", 30, "Developer");

        Company     company = new Company();

        List<Employee> employees = new LinkedList<>();

        employees.add(employee1);

        employees.add(new Employee("Jane", 28, "Designer"));

        employees.add(new Employee("Bob", 35, "Manager"));
        employees.add(employee1);

        company.setEmployees(employees);


        Company     company2 = new Company();
        Set<Employee> employeeSet = new HashSet<>();



        employeeSet.add(employee1);
        employeeSet.add(new Employee("John", 30, "Developer"));
        employeeSet.add(employee1);

        company2.setEmployees(new LinkedList<>(employeeSet));
        company2.setName("Innovate Tech");

        System.out.println("Company2 size:" + company2.getEmployees().size());

        for(Employee    employee : company2.getEmployees()) {
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Employee Age: " + employee.getAge());

        }



        company.setName("Tech Solutions");

        System.out.println("Company Name: " + company.getName());

        for(Employee    employee : company.getEmployees()) {
            System.out.println("Set Employee Name: " + employee.getName());
            System.out.println("Set Employee Age: " + employee.getAge());

        }

        for (Student student : classRoom.getStudents()) {
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Age: " + student.getAge());
        }














    }
}
