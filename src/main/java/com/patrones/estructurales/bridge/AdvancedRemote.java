package com.patrones.estructurales.bridge;

/**
 * AdvancedRemote - Implementación concreta de RemoteControl
 * Control remoto avanzado con funcionalidades adicionales
 */
public class AdvancedRemote extends BasicRemote {
    
    public AdvancedRemote(Device device) {
        super(device);
    }
    
    public void mute() {
        System.out.println("Control remoto: silenciar");
        device.setVolume(0);
    }
    
    public void setVolume(int volume) {
        System.out.println("Control remoto: establecer volumen a " + volume + "%");
        device.setVolume(volume);
    }
    
    public void setChannel(int channel) {
        System.out.println("Control remoto: cambiar a canal " + channel);
        device.setChannel(channel);
    }
}
