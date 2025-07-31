package org.example.collections;

import java.util.*;
import java.util.stream.Collectors;

public class ListApp {


    public static void main(String[] args) {
        // Example usage of the List class
        System.out.println("This is a placeholder for the List class.");
//
//        ClassRoom classRoom = new ClassRoom();
//
//        List<Student> students = new ArrayList<>();
//
//        students.add(new Student("Alice", 20));
//        students.add(new Student("Bob", 22));
//        students.add(new Student("Alice", 20));
//        students.add(new Student("Alice", 20));
//
//        students.clear();
//
//
//        classRoom.setStudents((ArrayList<Student>) students);
//        classRoom.setCapacity(students.size());
//        classRoom.setName("Computer Science");
//
//        System.out.println("Classroom Name: " + classRoom.getName());
//
//
//        System.out.println("Classroom Capacity: " + classRoom.getCapacity());
//        Employee employee1 = new Employee("John1", 30, "Developer");
//
//        Company     company = new Company();
//
//        List<Employee> employees = new LinkedList<>();
//
//        employees.add(employee1);
//
//        employees.add(new Employee("Jane", 28, "Designer"));
//
//        employees.add(new Employee("Bob", 35, "Manager"));
//        employees.add(employee1);
//
//        company.setEmployees(employees);
//
//
//        Company     company2 = new Company();
//        Set<Employee> employeeSet = new HashSet<>();
//
//
//
//        employeeSet.add(employee1);
//        employeeSet.add(new Employee("John", 30, "Developer"));
//        employeeSet.add(employee1);
//
//        company2.setEmployees(new LinkedList<>(employeeSet));
//        company2.setName("Innovate Tech");
//
//        System.out.println("Company2 size:" + company2.getEmployees().size());

//        for(Employee    employee : company2.getEmployees()) {
//            System.out.println("Employee Name: " + employee.getName());
//            System.out.println("Employee Age: " + employee.getAge());
//
//        }
//
//
//
//        company.setName("Tech Solutions");
//
//        System.out.println("Company Name: " + company.getName());
//
//        for(Employee    employee : company.getEmployees()) {
//            System.out.println("Set Employee Name: " + employee.getName());
//            System.out.println("Set Employee Age: " + employee.getAge());
//
//        }
//
//        for (Student student : classRoom.getStudents()) {
//            System.out.println("Student Name: " + student.getName());
//            System.out.println("Student Age: " + student.getAge());
//        }
//


        List<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        list.add("Apple"); // Adding a duplicate element


        System.out.println("List Elements:" + list);


        list.addFirst("Orange"); // Adding an element at the beginning


        list.addLast("Grapes"); // Adding an element at the end

        list.add(3, "Mango"); // Adding an element at index 3


        System.out.println("Updated List Elements: " + list);



        for(String fruit: list) {
            System.out.println("Fruit: " + fruit);
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.println("Fruit: " + list.get(i));
        }

        list.forEach(fruit -> System.out.println("Fruit: " + fruit));


        list.stream().filter(fruit -> fruit.startsWith("A"))
                .forEach(fruit -> System.out.println("Filtered Fruit: " + fruit));


        for(String fruit : list) {
            if(fruit.startsWith("A")) {
                System.out.println("Filtered Fruit: " + fruit);
            }
        }

        List<String> startsWithA = list.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());




        List<String> startsWithA1 = new ArrayList<>();

        for(String fruit : list) {
            if(fruit.startsWith("A")) {
                startsWithA1.add(fruit);
            }
        }


        //
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);

        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Numbers List: " + numbers);

        System.out.println("First Element: " + numbers.get(0)); // Accessing the first element


















    }
}
