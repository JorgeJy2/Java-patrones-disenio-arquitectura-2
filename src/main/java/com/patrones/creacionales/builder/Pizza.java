package com.patrones.creacionales.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase producto que representa una Pizza
 * Contiene todos los atributos que se pueden configurar
 */
public class Pizza {
    
    private String masa;
    private String salsa;
    private List<String> ingredientes;
    private boolean quesoExtra;
    private boolean orillaRellena;
    private String tamaño;
    
    public Pizza() {
        this.ingredientes = new ArrayList<>();
    }
    
    /**
     * Método para mostrar la pizza construida
     */
    public void mostrarPizza() {
        System.out.println("🍕 === PIZZA CONSTRUIDA ===");
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Masa: " + masa);
        System.out.println("Salsa: " + salsa);
        System.out.println("Ingredientes: " + String.join(", ", ingredientes));
        System.out.println("Queso extra: " + (quesoExtra ? "Sí" : "No"));
        System.out.println("Orilla rellena: " + (orillaRellena ? "Sí" : "No"));
        System.out.println("=========================");
    }
    
    // Getters y Setters
    public String getMasa() {
        return masa;
    }
    
    public void setMasa(String masa) {
        this.masa = masa;
    }
    
    public String getSalsa() {
        return salsa;
    }
    
    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }
    
    public List<String> getIngredientes() {
        return ingredientes;
    }
    
    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    public boolean isQuesoExtra() {
        return quesoExtra;
    }
    
    public void setQuesoExtra(boolean quesoExtra) {
        this.quesoExtra = quesoExtra;
    }
    
    public boolean isOrillaRellena() {
        return orillaRellena;
    }
    
    public void setOrillaRellena(boolean orillaRellena) {
        this.orillaRellena = orillaRellena;
    }
    
    public String getTamaño() {
        return tamaño;
    }
    
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}
