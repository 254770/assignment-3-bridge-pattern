package kz.astanait.bridge.shape;
import kz.astanait.bridge.renderer.Renderer;
public abstract class Shape {
    protected Renderer renderer;
    protected Shape(Renderer renderer) { this.renderer = renderer; }
    public abstract void draw();
    public void setRenderer(Renderer renderer) { this.renderer = renderer; }
}
