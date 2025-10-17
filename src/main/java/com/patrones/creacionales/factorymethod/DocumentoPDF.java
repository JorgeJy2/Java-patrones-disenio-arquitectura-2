package com.patrones.creacionales.factorymethod;

/**
 * Implementación concreta de Documento para archivos PDF
 */
public class DocumentoPDF extends Documento {
    
    public DocumentoPDF(String titulo) {
        super(titulo);
    }
    
    @Override
    public void procesar() {
        System.out.println("📄 Procesando documento PDF: " + titulo);
        System.out.println("   - Aplicando formato PDF");
        System.out.println("   - Generando metadatos");
        System.out.println("   - Optimizando para visualización");
        this.contenido = "Contenido procesado en formato PDF";
    }
}
