package org.example.exception;

import java.io.File;

public class FinallyBlock {


    public void test(){
        try {
           int a = 10; int b = 0;
              int result = a / b; // This will throw ArithmeticException
        }catch (Exception e){
            System.out.println("catch");
            throw new RuntimeException(e);
        }finally {
            System.out.println("finally");
        }

    }
}
