package kz.astanait.bridge.shape;
import kz.astanait.bridge.renderer.Renderer;
public class Square extends Shape {
    private final double side;
    public Square(Renderer renderer, double side) { super(renderer); this.side = side; }
    public void draw() { renderer.renderSquare(side); }
}
