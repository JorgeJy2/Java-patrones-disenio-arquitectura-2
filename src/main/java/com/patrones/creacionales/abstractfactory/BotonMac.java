package com.patrones.creacionales.abstractfactory;

/**
 * Implementación concreta de Boton para Mac
 */
public class BotonMac extends Boton {
    
    public BotonMac(String texto) {
        super(texto);
        this.color = "Gris Mac";
    }
    
    @Override
    public void renderizar() {
        System.out.println("🍎 Renderizando botón Mac: '" + texto + "' con estilo " + color);
    }
}

