package com.patrones.creacionales.adapter;

/**
 * ADAPTER - El corazón del patrón Adapter
 * 
 * Esta clase adapta la interfaz incompatible de MotorElectrico
 * para que sea compatible con la interfaz Motor.
 * 
 * El adapter:
 * 1. Implementa la interfaz Motor (Target)
 * 2. Contiene una referencia a MotorElectrico (Adaptee)
 * 3. Traduce las llamadas de Motor a las llamadas de MotorElectrico
 */
public class MotorElectricoAdapter extends Motor {
    
    // Referencia al objeto que necesita ser adaptado
    private MotorElectrico motorElectrico;
    
    /**
     * Constructor que recibe el motor eléctrico a adaptar
     */
    public MotorElectricoAdapter(MotorElectrico motorElectrico) {
        this.motorElectrico = motorElectrico;
    }
    
    /**
     * Implementa encender() de Motor
     * Traduce a conectar() + activar() de MotorElectrico
     */
    @Override
    public void encender() {
        mostrarEstado("Motor Eléctrico (Adaptado)", "Encendiendo motor eléctrico");
        System.out.println("   → Adaptando interfaz eléctrica a interfaz estándar");
        motorElectrico.conectar();
        motorElectrico.activar();
        System.out.println("   → Motor eléctrico adaptado y listo");
    }
    
    /**
     * Implementa acelerar() de Motor
     * Traduce a moverMasRapido() de MotorElectrico
     */
    @Override
    public void acelerar() {
        mostrarEstado("Motor Eléctrico (Adaptado)", "Acelerando motor eléctrico");
        System.out.println("   → Adaptando aceleración eléctrica a interfaz estándar");
        motorElectrico.moverMasRapido();
        System.out.println("   → Motor eléctrico adaptado acelerando");
    }
    
    /**
     * Implementa apagar() de Motor
     * Traduce a detener() + desconectar() de MotorElectrico
     */
    @Override
    public void apagar() {
        mostrarEstado("Motor Eléctrico (Adaptado)", "Apagando motor eléctrico");
        System.out.println("   → Adaptando apagado eléctrico a interfaz estándar");
        motorElectrico.detener();
        motorElectrico.desconectar();
        System.out.println("   → Motor eléctrico adaptado apagado");
    }
    
    /**
     * Método adicional para obtener información del motor eléctrico
     */
    public void mostrarEstadoElectrico() {
        System.out.println("📊 Estado del Motor Eléctrico:");
        System.out.println("   Conectado: " + (motorElectrico.isConectado() ? "Sí" : "No"));
        System.out.println("   Activo: " + (motorElectrico.isActivo() ? "Sí" : "No"));
        System.out.println("   Velocidad: " + motorElectrico.getVelocidad());
    }
}
