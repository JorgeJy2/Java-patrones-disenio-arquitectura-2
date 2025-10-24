package com.patrones.estructurales.composite;

/**
 * Dot - Forma simple (Leaf)
 * Representa un punto en el canvas
 */
public class Dot extends BaseShape {
    
    private final int DOT_SIZE = 3;
    
    public Dot(int x, int y, String color) {
        super(x, y, color);
    }
    
    @Override
    public int getWidth() {
        return DOT_SIZE;
    }
    
    @Override
    public int getHeight() {
        return DOT_SIZE;
    }
    
    @Override
    public void paint() {
        super.paint();
        System.out.println("  → Dibujando punto de tamaño " + DOT_SIZE + "x" + DOT_SIZE);
    }
}
