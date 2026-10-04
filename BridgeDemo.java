package kz.astanait.bridge;
import kz.astanait.bridge.renderer.*;
import kz.astanait.bridge.shape.*;
public class BridgeDemo {
    public static void main(String[] args) {
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();
        Shape circle = new Circle(vector, 5.0);
        Shape square = new Square(raster, 4.0);
        System.out.println("Initial rendering:");
        circle.draw();
        square.draw();
        System.out.println("\nSwitching implementations at runtime:");
        circle.setRenderer(raster);
        square.setRenderer(vector);
        circle.draw();
        square.draw();
    }
}
