package org.example.generics;

import java.util.List;

public class GadgetMain {

    public static void main(String[] args) {

        Ipad ipad = new Ipad("Apple Ipad", "Ipad", "Tablet", "iPad Pro");
        Phones phone = new Phones("Samsung Galaxy", "Phone", "Smartphone", "Galaxy S21");

        GadgetService<Gadget> gadgetService = new GadgetService<>();
        //gadgetService.printGadgetInfo();
        GadgetService<Phones> gadgetService2 = new GadgetService<>(phone);
        gadgetService2.printGadgetInfo();

        gadgetService.addGadget(phone);
        gadgetService.addGadget(phone);
        gadgetService.addGadget(ipad);

        List<Gadget> gadgets = gadgetService.getGadgets();

        for(Gadget gadget : gadgets) {
            gadget.displayInfo();
        }









    }
}
