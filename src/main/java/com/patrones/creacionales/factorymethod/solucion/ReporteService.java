package com.patrones.creacionales.factorymethod.solucion;

/**
 * SOLUCIÓN: Usa Factory Method en lugar de crear directamente
 * Ahora está desacoplado del tipo específico de conexión
 */
public class ReporteService {
    
    private CreadorConexion creadorConexion;
    
    public ReporteService(CreadorConexion creadorConexion) {
        this.creadorConexion = creadorConexion;
    }
    
    public void generarReporte(String reporte) {
        // SOLUCIÓN: Usa el Factory Method - no conoce el tipo específico
        creadorConexion.procesarOperacion("Generando reporte: " + reporte);
    }
}
