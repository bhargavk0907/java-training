package org.example.staticcl;

import java.sql.SQLOutput;

import static org.example.staticcl.AppConstants.CREDIT_CARD;

public class StatInner {

    public static void main(String[] args) {
        // Create an instance of the static inner class
        StstClass.Instat innerInstance = new StstClass.Instat();

        // Call the display method of the static inner class
        innerInstance.display();

        System.out.println(CREDIT_CARD);
    }
}
