package org.example.ananymous;

public class Hybrid {


    public void display() {
        System.out.println("This is a hybrid plant.");


        Tress tress = new Tress() {
            @Override
            public void grow() {
                System.out.println("The hybrid tree is growing.");
            }
        };

        // Call the grow method of the anonymous class
        tress.grow();
        tress.display();

        Creepers creeper = new Creepers() {
            @Override
            public void grow() {
                System.out.println("The hybrid creeper is growing.");
            }
        };

        creeper.grow();


    }


    class CurryLeaves extends Tress{
        @Override
        public void grow() {
            System.out.println("The curry leaves tree is growing.");
        }
    }

}
