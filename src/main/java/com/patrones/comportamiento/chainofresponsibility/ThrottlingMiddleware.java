package com.patrones.comportamiento.chainofresponsibility;

/**
 * ThrottlingMiddleware - Manejador concreto
 * 
 * Comprueba si hay demasiadas solicitudes de inicio de sesión fallidas.
 * Limita el número de solicitudes por minuto.
 */
public class ThrottlingMiddleware extends Middleware {
    
    private int requestPerMinute;
    private int request;
    private long currentTime;
    
    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }
    
    /**
     * Ten en cuenta que la llamada checkNext() puede insertarse tanto
     * al principio como al final de este método.
     * 
     * Esto proporciona mucha más flexibilidad que un simple bucle
     * sobre todos los objetos middleware. Por ejemplo, un elemento
     * de una cadena puede cambiar el orden de las verificaciones
     * ejecutando su verificación después de todas las demás.
     */
    @Override
    public boolean check(String email, String password) {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }
        
        request++;
        
        if (request > requestPerMinute) {
            System.out.println("¡Límite de solicitudes excedido!");
            return false;
        }
        return checkNext(email, password);
    }
}
