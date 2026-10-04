package kz.astanait.bridge.renderer;
public class RasterRenderer implements Renderer {
    public void renderCircle(double radius) { System.out.println("Drawing a circle with radius " + radius + " using raster graphics."); }
    public void renderSquare(double side) { System.out.println("Drawing a square with side " + side + " using raster graphics."); }
}
