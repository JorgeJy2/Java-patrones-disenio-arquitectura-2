package com.patrones.estructurales.flyweight;

/**
 * Tree - Contiene estado único para cada árbol
 * 
 * Cada árbol tiene su propia posición (x, y) pero comparte
 * el tipo de árbol (TreeType) con otros árboles del mismo tipo.
 */
public class Tree {
    
    private int x;
    private int y;
    private TreeType type;
    
    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }
    
    public void draw() {
        type.draw(x, y);
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public TreeType getType() {
        return type;
    }
}
