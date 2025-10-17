package com.patrones.creacionales.factorymethod;

/**
 * DEMO del patrón Factory Method
 * 
 * Este ejemplo demuestra que:
 * 1. El cliente no conoce las clases concretas
 * 2. La creación se delega a subclases especializadas
 * 3. Se puede cambiar el tipo de documento cambiando el creador
 */
public class FactoryMethodDemo {
    
    public static void main(String[] args) {
        System.out.println("=== DEMO PATRÓN FACTORY METHOD ===\n");
        
        // Crear documentos usando diferentes creadores
        System.out.println("1. Creando documento PDF:");
        CreadorDocumento creadorPDF = new CreadorPDF();
        Documento docPDF = creadorPDF.procesarDocumento("Manual de Usuario");
        docPDF.mostrarInfo();
        
        System.out.println("2. Creando documento Word:");
        CreadorDocumento creadorWord = new CreadorWord();
        Documento docWord = creadorWord.procesarDocumento("Informe Mensual");
        docWord.mostrarInfo();
        
        // Demostrar flexibilidad: cambiar el tipo sin cambiar el código cliente
        System.out.println("3. Procesando múltiples documentos:");
        procesarDocumentos(creadorPDF, "Reporte Técnico");
        procesarDocumentos(creadorWord, "Presentación Ejecutiva");
        
        System.out.println("✓ Demo completado - Factory Method permite crear objetos sin conocer sus clases específicas");
    }
    
    /**
     * Método que demuestra cómo el cliente puede usar cualquier creador
     * sin conocer las clases concretas
     */
    private static void procesarDocumentos(CreadorDocumento creador, String titulo) {
        System.out.println("Procesando: " + titulo);
        Documento doc = creador.procesarDocumento(titulo);
        doc.mostrarInfo();
    }
}
