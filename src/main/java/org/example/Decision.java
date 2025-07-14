package org.example;

public class Decision {

    public static void main(String[] args) {




        // pRINT 1 TO 100

//        for (int i =1; i<=100; ){
//            System.out.println(i++);
//        }


        int j=1;



        //do while loop
//        while (j <= 100) {
//            System.out.println(++j);
//        }

        do{
            System.out.println(j++);
        }while(j<0);


        for(int k=1; k<100 ;){
            k++;

        }


        // nested if else
        int age = 20;

        if (age <= 18){
            System.out.println("You are a minor.");
        } else if (age > 18 && age <= 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }

        //Switch Case Example
        //✅ You have one variable or expression to check.
        //✅ You want to compare it to several fixed, known, exact values.
        //✅ The possible values are discrete, not ranges.
        //✅ Using if-else would look repetitive and messy

        // switch for months in 1 // switch for months in 1-12
        int month = 5; // May
        // switch for months in 1-12
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number.");
        }

        //sWITCH FOR days of the week
        int dayOfWeek = 3; // 1 for Monday, 2 for Tuesday, etc.
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day of the week.");
        }

        //Payment Method Example
        int paymentMethod = 2; // 1 for Credit Card, 2 for Debit Card, 3 for PayPal
        switch (paymentMethod) {
            case 1:
                System.out.println("Payment made using Credit Card.");
                break;
            case 2:
                System.out.println("Payment made using Debit Card.");
                break;
            case 3:
                System.out.println("Payment made using PayPal.");
                break;
            default:
                System.out.println("Invalid payment method.");
        }

        // Jump Statements Example
        // Break Statement Example
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break; // Exit the loop when i is 5
            }
            System.out.println("i = " + i);
        }



        // Continue Statement Example
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Skipping the iteration when i = " + i);
                continue; // Skip the rest of the loop when i is 5
            }
            System.out.println("i = " + i);
        }


        //










        int b = 121;

        //palindrome check using modulus and division
        int temp = b;
        int reversed = 0; // 121

        while(temp != 0){
            int digit = temp % 10; // 1
            reversed = reversed * 10 + digit; // 121
            temp /= 10; // 12
        }

        if(reversed == b){
            System.out.println(b + " is a palindrome");
        } else {
            System.out.println(b + " is not a palindrome");
        }




        // Switch Statement
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of the week!");
                break;
            case "Friday":
                System.out.println("End of the week!");
                break;
            default:
                System.out.println("It's just another day.");
                break;
        }
    }
}
