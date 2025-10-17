package com.patrones.creacionales.singleton;

/**
 * DEMO del patrón Singleton
 * 
 * Este ejemplo demuestra que:
 * 1. Solo se crea una instancia de Configuracion
 * 2. Todas las referencias apuntan al mismo objeto
 * 3. Los cambios se reflejan en todas las referencias
 */
public class SingletonDemo {
    
    public static void main(String[] args) {
        System.out.println("=== DEMO PATRÓN SINGLETON ===\n");
        
        // Obtener la primera instancia
        System.out.println("1. Obteniendo primera instancia...");
        Configuracion config1 = Configuracion.getInstancia();
        config1.mostrarConfiguracion();
        
        // Obtener la segunda instancia (debería ser la misma)
        System.out.println("\n2. Obteniendo segunda instancia...");
        Configuracion config2 = Configuracion.getInstancia();
        config2.mostrarConfiguracion();
        
        // Verificar que son la misma instancia
        System.out.println("\n3. Verificando que son la misma instancia:");
        System.out.println("config1 == config2: " + (config1 == config2));
        System.out.println("config1.equals(config2): " + config1.equals(config2));
        
        // Modificar una instancia y verificar que se refleja en la otra
        System.out.println("\n4. Modificando config1...");
        config1.setNombreApp("Aplicación Modificada");
        config1.setDebugMode(true);
        
        System.out.println("\n5. Verificando cambios en config2:");
        config2.mostrarConfiguracion();
        
        System.out.println("\n✓ Demo completado - Solo existe una instancia de Configuracion");
    }
}
