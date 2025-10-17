package com.patrones.creacionales.factorymethod;

/**
 * Implementación concreta de Documento para archivos Word
 */
public class DocumentoWord extends Documento {
    
    public DocumentoWord(String titulo) {
        super(titulo);
    }
    
    @Override
    public void procesar() {
        System.out.println("📝 Procesando documento Word: " + titulo);
        System.out.println("   - Aplicando formato .docx");
        System.out.println("   - Configurando estilos");
        System.out.println("   - Preparando para edición");
        this.contenido = "Contenido procesado en formato Word";
    }
}
