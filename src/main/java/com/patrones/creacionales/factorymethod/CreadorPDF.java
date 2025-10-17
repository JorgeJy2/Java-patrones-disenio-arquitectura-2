package com.patrones.creacionales.factorymethod;

/**
 * Creador concreto para documentos PDF
 * Implementa el factory method para crear DocumentoPDF
 */
public class CreadorPDF extends CreadorDocumento {
    
    @Override
    protected Documento crearDocumento(String titulo) {
        System.out.println("   → Creando documento PDF...");
        return new DocumentoPDF(titulo);
    }
}
