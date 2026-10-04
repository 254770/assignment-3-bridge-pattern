package kz.astanait.bridge.shape;
import kz.astanait.bridge.renderer.Renderer;
public class Circle extends Shape {
    private final double radius;
    public Circle(Renderer renderer, double radius) { super(renderer); this.radius = radius; }
    public void draw() { renderer.renderCircle(radius); }
}
