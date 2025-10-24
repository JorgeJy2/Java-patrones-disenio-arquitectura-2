package com.patrones.estructurales.composite;

/**
 * Rectangle - Forma simple (Leaf)
 * Representa un rectángulo en el canvas
 */
public class Rectangle extends BaseShape {
    
    public int width;
    public int height;
    
    public Rectangle(int x, int y, int width, int height, String color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }
    
    @Override
    public int getWidth() {
        return width;
    }
    
    @Override
    public int getHeight() {
        return height;
    }
    
    @Override
    public void paint() {
        super.paint();
        System.out.println("  → Dibujando rectángulo " + width + "x" + height);
    }
}
