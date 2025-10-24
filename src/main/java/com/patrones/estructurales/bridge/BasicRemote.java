package com.patrones.estructurales.bridge;

/**
 * BasicRemote - Implementación concreta de RemoteControl
 * Control remoto básico
 */
public class BasicRemote extends RemoteControl {
    
    public BasicRemote(Device device) {
        super(device);
    }
    
    public void power() {
        System.out.println("Control remoto: botón de encendido");
        togglePower();
    }
    
    public void volumeDown() {
        System.out.println("Control remoto: bajar volumen");
        super.volumeDown();
    }
    
    public void volumeUp() {
        System.out.println("Control remoto: subir volumen");
        super.volumeUp();
    }
    
    public void channelDown() {
        System.out.println("Control remoto: canal anterior");
        super.channelDown();
    }
    
    public void channelUp() {
        System.out.println("Control remoto: siguiente canal");
        super.channelUp();
    }
}
