package com.patrones.estructurales.facade;

import java.io.File;

/**
 * DEMO del patrón Facade - Conversión de Video
 * 
 * El patrón Facade proporciona una interfaz simplificada (pero limitada)
 * a un sistema complejo de clases, bibliotecas o frameworks.
 * 
 * Basado en el ejemplo de refactoring.guru:
 * https://refactoring.guru/es/design-patterns/facade/java/example
 */
public class FacadeDemo {
    
    public static void main(String[] args) {
        System.out.println("=== DEMO PATRÓN FACADE - CONVERSIÓN DE VIDEO ===\n");
        
        // Crear el facade
        VideoConversionFacade converter = new VideoConversionFacade();
        
        // 1. Conversión simple con facade
        System.out.println("1. CONVERSIÓN SIMPLE CON FACADE:");
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        System.out.println("Archivo convertido: " + mp4Video.getName());
        
        // 2. Otra conversión
        System.out.println("\n2. OTRA CONVERSIÓN:");
        File oggVideo = converter.convertVideo("presentacion.mp4", "ogg");
        System.out.println("Archivo convertido: " + oggVideo.getName());
        
        // 3. Demostrar la complejidad sin facade
        System.out.println("\n3. COMPLEJIDAD SIN FACADE (NO RECOMENDADO):");
        demostrarComplejidadSinFacade();
        
        System.out.println("\n=== VENTAJAS DEL PATRÓN FACADE ===");
        System.out.println("✅ Interfaz simplificada para sistema complejo");
        System.out.println("✅ Oculta la complejidad de implementación");
        System.out.println("✅ Facilita el uso de bibliotecas complejas");
        System.out.println("✅ Reduce el acoplamiento del cliente");
        System.out.println("✅ Proporciona un punto de entrada único");
        System.out.println("✅ Facilita el mantenimiento y testing");
    }
    
    /**
     * Demuestra la complejidad de usar la biblioteca sin facade
     * (Solo para comparación - NO es la forma recomendada)
     */
    private static void demostrarComplejidadSinFacade() {
        System.out.println("Sin facade, el cliente tendría que:");
        System.out.println("  1. Crear VideoFile");
        System.out.println("  2. Usar CodecFactory para extraer códec");
        System.out.println("  3. Crear códec destino apropiado");
        System.out.println("  4. Usar BitrateReader para leer archivo");
        System.out.println("  5. Usar BitrateReader para convertir");
        System.out.println("  6. Usar AudioMixer para mezclar audio");
        System.out.println("  7. Manejar todos los errores posibles");
        System.out.println("  8. Conocer el orden correcto de operaciones");
        System.out.println("  → ¡Mucho más complejo y propenso a errores!");
    }
}
