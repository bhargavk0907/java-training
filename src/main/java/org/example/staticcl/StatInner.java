package org.example.staticcl;

public class StatInner {

    public static void main(String[] args) {
        // Create an instance of the static inner class
        StstClass.INSTAT innerInstance = new StstClass.INSTAT();

        // Call the display method of the static inner class
        innerInstance.display();
    }
}
