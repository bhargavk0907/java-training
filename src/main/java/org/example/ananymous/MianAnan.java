package org.example.ananymous;

public class MianAnan {

    public static void main(String[] args) {
        // Create an instance of the anonymous class implementing Plant interface
        Plant plant = new Plant() {
            @Override
            public void grow() {
                System.out.println("The plant is growing.");
            }
        };


        Creepers creeper = new Creepers() {
            @Override
            public void grow() {
                System.out.println("The creeper is growing.");
            }
        };

        creeper.display();

        Tress tress = new Tress() {
            @Override
            public void grow() {
                System.out.println("The tree is growing.");
            }
        };





        // Call the grow method of the anonymous class
        plant.grow();

        Hybrid hybrid = new Hybrid();
        hybrid.display();

    }
}
