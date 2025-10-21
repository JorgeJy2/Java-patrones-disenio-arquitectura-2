package com.patrones.creacionales.abstractfactory;

/**
 * Fábrica concreta para crear componentes de Windows
 * Implementa todos los métodos de la fábrica abstracta
 */
public class FabricaWindows extends FabricaGUI {
    
    @Override
    public Boton crearBoton(String texto) {
        System.out.println("   → Creando botón Windows...");
        return new BotonWindows(texto);
    }
    
    @Override
    public CampoTexto crearCampoTexto(String placeholder, int ancho) {
        System.out.println("   → Creando campo Windows...");
        return new CampoTextoWindows(placeholder, ancho);
    }
}

