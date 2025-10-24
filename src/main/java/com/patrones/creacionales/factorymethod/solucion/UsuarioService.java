package com.patrones.creacionales.factorymethod.solucion;

/**
 * SOLUCIÓN: Usa Factory Method en lugar de crear directamente
 * Ahora está desacoplado del tipo específico de conexión
 */
public class UsuarioService {
    
    private CreadorConexion creadorConexion;
    
    public UsuarioService(CreadorConexion creadorConexion) {
        this.creadorConexion = creadorConexion;
    }
    
    public void guardarUsuario(String nombre) {
        // SOLUCIÓN: Usa el Factory Method - no conoce el tipo específico
        creadorConexion.procesarOperacion("Guardando usuario: " + nombre);
    }
}
