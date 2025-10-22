package com.patrones.creacionales.adapter;

/**
 * CLASE ADAPTEE (Adaptada)
 * 
 * Esta clase tiene una interfaz incompatible con Motor.
 * Sus métodos no coinciden con los que espera la aplicación.
 * 
 * Esta clase representa un motor eléctrico existente que
 * tiene su propia interfaz específica.
 */
public class MotorElectrico {
    
    private boolean conectado;
    private boolean activo;
    private int velocidad;
    
    public MotorElectrico() {
        this.conectado = false;
        this.activo = false;
        this.velocidad = 0;
    }
    
    /**
     * Conectar el motor eléctrico a la fuente de energía
     */
    public void conectar() {
        this.conectado = true;
        System.out.println("⚡ Motor Eléctrico: Conectado a la red eléctrica");
        System.out.println("   → Verificando voltaje");
        System.out.println("   → Estableciendo conexión segura");
    }
    
    /**
     * Activar el motor eléctrico
     */
    public void activar() {
        if (conectado) {
            this.activo = true;
            this.velocidad = 1;
            System.out.println("⚡ Motor Eléctrico: Activado");
            System.out.println("   → Iniciando campo magnético");
            System.out.println("   → Motor eléctrico funcionando");
        } else {
            System.out.println("❌ Error: Motor eléctrico no está conectado");
        }
    }
    
    /**
     * Hacer que el motor eléctrico se mueva más rápido
     */
    public void moverMasRapido() {
        if (activo) {
            this.velocidad += 2;
            System.out.println("⚡ Motor Eléctrico: Aumentando velocidad a " + velocidad);
            System.out.println("   → Incrementando corriente eléctrica");
            System.out.println("   → Optimizando campo magnético");
        } else {
            System.out.println("❌ Error: Motor eléctrico no está activo");
        }
    }
    
    /**
     * Detener el motor eléctrico
     */
    public void detener() {
        this.activo = false;
        this.velocidad = 0;
        System.out.println("⚡ Motor Eléctrico: Detenido");
        System.out.println("   → Reduciendo corriente a cero");
        System.out.println("   → Motor eléctrico parado");
    }
    
    /**
     * Desconectar el motor eléctrico
     */
    public void desconectar() {
        this.conectado = false;
        this.activo = false;
        this.velocidad = 0;
        System.out.println("⚡ Motor Eléctrico: Desconectado");
        System.out.println("   → Cortando suministro eléctrico");
        System.out.println("   → Motor eléctrico desconectado");
    }
    
    // Getters para verificar estado
    public boolean isConectado() {
        return conectado;
    }
    
    public boolean isActivo() {
        return activo;
    }
    
    public int getVelocidad() {
        return velocidad;
    }
}
