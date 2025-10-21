package com.patrones.creacionales.abstractfactory;

/**
 * Implementación concreta de CampoTexto para Mac
 */
public class CampoTextoMac extends CampoTexto {
    
    public CampoTextoMac(String placeholder, int ancho) {
        super(placeholder, ancho);
    }
    
    @Override
    public void renderizar() {
        System.out.println("🍎 Renderizando campo Mac: '" + placeholder + "' (ancho: " + ancho + ")");
    }
}

