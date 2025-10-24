package com.patrones.creacionales.builder;

/**
 * DEMO del patrón Builder - Construcción de Casas
 * 
 * PROBLEMA RESUELTO:
 * 1. Constructor telescópico con muchos parámetros opcionales
 * 2. Dificultad para crear diferentes variaciones
 * 3. Código difícil de leer y mantener
 * 4. Parámetros innecesarios en la mayoría de casos
 * 
 * SOLUCIÓN CON BUILDER:
 * 1. Construcción paso a paso
 * 2. Diferentes builders para diferentes tipos
 * 3. Código más legible y mantenible
 * 4. Parámetros opcionales manejados correctamente
 */
public class BuilderDemo {
    
    public static void main(String[] args) {
        System.out.println("=== DEMO PATRÓN BUILDER - CONSTRUCCIÓN DE CASAS ===\n");
        
        // DEMOSTRAR EL PROBLEMA
        demostrarProblema();
        
        // DEMOSTRAR LA SOLUCIÓN
        demostrarSolucion();
    }
    
    /**
     * Demuestra el problema del constructor telescópico
     */
    private static void demostrarProblema() {
        System.out.println("=== PROBLEMA: CONSTRUCTOR TELESCÓPICO ===\n");
        
        // PROBLEMA: Constructor con muchos parámetros
        System.out.println("1. Casa básica (muchos parámetros innecesarios):");
        Casa casaBasica = new Casa("Ladrillo", "Cemento", 4, "Madera", "Teja", 
                                 false, false, false, false, false, false, null, 0, null);
        casaBasica.mostrarCasa();
        
        System.out.println("\n2. Casa de lujo (constructor muy largo):");
        Casa casaLujo = new Casa("Mármol", "Parquet", 8, "Cristal", "Pizarra", 
                               true, true, true, true, true, true, "Elegante", 5, "Moderno");
        casaLujo.mostrarCasa();
        
        System.out.println("\n=== PROBLEMAS IDENTIFICADOS ===");
        System.out.println("❌ Constructor telescópico con muchos parámetros");
        System.out.println("❌ Parámetros innecesarios en la mayoría de casos");
        System.out.println("❌ Código difícil de leer y mantener");
        System.out.println("❌ Difícil crear nuevas variaciones");
        System.out.println("❌ Fácil cometer errores al pasar parámetros");
    }
    
    /**
     * Demuestra la solución con Builder
     */
    private static void demostrarSolucion() {
        System.out.println("\n=== SOLUCIÓN: PATRÓN BUILDER ===\n");
        
        // Crear el director (constructor)
        Constructor constructor = new Constructor();
        
        // Construir casa simple
        System.out.println("1. Construyendo Casa Simple:");
        CasaSimpleBuilder casaSimpleBuilder = new CasaSimpleBuilder();
        constructor.setCasaBuilder(casaSimpleBuilder);
        constructor.construirCasaBasica();
        Casa casaSimple = constructor.obtenerCasa();
        casaSimple.mostrarCasa();
        
        // Construir casa de lujo
        System.out.println("\n2. Construyendo Casa de Lujo:");
        CasaLujosaBuilder casaLujosaBuilder = new CasaLujosaBuilder();
        constructor.setCasaBuilder(casaLujosaBuilder);
        constructor.construirCasaLujo();
        Casa casaLujosa = constructor.obtenerCasa();
        casaLujosa.mostrarCasa();
        
        // Construir casa completa
        System.out.println("\n3. Construyendo Casa Completa:");
        constructor.setCasaBuilder(casaLujosaBuilder);
        constructor.construirCasaCompleta();
        Casa casaCompleta = constructor.obtenerCasa();
        casaCompleta.mostrarCasa();
        
        System.out.println("\n=== VENTAJAS DE LA SOLUCIÓN ===");
        System.out.println("✅ Construcción paso a paso");
        System.out.println("✅ Diferentes builders para diferentes tipos");
        System.out.println("✅ Código más legible y mantenible");
        System.out.println("✅ Parámetros opcionales manejados correctamente");
        System.out.println("✅ Fácil crear nuevas variaciones");
        System.out.println("✅ Menos propenso a errores");
    }
}

