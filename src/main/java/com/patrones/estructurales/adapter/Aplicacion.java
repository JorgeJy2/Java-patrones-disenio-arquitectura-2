package com.patrones.creacionales.adapter;

/**
 * CLIENTE - La aplicación que usa los motores
 * 
 * Esta clase representa la aplicación cliente que necesita
 * trabajar con diferentes tipos de motores usando una interfaz uniforme.
 * 
 * La aplicación no conoce la diferencia entre motores compatibles
 * y motores que necesitan adaptación.
 */
public class Aplicacion {
    
    /**
     * Usar un motor común (compatible directamente)
     */
    public void usarMotorComun() {
        System.out.println("🚗 === USANDO MOTOR COMÚN ===");
        Motor motor = new MotorComun();
        
        System.out.println("\n1. Encendiendo motor común:");
        motor.encender();
        
        System.out.println("\n2. Acelerando motor común:");
        motor.acelerar();
        
        System.out.println("\n3. Apagando motor común:");
        motor.apagar();
        
        System.out.println("✅ Motor común usado exitosamente\n");
    }
    
    /**
     * Usar un motor económico (compatible directamente)
     */
    public void usarMotorEconomico() {
        System.out.println("💰 === USANDO MOTOR ECONÓMICO ===");
        Motor motor = new MotorEconomico();
        
        System.out.println("\n1. Encendiendo motor económico:");
        motor.encender();
        
        System.out.println("\n2. Acelerando motor económico:");
        motor.acelerar();
        
        System.out.println("\n3. Apagando motor económico:");
        motor.apagar();
        
        System.out.println("✅ Motor económico usado exitosamente\n");
    }
    
    /**
     * Usar un motor eléctrico (requiere adaptación)
     * 
     * Aquí es donde entra en juego el patrón Adapter.
     * La aplicación puede usar MotorElectrico como si fuera un Motor normal,
     * gracias al MotorElectricoAdapter.
     */
    public void usarMotorElectrico() {
        System.out.println("⚡ === USANDO MOTOR ELÉCTRICO (CON ADAPTER) ===");
        
        // Crear el motor eléctrico original
        MotorElectrico motorElectricoOriginal = new MotorElectrico();
        
        // Crear el adapter que hace compatible el motor eléctrico
        Motor motor = new MotorElectricoAdapter(motorElectricoOriginal);
        
        System.out.println("\n1. Encendiendo motor eléctrico (via adapter):");
        motor.encender();
        
        System.out.println("\n2. Acelerando motor eléctrico (via adapter):");
        motor.acelerar();
        
        System.out.println("\n3. Apagando motor eléctrico (via adapter):");
        motor.apagar();
        
        // Mostrar estado específico del motor eléctrico
        if (motor instanceof MotorElectricoAdapter) {
            ((MotorElectricoAdapter) motor).mostrarEstadoElectrico();
        }
        
        System.out.println("✅ Motor eléctrico usado exitosamente (gracias al adapter)\n");
    }
    
    /**
     * Demostrar el uso de múltiples motores
     */
    public void usarTodosLosMotores() {
        System.out.println("🏭 === USANDO TODOS LOS TIPOS DE MOTORES ===");
        System.out.println("La aplicación puede usar cualquier motor con la misma interfaz\n");
        
        // Usar motor común
        usarMotorComun();
        
        // Usar motor económico  
        usarMotorEconomico();
        
        // Usar motor eléctrico (con adapter)
        usarMotorElectrico();
        
        System.out.println("🎉 Todos los motores funcionan con la misma interfaz!");
    }
}

