package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class GadgetService <T extends Gadget> {

    private T gadget;

    List<T> gadgets = new ArrayList<>();

    public GadgetService() {
    }

    public GadgetService(T gadget) {
        this.gadget = gadget;
    }

    public void concat(T gadget) {
        System.out.println("Concatenating gadget: " + gadget + " with existing gadget: " + this.gadget);
    }

    public T getGadget() {
        return gadget;
    }

    public void setGadget(T gadget) {
        this.gadget = gadget;
    }

    public void printGadgetInfo() {
        if (gadget instanceof Gadget) {
            ((Gadget) gadget).displayInfo();
        } else {
            System.out.println("Gadget information not available.");
        }
    }

    public void addGadget(T gadget) {
        gadgets.add(gadget);
    }

    public List<T> getGadgets() {
        return gadgets;
    }
}
