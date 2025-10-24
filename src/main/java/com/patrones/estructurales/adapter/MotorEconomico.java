package com.patrones.creacionales.adapter;

/**
 * Implementación concreta de Motor - Motor Económico
 * Implementa directamente la interfaz Motor
 */
public class MotorEconomico extends Motor {
    
    @Override
    public void encender() {
        mostrarEstado("Motor Económico", "Encendiendo motor económico");
        System.out.println("   → Iniciando sistema de bajo consumo");
        System.out.println("   → Verificando eficiencia energética");
        System.out.println("   → Motor económico listo");
    }
    
    @Override
    public void acelerar() {
        mostrarEstado("Motor Económico", "Acelerando motor económico");
        System.out.println("   → Optimizando consumo de combustible");
        System.out.println("   → Aumentando eficiencia");
        System.out.println("   → Motor económico acelerando");
    }
    
    @Override
    public void apagar() {
        mostrarEstado("Motor Económico", "Apagando motor económico");
        System.out.println("   → Activando modo ahorro de energía");
        System.out.println("   → Motor económico detenido");
    }
}

