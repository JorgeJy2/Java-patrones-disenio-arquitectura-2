package com.patrones.estructurales.composite;

/**
 * Interfaz Shape - Componente común
 * Define la interfaz común para objetos individuales y compuestos
 * 
 * El patrón Composite permite tratar objetos individuales y composiciones
 * de manera uniforme a través de una interfaz común.
 */
public interface Shape {
    
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();
    boolean isSelected();
    void paint();
}
