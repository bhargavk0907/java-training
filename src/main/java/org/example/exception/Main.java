package org.example.exception;

public class Main {

    public static void main(String[] args) {

        FinallyBlock finallyBlock = new FinallyBlock();

        try {
            finallyBlock.test();
        }catch (Exception e){
            System.out.println("main");
        }

        CheckedException checkedException = new CheckedException();
        try {
            checkedException.test1(args);
        } catch (RuntimeException e) {
            System.out.println("Caught a checked exception: " + e.getMessage());
        }


    }
}
