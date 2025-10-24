package com.patrones.comportamiento.chainofresponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * DEMO del patrón Chain of Responsibility - Acceso filtrado
 * 
 * El patrón Chain of Responsibility permite pasar solicitudes
 * a lo largo de una cadena de manejadores potenciales hasta que
 * uno de ellos gestiona la solicitud.
 * 
 * Basado en el ejemplo de refactoring.guru:
 * https://refactoring.guru/es/design-patterns/chain-of-responsibility/java/example
 */
public class ChainOfResponsibilityDemo {
    
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;
    
    /**
     * Inicializa el servidor y la cadena de middleware
     */
    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");
        
        // Todas las verificaciones están enlazadas. El cliente puede
        // construir varias cadenas usando los mismos componentes.
        Middleware middleware = Middleware.link(
            new ThrottlingMiddleware(2),
            new UserExistsMiddleware(server),
            new RoleCheckMiddleware()
        );
        
        // El servidor obtiene una cadena del código cliente.
        server.setMiddleware(middleware);
    }
    
    public static void main(String[] args) throws IOException {
        System.out.println("=== DEMO PATRÓN CHAIN OF RESPONSIBILITY ===\n");
        System.out.println("Sistema de autenticación con filtros en cadena\n");
        
        init();
        
        boolean success;
        do {
            System.out.print("Ingrese email: ");
            String email = reader.readLine();
            System.out.print("Ingrese contraseña: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
            System.out.println();
        } while (!success);
        
        System.out.println("\n=== VENTAJAS DEL PATRÓN CHAIN OF RESPONSIBILITY ===");
        System.out.println("✅ Desacopla emisor y receptor de solicitudes");
        System.out.println("✅ Permite agregar/quitar manejadores dinámicamente");
        System.out.println("✅ Cada manejador tiene una responsabilidad única");
        System.out.println("✅ El orden de los manejadores puede cambiar fácilmente");
        System.out.println("✅ Un manejador puede decidir no pasar la solicitud");
        System.out.println("✅ Facilita el cumplimiento del principio de responsabilidad única");
        
        System.out.println("\n=== CADENA DE VERIFICACIONES ===");
        System.out.println("1. ThrottlingMiddleware: Limita solicitudes por minuto");
        System.out.println("2. UserExistsMiddleware: Verifica credenciales del usuario");
        System.out.println("3. RoleCheckMiddleware: Verifica el rol del usuario");
    }
}
