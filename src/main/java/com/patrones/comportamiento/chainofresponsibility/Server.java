package com.patrones.comportamiento.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

/**
 * Server - Clase servidor
 * 
 * Objetivo de la autorización. El servidor recibe
 * una cadena de middleware del cliente y la utiliza
 * para procesar las solicitudes de inicio de sesión.
 */
public class Server {
    
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;
    
    /**
     * El cliente pasa una cadena de objetos al servidor.
     * Esto mejora la flexibilidad y facilita las pruebas
     * de la clase servidor.
     * @param middleware Cadena de middleware
     */
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }
    
    /**
     * El servidor obtiene email y contraseña del cliente
     * y envía la solicitud de autorización a la cadena.
     * @param email Email del usuario
     * @param password Contraseña del usuario
     * @return true si la autorización es exitosa
     */
    public boolean logIn(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("¡La autorización ha sido exitosa!");
            
            // Hacer algo útil aquí para usuarios autorizados.
            
            return true;
        }
        return false;
    }
    
    /**
     * Registra un nuevo usuario
     * @param email Email del usuario
     * @param password Contraseña del usuario
     */
    public void register(String email, String password) {
        users.put(email, password);
    }
    
    /**
     * Verifica si existe un email
     * @param email Email a verificar
     * @return true si el email existe
     */
    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }
    
    /**
     * Verifica si la contraseña es válida
     * @param email Email del usuario
     * @param password Contraseña a verificar
     * @return true si la contraseña es válida
     */
    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}
