package com.patrones.creacionales.adapter;

/**
 * Implementación concreta de Motor - Motor Común
 * Implementa directamente la interfaz Motor
 */
public class MotorComun extends Motor {
    
    @Override
    public void encender() {
        mostrarEstado("Motor Común", "Encendiendo motor de combustión");
        System.out.println("   → Iniciando sistema de ignición");
        System.out.println("   → Verificando combustible");
        System.out.println("   → Motor común listo");
    }
    
    @Override
    public void acelerar() {
        mostrarEstado("Motor Común", "Acelerando motor de combustión");
        System.out.println("   → Inyectando más combustible");
        System.out.println("   → Aumentando RPM");
        System.out.println("   → Motor común acelerando");
    }
    
    @Override
    public void apagar() {
        mostrarEstado("Motor Común", "Apagando motor de combustión");
        System.out.println("   → Cortando suministro de combustible");
        System.out.println("   → Motor común detenido");
    }
}
