package com.patrones.creacionales.factorymethod;

/**
 * Creador concreto para documentos Word
 * Implementa el factory method para crear DocumentoWord
 */
public class CreadorWord extends CreadorDocumento {
    
    @Override
    protected Documento crearDocumento(String titulo) {
        System.out.println("   → Creando documento Word...");
        return new DocumentoWord(titulo);
    }
}

