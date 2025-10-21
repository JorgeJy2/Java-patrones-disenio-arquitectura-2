package com.patrones.creacionales.abstractfactory;

/**
 * Clase base abstracta para campos de texto
 * Define la interfaz común que todos los campos de texto deben implementar
 */
public abstract class CampoTexto {
    
    protected String placeholder;
    protected String valor;
    protected int ancho;
    
    public CampoTexto(String placeholder, int ancho) {
        this.placeholder = placeholder;
        this.ancho = ancho;
        this.valor = "";
    }
    
    /**
     * Método abstracto que cada tipo de campo debe implementar
     */
    public abstract void renderizar();
    
    /**
     * Método común para todos los campos
     */
    public void escribir(String texto) {
        this.valor = texto;
        System.out.println("✏️  Escribiendo en campo: '" + texto + "'");
    }
    
    // Getters y Setters
    public String getPlaceholder() {
        return placeholder;
    }
    
    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }
    
    public String getValor() {
        return valor;
    }
    
    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public int getAncho() {
        return ancho;
    }
    
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
}

