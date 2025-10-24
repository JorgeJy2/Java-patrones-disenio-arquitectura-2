package com.patrones.creacionales.factorymethod.solucion;

/**
 * Creador específico para PostgreSQL
 * Implementa el Factory Method para crear conexiones PostgreSQL
 * Incluye pasos adicionales: encriptación, VPN y configuración SSL
 */
public class CreadorConexionPostgreSQL extends CreadorConexion {
    
    @Override
    protected Conexion crearConexion() {
        // PASOS ADICIONALES ESPECÍFICOS DE POSTGRESQL
        configurarVPN();
        configurarEncriptacion();
        configurarSSL();
        
        return new Conexion(
            "jdbc:postgresql://localhost:5432/empresa", 
            "admin", 
            "password123"
        );
    }
    
    /**
     * Configuración específica de VPN para PostgreSQL
     */
    private void configurarVPN() {
        System.out.println("  → Configurando VPN para PostgreSQL...");
        System.out.println("  → Estableciendo túnel seguro...");
    }
    
    /**
     * Configuración de encriptación específica para PostgreSQL
     */
    private void configurarEncriptacion() {
        System.out.println("  → Configurando encriptación AES-256...");
        System.out.println("  → Generando claves de encriptación...");
    }
    
    /**
     * Configuración SSL específica para PostgreSQL
     */
    private void configurarSSL() {
        System.out.println("  → Configurando SSL/TLS...");
        System.out.println("  → Validando certificados...");
    }
}
