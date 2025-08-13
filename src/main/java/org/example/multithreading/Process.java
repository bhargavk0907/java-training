package org.example.multithreading;

import java.util.List;

public class Process extends Thread{

    String name;

    List<Integer> numbers;
    public Process() {
    }

    public Process(String name) {
        this.name = name;
    }
    public Process(String name, List<Integer> numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    @Override
    public void run() {
        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(name.equalsIgnoreCase("batch600")){

            print();
        }else {
            for (Integer i : numbers) {

                System.out.println("Process: " + name + " " + i);

            }
        }
    }

    public void print(){

        System.out.println("Process: " + name + " is printing numbers");
        for (Integer i : numbers) {
            System.out.println("Process: " + name + " "+ i);
        }
        System.out.println("Process: " + name + " finished printing numbers");



    }






}
