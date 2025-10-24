package com.patrones.estructurales.flyweight;

/**
 * TreeType - Flyweight que contiene estado compartido
 * 
 * Esta clase contiene la información que se comparte entre
 * múltiples árboles del mismo tipo (nombre, color, textura).
 * Solo se crea una instancia por tipo de árbol.
 */
public class TreeType {
    
    private String name;
    private String color;
    private String texture;
    
    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }
    
    public void draw(int x, int y) {
        System.out.println("Dibujando " + name + " en (" + x + ", " + y + 
                         ") - Color: " + color + " - Textura: " + texture);
    }
    
    public String getName() {
        return name;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getTexture() {
        return texture;
    }
}
