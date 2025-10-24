package com.patrones.estructurales.decorator;

/**
 * SlackDecorator - Decorador concreto
 * Agrega funcionalidad de envío por Slack al notificador
 */
public class SlackDecorator extends NotifierDecorator {
    
    private final String webhook;
    
    public SlackDecorator(Notifier inner, String webhook) {
        super(inner);
        this.webhook = webhook;
    }
    
    @Override
    public void send(String message) {
        // Simular envío por Slack
        System.out.println("[SLACK@" + webhook + "] " + message);
        // Delegar al notificador interno
        inner.send(message);
    }
}
