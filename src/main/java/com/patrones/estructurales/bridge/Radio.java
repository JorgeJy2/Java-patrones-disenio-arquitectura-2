package com.patrones.estructurales.bridge;

/**
 * Radio - Implementación concreta de Device
 */
public class Radio implements Device {
    
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;
    
    @Override
    public boolean isEnabled() {
        return on;
    }
    
    @Override
    public void enable() {
        on = true;
    }
    
    @Override
    public void disable() {
        on = false;
    }
    
    @Override
    public int getVolume() {
        return volume;
    }
    
    @Override
    public void setVolume(int percent) {
        if (percent > 100) {
            this.volume = 100;
        } else if (percent < 0) {
            this.volume = 0;
        } else {
            this.volume = percent;
        }
    }
    
    @Override
    public int getChannel() {
        return channel;
    }
    
    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }
    
    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| Soy la radio.");
        System.out.println("| Estoy " + (on ? "encendida" : "apagada"));
        System.out.println("| Volumen actual es " + volume + "%");
        System.out.println("| Canal actual es " + channel);
        System.out.println("------------------------------------\n");
    }
}
