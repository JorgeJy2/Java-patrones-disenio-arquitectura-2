package com.patrones.creacionales.factorymethod.solucion;

/**
 * SOLUCIÓN: Usa Factory Method en lugar de crear directamente
 * Ahora está desacoplado del tipo específico de conexión
 */
public class ProductoService {
    
    private CreadorConexion creadorConexion;
    
    public ProductoService(CreadorConexion creadorConexion) {
        this.creadorConexion = creadorConexion;
    }
    
    public void guardarProducto(String producto) {
        // SOLUCIÓN: Usa el Factory Method - no conoce el tipo específico
        creadorConexion.procesarOperacion("Guardando producto: " + producto);
    }
}
