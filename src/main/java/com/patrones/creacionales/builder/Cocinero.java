package com.patrones.creacionales.builder;

/**
 * Director que orquesta la construcción de pizzas
 * Define el proceso de construcción paso a paso
 */
public class Cocinero {
    
    private PizzaBuilder pizzaBuilder;
    
    /**
     * Establecer el builder a usar
     */
    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }
    
    /**
     * Obtener la pizza construida
     */
    public Pizza obtenerPizza() {
        return pizzaBuilder.obtenerPizza();
    }
    
    /**
     * Construir una pizza básica
     */
    public void construirPizzaBasica() {
        System.out.println("👨‍🍳 Construyendo pizza básica...");
        pizzaBuilder.crearNuevaPizza();
        pizzaBuilder.construirMasa();
        pizzaBuilder.construirSalsa();
        pizzaBuilder.construirIngredientes();
    }
    
    /**
     * Construir una pizza premium con extras
     */
    public void construirPizzaPremium() {
        System.out.println("👨‍🍳 Construyendo pizza premium...");
        pizzaBuilder.crearNuevaPizza();
        pizzaBuilder.construirMasa();
        pizzaBuilder.construirSalsa();
        pizzaBuilder.construirIngredientes();
        pizzaBuilder.agregarQuesoExtra();
        pizzaBuilder.agregarOrillaRellena();
        pizzaBuilder.establecerTamaño("Grande");
    }
    
    /**
     * Construir una pizza personalizada
     */
    public void construirPizzaPersonalizada(String tamaño) {
        System.out.println("👨‍🍳 Construyendo pizza personalizada...");
        pizzaBuilder.crearNuevaPizza();
        pizzaBuilder.construirMasa();
        pizzaBuilder.construirSalsa();
        pizzaBuilder.construirIngredientes();
        pizzaBuilder.establecerTamaño(tamaño);
    }
}

