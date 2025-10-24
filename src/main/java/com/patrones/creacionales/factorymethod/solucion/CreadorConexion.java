package com.patrones.creacionales.factorymethod.solucion;

/**
 * FACTORY METHOD - Clase abstracta que define el método de creación
 * 
 * VENTAJAS:
 * - Desacopla la creación de objetos del código cliente
 * - Permite cambiar la configuración sin modificar el código cliente
 * - Facilita el testing (se pueden usar mocks)
 * - Sigue el principio abierto/cerrado
 */
public abstract class CreadorConexion {
    
    /**
     * MÉTODO PLANTILLA - Define el algoritmo general
     * Las subclases implementan crearConexion() para crear la configuración específica
     */
    public void procesarOperacion(String operacion) {
        Conexion conexion = crearConexion();  // ← Factory Method
        conexion.conectar();
        System.out.println("Ejecutando: " + operacion);
        conexion.desconectar();
    }
    
    /**
     * FACTORY METHOD - Método abstracto que las subclases deben implementar
     * Cada subclase decide qué configuración usar
     */
    protected abstract Conexion crearConexion();
}
