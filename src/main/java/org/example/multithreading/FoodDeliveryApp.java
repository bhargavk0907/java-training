package org.example.multithreading;

public class FoodDeliveryApp {
    public static void main(String[] args) throws InterruptedException {

        Thread paymentThread = new Thread(() -> {
            System.out.println("Payment verification started...");
            try { Thread.sleep(2000); } catch (InterruptedException e) {}
            System.out.println("Payment verified ");
        });

        Thread restaurantThread = new Thread(() -> {
            System.out.println("Restaurant notification sent...");
            try { Thread.sleep(3000); } catch (InterruptedException e) {}
            System.out.println("Restaurant accepted the order ");
        });

        Thread deliveryThread = new Thread(() -> {
            System.out.println("Assigning delivery partner...");
            try { Thread.sleep(1500); } catch (InterruptedException e) {}
            System.out.println("Delivery partner assigned ");
        });

        // Start all tasks in parallel
        paymentThread.start();
        restaurantThread.start();
        deliveryThread.start();

        // Wait for all to finish before showing "Order Ready"
        paymentThread.join();
        restaurantThread.join();
        deliveryThread.join();

        System.out.println("Order ready for pickup! ");
    }
}
