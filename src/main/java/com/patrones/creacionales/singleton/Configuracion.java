package com.patrones.creacionales.singleton;

/**
 * PATRÓN SINGLETON
 * 
 * Propósito: Asegurar que una clase tenga solo una instancia y proporcionar 
 * un punto de acceso global a ella.
 * 
 * Cuándo usar:
 * - Cuando necesitas exactamente una instancia de una clase
 * - Cuando quieres controlar el acceso a recursos compartidos
 * - Para configuraciones globales, conexiones a base de datos, loggers
 * 
 * Este ejemplo simula una configuración de aplicación que debe ser única.
 */
public class Configuracion {
    
    // Instancia única (lazy initialization)
    private static Configuracion instancia;
    
    // Variables de configuración
    private String nombreApp;
    private String version;
    private boolean debugMode;
    
    /**
     * Constructor privado para evitar instanciación directa
     */
    private Configuracion() {
        // Configuración por defecto
        this.nombreApp = "Mi Aplicación";
        this.version = "1.0.0";
        this.debugMode = false;
        
        System.out.println("✓ Configuración inicializada (Singleton)");
    }
    
    /**
     * Método estático para obtener la instancia única
     * Implementa lazy initialization (se crea solo cuando se necesita)
     */
    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }
    
    // Getters y Setters
    public String getNombreApp() {
        return nombreApp;
    }
    
    public void setNombreApp(String nombreApp) {
        this.nombreApp = nombreApp;
    }
    
    public String getVersion() {
        return version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }
    
    public boolean isDebugMode() {
        return debugMode;
    }
    
    public void setDebugMode(boolean debugMode) {
        this.debugMode = debugMode;
    }
    
    /**
     * Método para mostrar la configuración actual
     */
    public void mostrarConfiguracion() {
        System.out.println("=== CONFIGURACIÓN ACTUAL ===");
        System.out.println("Aplicación: " + nombreApp);
        System.out.println("Versión: " + version);
        System.out.println("Debug: " + (debugMode ? "Activado" : "Desactivado"));
        System.out.println("Hash de la instancia: " + this.hashCode());
        System.out.println("=============================");
    }
}
