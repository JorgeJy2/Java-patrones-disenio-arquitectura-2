package com.patrones.estructurales.decorator;

/**
 * FacebookDecorator - Decorador concreto
 * Agrega funcionalidad de envío por Facebook al notificador
 */
public class FacebookDecorator extends NotifierDecorator {
    
    private final String appId;
    
    public FacebookDecorator(Notifier inner, String appId) {
        super(inner);
        this.appId = appId;
    }
    
    @Override
    public void send(String message) {
        // Simular envío por Facebook
        System.out.println("[FB@" + appId + "] " + message);
        // Delegar al notificador interno
        inner.send(message);
    }
}
