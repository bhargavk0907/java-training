package org.example.inerface;

public class Acer extends Memory implements Processor, Graphics   {

    @Override
    public void start() {
        System.out.println("Acer processor is starting");
    }

    @Override
    public void stop(String type) {
        System.out.println("Acer processor of type " + type + " is stopping");
    }

    @Override
    public void process(String data) {
        System.out.println("Processing data: " + data);
    }

    @Override
    public void log(String message) {
        System.out.println("Log message: " + message);
    }

    @Override
    public void render(String graphicsData) {

    }

    @Override
    public void loadTextures(String texturePath) {

    }

    @Override
    public void setResolution(int width, int height) {

    }

    @Override
    public void enableVSync(boolean enable) {

    }

    @Override
    public String getGraphicsCardInfo() {
        return null;
    }
}
