package org.example.inerface;

public class Dell extends Memory implements Processor, Graphics {


    @Override
    public String getMemoryBrand(){

        System.out.println(super.getMemoryBrand());
        return "Dell Memory";
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

    @Override
    public void start() {
        System.out.println("Dell Processor started.");
    }

    @Override
    public void stop(String type) {
        System.out.println("Dell Processor stopped. Type: " + type);
    }

    @Override
    public void process(String data) {
        System.out.println("Dell Processor processing data: " + data);
    }

    @Override
    public void log(String message) {
        System.out.println("Dell Processor log: " + message);
    }
}
