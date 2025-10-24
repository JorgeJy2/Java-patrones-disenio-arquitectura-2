package com.patrones.estructurales.composite;

/**
 * BaseShape - Clase abstracta con funcionalidad básica
 * Proporciona implementación común para todas las formas
 */
public abstract class BaseShape implements Shape {
    
    public int x;
    public int y;
    public String color;
    private boolean selected = false;
    
    public BaseShape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    
    @Override
    public int getX() {
        return x;
    }
    
    @Override
    public int getY() {
        return y;
    }
    
    @Override
    public int getWidth() {
        return 0;
    }
    
    @Override
    public int getHeight() {
        return 0;
    }
    
    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
    
    @Override
    public boolean isInsideBounds(int x, int y) {
        return x > getX() && x < (getX() + getWidth()) &&
               y > getY() && y < (getY() + getHeight());
    }
    
    @Override
    public void select() {
        selected = true;
    }
    
    @Override
    public void unSelect() {
        selected = false;
    }
    
    @Override
    public boolean isSelected() {
        return selected;
    }
    
    @Override
    public void paint() {
        String status = isSelected() ? "SELECTED" : "NORMAL";
        System.out.println("Pintando " + getClass().getSimpleName() + 
                          " en (" + x + ", " + y + ") - Color: " + color + 
                          " - Estado: " + status);
    }
}
