package com.patrones.creacionales.abstractfactory;

/**
 * DEMO del patrón Abstract Factory
 * 
 * Este ejemplo demuestra que:
 * 1. Se pueden crear familias completas de productos relacionados
 * 2. Es fácil cambiar entre diferentes familias (Windows vs Mac)
 * 3. Los productos de una familia son compatibles entre sí
 */
public class AbstractFactoryDemo {
    
    public static void main(String[] args) {
        System.out.println("=== DEMO PATRÓN ABSTRACT FACTORY ===\n");
        
        // Crear interfaz para Windows
        System.out.println("1. Creando interfaz para Windows:");
        FabricaGUI fabricaWindows = new FabricaWindows();
        fabricaWindows.crearInterfaz();
        
        // Crear interfaz para Mac
        System.out.println("2. Creando interfaz para Mac:");
        FabricaGUI fabricaMac = new FabricaMac();
        fabricaMac.crearInterfaz();
        
        // Demostrar flexibilidad: crear componentes individuales
        System.out.println("3. Creando componentes individuales:");
        
        // Componentes Windows
        System.out.println("Componentes Windows:");
        Boton botonWin = fabricaWindows.crearBoton("Guardar");
        CampoTexto campoWin = fabricaWindows.crearCampoTexto("Archivo", 150);
        botonWin.renderizar();
        campoWin.renderizar();
        
        // Componentes Mac
        System.out.println("\nComponentes Mac:");
        Boton botonMac = fabricaMac.crearBoton("Guardar");
        CampoTexto campoMac = fabricaMac.crearCampoTexto("Archivo", 150);
        botonMac.renderizar();
        campoMac.renderizar();
        
        // Demostrar uso de los componentes
        System.out.println("\n4. Usando los componentes:");
        botonWin.hacerClic();
        campoWin.escribir("documento.txt");
        botonMac.hacerClic();
        campoMac.escribir("documento.txt");
        
        System.out.println("\n✓ Demo completado - Abstract Factory crea familias de productos compatibles");
    }
}
