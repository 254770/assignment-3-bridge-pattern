# Assignment #3 — Bridge Pattern

**Course:** ShP-2216 — Software Design Patterns  
**Institution:** Astana IT University — School of Computer Engineering  
**Student:** Benazir Myrzakhmetova  
**Java:** JDK 17

## Topic
This independent project implements the Bridge pattern using **Shape × Renderer**.

### Bridge roles
- Abstraction: `Shape`
- Refined Abstractions: `Circle`, `Square`
- Implementor: `Renderer`
- Concrete Implementors: `VectorRenderer`, `RasterRenderer`
- Client: `BridgeDemo`

`Shape` holds a `Renderer` reference. Therefore the two hierarchies are connected by composition rather than inheritance.

## Runtime switching
`BridgeDemo` demonstrates changing a shape's renderer at runtime with `setRenderer()` without changing the shape itself.

## Why Bridge?
Shapes and rendering technologies vary independently. A new shape can be added without changing existing renderers, and a new renderer can be added without changing existing shapes. This avoids combinations such as `VectorCircle`, `RasterCircle`, `VectorSquare`, and `RasterSquare`.

## Run
Run `BridgeDemo.java` with JDK 17.
