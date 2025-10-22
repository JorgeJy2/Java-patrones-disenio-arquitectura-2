package com.patrones.creacionales.adapter;

/**
 * PATRÓN ADAPTER - INTERFAZ OBJETIVO
 * 
 * Propósito: Permite que objetos con interfaces incompatibles trabajen juntos.
 * El Adapter actúa como un puente entre dos interfaces incompatibles.
 * 
 * Cuándo usar:
 * - Cuando necesitas usar una clase existente cuya interfaz no es compatible
 * - Cuando quieres integrar sistemas de terceros
 * - Cuando necesitas reutilizar código existente sin modificarlo
 * 
 * Esta es la interfaz que espera la aplicación cliente.
 * Define el contrato estándar para todos los motores.
 */
public abstract class Motor {
    
    /**
     * Encender el motor
     */
    public abstract void encender();
    
    /**
     * Acelerar el motor
     */
    public abstract void acelerar();
    
    /**
     * Apagar el motor
     */
    public abstract void apagar();
    
    /**
     * Método común para mostrar el estado del motor
     */
    public void mostrarEstado(String tipoMotor, String accion) {
        System.out.println("🔧 " + tipoMotor + ": " + accion);
    }
}
