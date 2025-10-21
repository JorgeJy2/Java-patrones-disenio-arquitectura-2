package com.patrones.creacionales.builder;

/**
 * Builder concreto para Pizza Hawaiana
 * Implementa los pasos específicos para construir una pizza hawaiana
 */
public class PizzaHawaianaBuilder extends PizzaBuilder {
    
    @Override
    public void construirMasa() {
        pizza.setMasa("Masa tradicional");
        System.out.println("   ✓ Agregando masa tradicional");
    }
    
    @Override
    public void construirSalsa() {
        pizza.setSalsa("Salsa de tomate");
        System.out.println("   ✓ Agregando salsa de tomate");
    }
    
    @Override
    public void construirIngredientes() {
        pizza.getIngredientes().add("Jamón");
        pizza.getIngredientes().add("Piña");
        pizza.getIngredientes().add("Queso mozzarella");
        System.out.println("   ✓ Agregando ingredientes hawaianos: jamón, piña, mozzarella");
    }
}

