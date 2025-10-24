package com.patrones.estructurales.bridge;

/**
 * Interfaz Device (Dispositivo) - Implementación
 * Define la interfaz común para todos los dispositivos
 */
public interface Device {
    
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int percent);
    int getChannel();
    void setChannel(int channel);
    void printStatus();
}
