package com.patrones.estructurales.bridge;

/**
 * DEMO del patrón Bridge
 * 
 * El patrón Bridge permite separar la abstracción de la implementación,
 * permitiendo que ambas puedan variar independientemente.
 * 
 * En este ejemplo:
 * - Abstracción: RemoteControl (control remoto)
 * - Implementación: Device (dispositivo)
 * - Permite combinar cualquier control remoto con cualquier dispositivo
 */
public class BridgeDemo {
    
    public static void main(String[] args) {
        System.out.println("=== DEMO PATRÓN BRIDGE ===\n");
        
        // Crear dispositivos
        Device radio = new Radio();
        Device tv = new Tv();
        
        // Crear controles remotos
        BasicRemote basicRemote = new BasicRemote(radio);
        AdvancedRemote advancedRemote = new AdvancedRemote(tv);
        
        System.out.println("1. Control remoto básico con radio:");
        basicRemote.power();
        basicRemote.volumeUp();
        basicRemote.channelUp();
        radio.printStatus();
        
        System.out.println("2. Control remoto avanzado con TV:");
        advancedRemote.power();
        advancedRemote.setVolume(50);
        advancedRemote.setChannel(5);
        advancedRemote.mute();
        tv.printStatus();
        
        System.out.println("3. Cambiar dispositivo del control avanzado:");
        advancedRemote = new AdvancedRemote(radio);
        advancedRemote.power();
        advancedRemote.setVolume(75);
        advancedRemote.setChannel(3);
        radio.printStatus();
        
        System.out.println("=== VENTAJAS DEL PATRÓN BRIDGE ===");
        System.out.println("✅ Separación de abstracción e implementación");
        System.out.println("✅ Flexibilidad para combinar cualquier control con cualquier dispositivo");
        System.out.println("✅ Fácil agregar nuevos controles remotos");
        System.out.println("✅ Fácil agregar nuevos dispositivos");
        System.out.println("✅ Evita la explosión de clases");
    }
}
