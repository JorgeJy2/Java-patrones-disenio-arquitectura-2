package com.patrones.creacionales.abstractfactory;

/**
 * Fábrica concreta para crear componentes de Mac
 * Implementa todos los métodos de la fábrica abstracta
 */
public class FabricaMac extends FabricaGUI {
    
    @Override
    public Boton crearBoton(String texto) {
        System.out.println("   → Creando botón Mac...");
        return new BotonMac(texto);
    }
    
    @Override
    public CampoTexto crearCampoTexto(String placeholder, int ancho) {
        System.out.println("   → Creando campo Mac...");
        return new CampoTextoMac(placeholder, ancho);
    }
}

