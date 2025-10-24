package com.patrones.comportamiento.chainofresponsibility;

/**
 * UserExistsMiddleware - Manejador concreto
 * 
 * Comprueba si existe un usuario con las credenciales proporcionadas.
 * Verifica email y contraseña contra la base de datos del servidor.
 */
public class UserExistsMiddleware extends Middleware {
    
    private Server server;
    
    public UserExistsMiddleware(Server server) {
        this.server = server;
    }
    
    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("¡Este email no está registrado!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("¡Contraseña incorrecta!");
            return false;
        }
        return checkNext(email, password);
    }
}
