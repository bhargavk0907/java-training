package org.example.exception;

public class UncheckedException {


    public static void main(String[] args) {
        // Simulating an unchecked exception
        int[] numbers = {1, 2, 3};
        try {

            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an unchecked exception: " + e.getMessage());
        }

        int a = 10;
        int b = 0;
        try {

            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an unchecked exception: " + e.getMessage());

        }
        }


    public void testUncheckedException() {

        String str = null;

        int a = 10;
        int b = 12;

        try{

            int result = a / b; // This will throw ArithmeticException

            if(str.equalsIgnoreCase("test")){
                System.out.println("String is equal to 'test'");
            } else {
                System.out.println("String is not equal to 'test'");
            }
        }catch (ArithmeticException e) {
            System.out.println("Caught an unchecked exception: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught an unchecked exception: " + e.getMessage());
        } catch(Exception e){
            //
        }finally {
            System.out.println("Finally block executed");
        }

    }

}
