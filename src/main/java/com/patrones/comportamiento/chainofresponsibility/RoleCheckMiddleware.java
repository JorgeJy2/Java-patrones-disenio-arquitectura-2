package com.patrones.comportamiento.chainofresponsibility;

/**
 * RoleCheckMiddleware - Manejador concreto
 * 
 * Comprueba el rol de un usuario y proporciona
 * un saludo personalizado según el rol.
 */
public class RoleCheckMiddleware extends Middleware {
    
    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("¡Hola, admin!");
            return true;
        }
        System.out.println("¡Hola, usuario!");
        return checkNext(email, password);
    }
}
