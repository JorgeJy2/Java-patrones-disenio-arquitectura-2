package com.patrones.creacionales.builder;

/**
 * Builder concreto para Pizza Pepperoni
 * Implementa los pasos específicos para construir una pizza pepperoni
 */
public class PizzaPepperoniBuilder extends PizzaBuilder {
    
    @Override
    public void construirMasa() {
        pizza.setMasa("Masa delgada");
        System.out.println("   ✓ Agregando masa delgada");
    }
    
    @Override
    public void construirSalsa() {
        pizza.setSalsa("Salsa picante");
        System.out.println("   ✓ Agregando salsa picante");
    }
    
    @Override
    public void construirIngredientes() {
        pizza.getIngredientes().add("Pepperoni");
        pizza.getIngredientes().add("Queso cheddar");
        pizza.getIngredientes().add("Champiñones");
        pizza.getIngredientes().add("Aceitunas");
        System.out.println("   ✓ Agregando ingredientes pepperoni: pepperoni, cheddar, champiñones, aceitunas");
    }
}
