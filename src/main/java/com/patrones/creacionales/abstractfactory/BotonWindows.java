package com.patrones.creacionales.abstractfactory;

/**
 * Implementación concreta de Boton para Windows
 */
public class BotonWindows extends Boton {
    
    public BotonWindows(String texto) {
        super(texto);
        this.color = "Azul Windows";
    }
    
    @Override
    public void renderizar() {
        System.out.println("🪟 Renderizando botón Windows: '" + texto + "' con estilo " + color);
    }
}

