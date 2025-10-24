package com.patrones.comportamiento.chainofresponsibility;

/**
 * Middleware - Clase base de middleware
 * 
 * Define la interfaz para construir cadenas de manejadores
 * y procesar solicitudes a través de la cadena.
 */
public abstract class Middleware {
    
    private Middleware next;
    
    /**
     * Construye cadenas de objetos middleware
     * @param first Primer middleware en la cadena
     * @param chain Resto de middlewares
     * @return Primer middleware de la cadena
     */
    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }
    
    /**
     * Las subclases implementarán este método con verificaciones concretas
     * @param email Email del usuario
     * @param password Contraseña del usuario
     * @return true si la verificación pasa, false en caso contrario
     */
    public abstract boolean check(String email, String password);
    
    /**
     * Ejecuta la verificación en el siguiente objeto de la cadena
     * o termina el recorrido si estamos en el último objeto
     * @param email Email del usuario
     * @param password Contraseña del usuario
     * @return true si todas las verificaciones pasan
     */
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}
