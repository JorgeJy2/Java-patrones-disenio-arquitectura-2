package com.patrones.estructurales.decorator;

/**
 * SMSDecorator - Decorador concreto
 * Agrega funcionalidad de envío por SMS al notificador
 */
public class SMSDecorator extends NotifierDecorator {
    
    private final String provider;
    
    public SMSDecorator(Notifier inner, String provider) {
        super(inner);
        this.provider = provider;
    }
    
    @Override
    public void send(String message) {
        // Simular envío de SMS
        System.out.println("[SMS@" + provider + "] " + message);
        // Delegar al notificador interno
        inner.send(message);
    }
}
