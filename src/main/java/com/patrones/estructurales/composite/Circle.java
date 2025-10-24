package com.patrones.estructurales.composite;

/**
 * Circle - Forma simple (Leaf)
 * Representa un círculo en el canvas
 */
public class Circle extends BaseShape {
    
    public int radius;
    
    public Circle(int x, int y, int radius, String color) {
        super(x, y, color);
        this.radius = radius;
    }
    
    @Override
    public int getWidth() {
        return radius * 2;
    }
    
    @Override
    public int getHeight() {
        return radius * 2;
    }
    
    @Override
    public void paint() {
        super.paint();
        System.out.println("  → Dibujando círculo con radio " + radius);
    }
}
