package com.patrones.creacionales.abstractfactory;

/**
 * Clase base abstracta para botones
 * Define la interfaz común que todos los botones deben implementar
 */
public abstract class Boton {
    
    protected String texto;
    protected String color;
    
    public Boton(String texto) {
        this.texto = texto;
    }
    
    /**
     * Método abstracto que cada tipo de botón debe implementar
     */
    public abstract void renderizar();
    
    /**
     * Método común para todos los botones
     */
    public void hacerClic() {
        System.out.println("🖱️  Botón '" + texto + "' fue clickeado");
    }
    
    // Getters y Setters
    public String getTexto() {
        return texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}

