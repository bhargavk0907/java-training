package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");


        Car bhargavCar = new Car(); // default constructor
       System.out.println("Bhargav's car: " + bhargavCar.getMake() + " " + bhargavCar.getModel() + ", Year: " + bhargavCar.getYear() + ", Price: $" + bhargavCar.getPrice());


        int x = 10;
        double y = 20.99;

        int z = (int)y;

        System.out.println("Value of z: " + z);


        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);

        char ch = 'A';
        String str = String.valueOf(ch);
        System.out.println(str); // Output: A

        String string = "ABBB";
        char t = string.charAt(0); // 'A'
        char[] chars = string.toCharArray();
        // sout chars
        for (char c : chars) {
            System.out.println(c);
        }
        System.out.println(t);






        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
    //write a  method that takes in a string and returns the string reversed
    public static String reverseString(String str) {
        String reversed = "";
        test(str);
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static String test(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}