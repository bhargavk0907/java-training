package org.example.enums;

public class MainEnum {


    public static void main(String[] args) {

        Months month = Months.JANUARY;
        System.out.println("The month is: " + month);
        System.out.println("The month number is: " + month.getName());
        System.out.println("The month number is: " + month.getDays());


       for(Months m : Months.values()) {
            System.out.println("Month: " + m + ", Days: " + m.getDays());
        }

        // Using the enum in a switch statement

//You can store extra info for each constant.
//
//You can loop through all values with values().
//
//You can switch on enums.


    }
}
