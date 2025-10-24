package com.patrones.creacionales.factorymethod.solucion;

/**
 * Creador específico para MySQL
 * Implementa el Factory Method para crear conexiones MySQL
 * Incluye pasos adicionales: autenticación y configuración de charset
 */
public class CreadorConexionMySQL extends CreadorConexion {
    
    @Override
    protected Conexion crearConexion() {
        // PASOS ADICIONALES ESPECÍFICOS DE MYSQL
        configurarAutenticacion();
        configurarCharset();
        
        return new Conexion(
            "jdbc:mysql://localhost:3306/empresa", 
            "admin", 
            "password123"
        );
    }
    
    /**
     * Configuración específica de autenticación para MySQL
     */
    private void configurarAutenticacion() {
        System.out.println("  → Configurando autenticación MySQL...");
        System.out.println("  → Validando credenciales...");
    }
    
    /**
     * Configuración de charset específica para MySQL
     */
    private void configurarCharset() {
        System.out.println("  → Configurando charset UTF-8...");
        System.out.println("  → Estableciendo collation...");
    }
}
