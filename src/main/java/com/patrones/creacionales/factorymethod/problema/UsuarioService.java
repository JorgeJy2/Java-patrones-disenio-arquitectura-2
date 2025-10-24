package com.patrones.creacionales.factorymethod.problema;

/**
 * PROBLEMA: Esta clase crea directamente Conexion
 * Si queremos cambiar la configuración, hay que modificar el código
 */
public class UsuarioService {
    
    public void guardarUsuario(String nombre) {
        // PROBLEMA: Creación directa - acoplado a configuración específica
        Conexion conexion = new Conexion(
            "jdbc:mysql://localhost:3306/usuarios", 
            "admin", 
            "password123"
        );
        
        conexion.conectar();
        System.out.println("Guardando usuario: " + nombre);
        conexion.desconectar();
    }
}
