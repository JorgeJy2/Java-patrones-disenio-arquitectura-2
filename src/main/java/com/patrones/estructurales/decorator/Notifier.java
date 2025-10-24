package com.patrones.estructurales.decorator;

/**
 * Interfaz Notifier - Componente común
 * Define la interfaz para enviar notificaciones
 * 
 * El patrón Decorator permite agregar funcionalidad a objetos
 * de forma dinámica sin alterar su estructura.
 */
public interface Notifier {
    
    /**
     * Envía un mensaje a través del canal de notificación
     * @param message El mensaje a enviar
     */
    void send(String message);
}
