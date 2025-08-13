package org.example.multithreading;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MultiMainApp {

    public static void main(String[] args) throws InterruptedException {


//        Process process1 = new Process("A");
//        Process process2 = new Process("B");
//        process1.start();
//        process2.start();

        LocalDateTime.now();
        System.out.println("Starting multi-threaded processing..." + LocalDateTime.now());


        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            numbers.add(i);
        }

        // Step 2: Batch size and thread list
        int batchSize = 200;
        List<Thread> threads = new ArrayList<>();

        // Step 3: Create Runnable tasks for each batch
        for (int i = 0; i < numbers.size(); i += batchSize) {
            int start = i;
            int end = Math.min(i + batchSize, numbers.size());

            List<Integer> batch = numbers.subList(start, end);

            Process process = new Process("batch" + i, batch);
           // process.start();

            Runnable task = new Process("batch" + i , batch);



            Thread thread = new Thread(task);
            threads.add(thread);
        }

        // Step 4: Start threads (only 5 at a time)
        for (int i = 0; i < threads.size(); i++) {
            threads.get(i).start();

            // Control concurrency: wait after every 5 threads
            if ((i + 1) % 5 == 0) {
                for (int j = i - 4; j <= i; j++) {
                    threads.get(j).join();

                }
            }

           // System.out.printf("Started thread for batch %d to %d%n", i, i + batchSize - 1);
        }



        System.out.println("All batches processed.");
        System.out.println("Starting multi-threaded processing..." + LocalDateTime.now());


        System.out.println("Starting multi-threaded processing..." + LocalDateTime.now());

        List<Integer> numbers2 = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            numbers2.add(i);
        }

        for (Integer number : numbers2) {
            System.out.println("Number: " + number);
        }
        System.out.println("Ending multi-threaded processing..." + LocalDateTime.now());

    }



}

