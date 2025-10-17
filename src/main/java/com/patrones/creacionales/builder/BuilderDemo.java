package com.patrones.creacionales.builder;

/**
 * DEMO del patrón Builder
 * 
 * Este ejemplo demuestra que:
 * 1. Se pueden construir objetos complejos paso a paso
 * 2. Es fácil crear diferentes variaciones del mismo objeto
 * 3. El código es más legible y mantenible
 * 4. Se pueden omitir parámetros opcionales
 */
public class BuilderDemo {
    
    public static void main(String[] args) {
        System.out.println("=== DEMO PATRÓN BUILDER ===\n");
        
        // Crear el director (cocinero)
        Cocinero cocinero = new Cocinero();
        
        // Construir pizza hawaiana básica
        System.out.println("1. Construyendo Pizza Hawaiana Básica:");
        PizzaHawaianaBuilder hawaianaBuilder = new PizzaHawaianaBuilder();
        cocinero.setPizzaBuilder(hawaianaBuilder);
        cocinero.construirPizzaBasica();
        Pizza pizzaHawaiana = cocinero.obtenerPizza();
        pizzaHawaiana.mostrarPizza();
        
        // Construir pizza pepperoni premium
        System.out.println("2. Construyendo Pizza Pepperoni Premium:");
        PizzaPepperoniBuilder pepperoniBuilder = new PizzaPepperoniBuilder();
        cocinero.setPizzaBuilder(pepperoniBuilder);
        cocinero.construirPizzaPremium();
        Pizza pizzaPepperoni = cocinero.obtenerPizza();
        pizzaPepperoni.mostrarPizza();
        
        // Construir pizza personalizada
        System.out.println("3. Construyendo Pizza Hawaiana Personalizada:");
        cocinero.setPizzaBuilder(hawaianaBuilder);
        cocinero.construirPizzaPersonalizada("Mediana");
        Pizza pizzaPersonalizada = cocinero.obtenerPizza();
        pizzaPersonalizada.mostrarPizza();
        
        // Demostrar construcción manual (sin director)
        System.out.println("4. Construcción manual de pizza:");
        PizzaBuilder builderManual = new PizzaHawaianaBuilder();
        builderManual.crearNuevaPizza();
        builderManual.construirMasa();
        builderManual.construirSalsa();
        builderManual.construirIngredientes();
        builderManual.agregarQuesoExtra();
        builderManual.establecerTamaño("Familiar");
        Pizza pizzaManual = builderManual.obtenerPizza();
        pizzaManual.mostrarPizza();
        
        System.out.println("✓ Demo completado - Builder permite construir objetos complejos paso a paso");
    }
}
