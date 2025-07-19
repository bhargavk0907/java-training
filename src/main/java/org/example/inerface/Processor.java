package org.example.inerface;

public interface Processor {


    public void start();

    public void stop(String type);

    public void process(String data);

    public  void log(String message);


    // Diif between interface and abstract class is that
    // interface can have only abstract methods and no concrete methods
    // whereas abstract class can have both abstract and concrete methods.
    // Also, interface can be implemented by multiple classes
    // while abstract class can be extended by only one class.
}
