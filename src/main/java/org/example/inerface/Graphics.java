package org.example.inerface;

public interface Graphics {

    public void render(String graphicsData);

    public void loadTextures(String texturePath);

    public void setResolution(int width, int height);

    public void enableVSync(boolean enable);

    public String getGraphicsCardInfo();

    // Additional methods can be added as needed
}
