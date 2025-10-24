package com.patrones.estructurales.decorator;

/**
 * NotifierDecorator - Decorador base (Decorator)
 * Clase abstracta que implementa la interfaz Notifier
 * y mantiene una referencia al objeto Notifier que decora
 */
public abstract class NotifierDecorator implements Notifier {
    
    protected final Notifier inner;
    
    public NotifierDecorator(Notifier inner) {
        this.inner = inner;
    }
}
