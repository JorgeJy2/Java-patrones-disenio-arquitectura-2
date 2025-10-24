package com.patrones.creacionales.factorymethod.problema;

/**
 * PROBLEMA: Esta clase crea directamente Conexion
 * Si queremos cambiar la configuración, hay que modificar el código
 */
public class ReporteService {
    
    public void generarReporte(String reporte) {
        // PROBLEMA: Creación directa - acoplado a configuración específica
        Conexion conexion = new Conexion(
            "jdbc:mysql://localhost:3306/reportes", 
            "admin", 
            "password123"
        );
        
        conexion.conectar();
        System.out.println("Generando reporte: " + reporte);
        conexion.desconectar();
    }
}
