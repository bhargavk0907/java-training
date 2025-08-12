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
            if (name.equals("batch600") || name.equals("batch800")) {
                Thread.sleep(1000);
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (Integer i : numbers) {


            System.out.println("Process: " + name + " "+ i);

        }
    }





}
