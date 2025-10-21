package com.patrones.creacionales.prototype;

/**
 * Implementación concreta de Forma - Círculo
 */
public class Circulo extends Forma {
    
    private int radio;
    
    public Circulo(String color, int radio) {
        super("Círculo", color);
        this.radio = radio;
    }
    
    @Override
    public void dibujar() {
        System.out.println("🔵 Dibujando círculo de color " + color + 
                          " con radio " + radio + " en posición (" + x + ", " + y + ")");
    }
    
    @Override
    public Circulo clone() {
        Circulo circuloClonado = (Circulo) super.clone();
        // El radio se copia automáticamente (es primitivo)
        return circuloClonado;
    }
    
    // Getter y Setter específicos
    public int getRadio() {
        return radio;
    }
    
    public void setRadio(int radio) {
        this.radio = radio;
    }
}

