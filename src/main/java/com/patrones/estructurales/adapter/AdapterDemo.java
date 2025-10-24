package com.patrones.creacionales.adapter;

/**
 * DEMO del patrón Adapter
 * 
 * Este ejemplo demuestra que:
 * 1. La aplicación puede usar motores compatibles directamente
 * 2. La aplicación puede usar motores incompatibles a través de un adapter
 * 3. El adapter traduce las llamadas de una interfaz a otra
 * 4. La aplicación no necesita conocer las diferencias internas
 */
public class AdapterDemo {
    
    public static void main(String[] args) {
        System.out.println("=== DEMO PATRÓN ADAPTER ===\n");
        
        // Crear la aplicación cliente
        Aplicacion aplicacion = new Aplicacion();
        
        System.out.println("🎯 PROBLEMA: La aplicación necesita usar diferentes tipos de motores");
        System.out.println("   - Motor Común: Compatible directamente ✅");
        System.out.println("   - Motor Económico: Compatible directamente ✅");
        System.out.println("   - Motor Eléctrico: Incompatible ❌ (necesita adapter)");
        System.out.println();
        
        System.out.println("🔧 SOLUCIÓN: Usar el patrón Adapter para hacer compatible el Motor Eléctrico");
        System.out.println();
        
        // Demostrar el uso de todos los motores
        aplicacion.usarTodosLosMotores();
        
        // Demostrar el problema sin adapter
        System.out.println("❌ === PROBLEMA SIN ADAPTER ===");
        System.out.println("Si intentáramos usar MotorElectrico directamente:");
        System.out.println("   MotorElectrico motor = new MotorElectrico();");
        System.out.println("   motor.encender(); // ❌ No existe este método");
        System.out.println("   motor.acelerar(); // ❌ No existe este método");
        System.out.println("   motor.apagar();   // ❌ No existe este método");
        System.out.println();
        
        System.out.println("✅ === SOLUCIÓN CON ADAPTER ===");
        System.out.println("Con el adapter, podemos usar MotorElectrico como cualquier Motor:");
        System.out.println("   Motor motor = new MotorElectricoAdapter(new MotorElectrico());");
        System.out.println("   motor.encender(); // ✅ Funciona (traduce a conectar() + activar())");
        System.out.println("   motor.acelerar(); // ✅ Funciona (traduce a moverMasRapido())");
        System.out.println("   motor.apagar();   // ✅ Funciona (traduce a detener() + desconectar())");
        System.out.println();
        
        System.out.println("🎉 Demo completado - Adapter permite integrar interfaces incompatibles");
    }
}

