package org.example.arrays;

public class ArrayExample {

    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = new Student[3];

        String[] name = new String[3];
        name[0] = "Alice";
        name[1] = "Bob";
        name[2] = "Charlie";


        //| Method                            | What it does      | Example                                            |
        //| --------------------------------- | ----------------- | -------------------------------------------------- |
        //| `Arrays.toString(array)`          | Convert to String | `System.out.println(Arrays.toString(arr));`        |
        //| `Arrays.sort(array)`              | Sort array        | `Arrays.sort(arr);`                                |
        //| `Arrays.copyOf(array, newLength)` | Resize array      | `int[] b = Arrays.copyOf(arr, 5);`                 |
        //| `Arrays.fill(array, value)`       | Fill all elements | `Arrays.fill(arr, 42);`                            |
        //| `Arrays.equals(arr1, arr2)`       | Compare contents  | `Arrays.equals(arr1, arr2)`                        |
        //| `Arrays.binarySearch(array, key)` | Binary search     | `int idx = Arrays.binarySearch(arr, 3);`           |
        //| `Arrays.asList(array)`            | Convert to List   | `List<Integer> list = Arrays.asList(arr);`         |
        //| `Arrays.stream(array)`            | Convert to Stream | `Arrays.stream(arr).sum();`                        |
        //| `Arrays.deepToString()`           | For nested arrays | `System.out.println(Arrays.deepToString(matrix));` |



        int[] age = {1,2,3};




        // Initialize the array with Student objects
        students[0] = new Student("Alice", 20);
        students[1] = new Student("Bob", 22);
        students[2] = new Student("Charlie", 21);

        // Display information for each student
        for (Student student : students) {
            student.displayStudentInfo();
            System.out.println(); // Print a blank line for better readability
        }
    }
}
