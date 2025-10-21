package com.patrones.creacionales.factorymethod;

/**
 * PATRÓN FACTORY METHOD
 * 
 * Propósito: Crear objetos sin especificar sus clases exactas.
 * Delega la creación a subclases que implementan el método de fábrica.
 * 
 * Cuándo usar:
 * - Cuando no sabes de antemano qué tipos de objetos necesitas
 * - Cuando quieres que las subclases decidan qué clase instanciar
 * - Para desacoplar la lógica de creación de la lógica de uso
 * 
 * Este ejemplo simula un sistema de creación de documentos.
 */
public abstract class CreadorDocumento {
    
    /**
     * Método de fábrica abstracto
     * Las subclases deben implementar este método para crear el tipo específico
     */
    protected abstract Documento crearDocumento(String titulo);
    
    /**
     * Método template que usa el factory method
     * Define el algoritmo común para procesar documentos
     */
    public Documento procesarDocumento(String titulo) {
        System.out.println("🏭 Creando documento...");
        
        // Usar el factory method para crear el documento específico
        Documento documento = crearDocumento(titulo);
        
        // Procesar el documento
        documento.procesar();
        
        System.out.println("✅ Documento creado y procesado exitosamente\n");
        return documento;
    }
}

