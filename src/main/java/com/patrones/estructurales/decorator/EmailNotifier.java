package com.patrones.estructurales.decorator;

/**
 * EmailNotifier - Componente base (ConcreteComponent)
 * Implementación básica para enviar notificaciones por email
 */
public class EmailNotifier implements Notifier {
    
    private final String smtpHost;
    
    public EmailNotifier(String smtpHost) {
        this.smtpHost = smtpHost;
    }
    
    @Override
    public void send(String message) {
        // Simular envío de email
        System.out.println("[EMAIL@" + smtpHost + "] " + message);
    }
}
