package com.patrones.creacionales.abstractfactory;

/**
 * PATRÓN ABSTRACT FACTORY
 * 
 * Propósito: Crear familias de objetos relacionados sin especificar 
 * sus clases concretas.
 * 
 * Cuándo usar:
 * - Cuando necesitas crear familias de productos relacionados
 * - Cuando quieres intercambiar fácilmente entre diferentes familias
 * - Cuando quieres garantizar que los productos sean compatibles entre sí
 * 
 * Interfaz abstracta que define los métodos para crear productos relacionados
 */
public abstract class FabricaGUI {
    
    /**
     * Factory method para crear botones
     */
    public abstract Boton crearBoton(String texto);
    
    /**
     * Factory method para crear campos de texto
     */
    public abstract CampoTexto crearCampoTexto(String placeholder, int ancho);
    
    /**
     * Método template que crea una interfaz completa
     */
    public void crearInterfaz() {
        System.out.println("🏭 Creando interfaz de usuario...");
        
        Boton boton = crearBoton("Aceptar");
        CampoTexto campo = crearCampoTexto("Ingrese su nombre", 200);
        
        System.out.println("\n📱 Interfaz creada:");
        boton.renderizar();
        campo.renderizar();
        
        System.out.println("\n✅ Interfaz lista para usar\n");
    }
}

