package com.patrones.creacionales.factorymethod;

/**
 * Clase base abstracta para documentos
 * Define la interfaz común que todos los documentos deben implementar
 */
public abstract class Documento {
    
    protected String titulo;
    protected String contenido;
    
    public Documento(String titulo) {
        this.titulo = titulo;
        this.contenido = "";
    }
    
    /**
     * Método abstracto que cada tipo de documento debe implementar
     * para definir cómo se procesa específicamente
     */
    public abstract void procesar();
    
    /**
     * Método común para todos los documentos
     */
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("Contenido: " + contenido);
        System.out.println("---");
    }
    
    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }
    
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public String getContenido() {
        return contenido;
    }
}

