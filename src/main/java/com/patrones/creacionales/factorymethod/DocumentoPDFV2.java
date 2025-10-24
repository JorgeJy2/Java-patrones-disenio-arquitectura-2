package com.patrones.creacionales.factorymethod;

/**
 * Implementación concreta de Documento para archivos PDF
 */
public class DocumentoPDFV2 extends Documento {
    
    public DocumentoPDFV2(String titulo) {
        super(titulo);
    }
    
    @Override
    public void procesar() {
        System.out.println("Esta es una versión más rapida del PDF.....");
        System.out.println("Esta es una versión más rapida del PDF.....");
                System.out.println("Esta es una versión más rapida del PDF.....");
                        System.out.println("Esta es una versión más rapida del PDF.....");

        System.out.println("📄 Procesando documento PDF: " + titulo);
        System.out.println("   - Aplicando formato PDF");
        System.out.println("   - Generando metadatos");
        System.out.println("   - Optimizando para visualización");
        this.contenido = "Contenido procesado en formato PDF";
    }
}

