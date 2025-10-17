package com.patrones.creacionales.abstractfactory;

/**
 * Implementación concreta de CampoTexto para Windows
 */
public class CampoTextoWindows extends CampoTexto {
    
    public CampoTextoWindows(String placeholder, int ancho) {
        super(placeholder, ancho);
    }
    
    @Override
    public void renderizar() {
        System.out.println("🪟 Renderizando campo Windows: '" + placeholder + "' (ancho: " + ancho + ")");
    }
}
