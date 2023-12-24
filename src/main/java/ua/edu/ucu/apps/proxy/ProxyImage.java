package ua.edu.ucu.apps.proxy;
public class ProxyImage implements MyImage{
    private final String filename;
    private RealImage image;

    public ProxyImage(String file){
        this.filename = file;
    }

    @Override
    public void display() {
        if(image == null){
            image = new RealImage(this.filename);
        }
        image.display();
    }
}