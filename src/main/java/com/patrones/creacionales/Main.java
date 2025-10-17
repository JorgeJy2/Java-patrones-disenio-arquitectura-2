package com.patrones.creacionales;

import com.patrones.creacionales.singleton.SingletonDemo;
import com.patrones.creacionales.factorymethod.FactoryMethodDemo;
import com.patrones.creacionales.prototype.PrototypeDemo;
import com.patrones.creacionales.abstractfactory.AbstractFactoryDemo;
import com.patrones.creacionales.builder.BuilderDemo;

/**
 * Clase principal para ejecutar todos los ejemplos de patrones creacionales
 * 
 * Este programa ejecuta secuencialmente todos los demos de los patrones
 * de diseño creacionales implementados en este proyecto.
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("🎯 ================================================");
        System.out.println("   PATRONES DE DISEÑO CREACIONALES - EJEMPLOS");
        System.out.println("   Basado en: https://refactoring.guru/es/design-patterns");
        System.out.println("🎯 ================================================\n");
        
        try {
            // Ejecutar todos los demos
            ejecutarDemo("SINGLETON", () -> SingletonDemo.main(new String[0]));
            ejecutarDemo("FACTORY METHOD", () -> FactoryMethodDemo.main(new String[0]));
            ejecutarDemo("PROTOTYPE", () -> PrototypeDemo.main(new String[0]));
            ejecutarDemo("ABSTRACT FACTORY", () -> AbstractFactoryDemo.main(new String[0]));
            ejecutarDemo("BUILDER", () -> BuilderDemo.main(new String[0]));
            
            System.out.println("🎉 ================================================");
            System.out.println("   TODOS LOS EJEMPLOS COMPLETADOS EXITOSAMENTE");
            System.out.println("   ¡Gracias por explorar los patrones de diseño!");
            System.out.println("🎉 ================================================");
            
        } catch (Exception e) {
            System.err.println("❌ Error ejecutando los ejemplos: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Método auxiliar para ejecutar cada demo con manejo de errores
     */
    private static void ejecutarDemo(String nombrePatron, Runnable demo) {
        try {
            System.out.println("🚀 Iniciando demo: " + nombrePatron);
            System.out.println("─".repeat(50));
            demo.run();
            System.out.println("✅ Demo " + nombrePatron + " completado\n");
            
            // Pausa breve entre demos
            Thread.sleep(1000);
            
        } catch (Exception e) {
            System.err.println("❌ Error en demo " + nombrePatron + ": " + e.getMessage());
            e.printStackTrace();
        }
    }
}
