package com.patrones.creacionales.prototype;

/**
 * Implementación concreta de Forma - Rectángulo
 */
public class Rectangulo extends Forma {
    
    private int ancho, alto;
    
    public Rectangulo(String color, int ancho, int alto) {
        super("Rectángulo", color);
        this.ancho = ancho;
        this.alto = alto;
    }
    
    @Override
    public void dibujar() {
        System.out.println("🟦 Dibujando rectángulo de color " + color + 
                          " (" + ancho + "x" + alto + ") en posición (" + x + ", " + y + ")");
    }
    
    @Override
    public Rectangulo clone() {
        Rectangulo rectanguloClonado = (Rectangulo) super.clone();
        // El ancho y alto se copian automáticamente (son primitivos)
        return rectanguloClonado;
    }
    
    // Getters y Setters específicos
    public int getAncho() {
        return ancho;
    }
    
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    public int getAlto() {
        return alto;
    }
    
    public void setAlto(int alto) {
        this.alto = alto;
    }
}
