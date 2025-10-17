package com.patrones.creacionales.builder;

/**
 * PATRÓN BUILDER
 * 
 * Propósito: Construir objetos complejos paso a paso.
 * Permite crear diferentes representaciones del mismo objeto.
 * 
 * Cuándo usar:
 * - Cuando un objeto tiene muchos parámetros opcionales
 * - Cuando quieres crear objetos paso a paso
 * - Cuando necesitas diferentes variaciones del mismo objeto
 * - Para hacer el código más legible y mantenible
 * 
 * Interfaz abstracta que define los pasos para construir una pizza
 */
public abstract class PizzaBuilder {
    
    protected Pizza pizza;
    
    /**
     * Inicializar una nueva pizza
     */
    public void crearNuevaPizza() {
        this.pizza = new Pizza();
        System.out.println("🍕 Iniciando construcción de nueva pizza...");
    }
    
    /**
     * Métodos abstractos que cada builder concreto debe implementar
     */
    public abstract void construirMasa();
    public abstract void construirSalsa();
    public abstract void construirIngredientes();
    
    /**
     * Métodos opcionales con implementación por defecto
     */
    public void agregarQuesoExtra() {
        pizza.setQuesoExtra(true);
        System.out.println("   ✓ Agregando queso extra");
    }
    
    public void agregarOrillaRellena() {
        pizza.setOrillaRellena(true);
        System.out.println("   ✓ Agregando orilla rellena");
    }
    
    public void establecerTamaño(String tamaño) {
        pizza.setTamaño(tamaño);
        System.out.println("   ✓ Estableciendo tamaño: " + tamaño);
    }
    
    /**
     * Método para obtener la pizza construida
     */
    public Pizza obtenerPizza() {
        System.out.println("✅ Pizza construida exitosamente\n");
        return pizza;
    }
}
