package com.patrones.estructurales.decorator;

/**
 * DEMO del patrón Decorator - Sistema de Notificaciones
 * 
 * El patrón Decorator permite agregar funcionalidad a objetos
 * de forma dinámica sin alterar su estructura.
 * 
 * En este ejemplo:
 * - Componente base: EmailNotifier
 * - Decoradores: SMS, Slack, Facebook
 * - Se pueden combinar múltiples canales de notificación
 */
public class DecoratorDemo {
    
    public static void main(String[] args) {
        System.out.println("=== DEMO PATRÓN DECORATOR - SISTEMA DE NOTIFICACIONES ===\n");
        
        // 1. Notificación básica solo por email
        System.out.println("1. NOTIFICACIÓN BÁSICA (Solo Email):");
        Notifier basicNotifier = new EmailNotifier("smtp.acme.com");
        basicNotifier.send("¡Hola equipo! Release 1.2.3 en producción.");
        
        // 2. Notificación con SMS + Email
        System.out.println("\n2. NOTIFICACIÓN CON SMS + EMAIL:");
        Notifier smsNotifier = new SMSDecorator(
            new EmailNotifier("smtp.acme.com"), 
            "twilio"
        );
        smsNotifier.send("¡Hola equipo! Release 1.2.3 en producción.");
        
        // 3. Notificación con múltiples canales (Slack + SMS + Facebook + Email)
        System.out.println("\n3. NOTIFICACIÓN MULTICANAL:");
        Notifier multiChannelNotifier = new SlackDecorator(
            new SMSDecorator(
                new FacebookDecorator(
                    new EmailNotifier("smtp.acme.com"), 
                    "fb-app-1"
                ), 
                "twilio"
            ), 
            "slack-webhook"
        );
        multiChannelNotifier.send("¡Hola equipo! Release 1.2.3 en producción.");
        
        // 4. Diferentes combinaciones
        System.out.println("\n4. DIFERENTES COMBINACIONES:");
        
        // Solo Slack + Email
        System.out.println("4a. Slack + Email:");
        Notifier slackEmail = new SlackDecorator(
            new EmailNotifier("smtp.acme.com"), 
            "slack-webhook"
        );
        slackEmail.send("Mensaje importante para el equipo");
        
        // Facebook + SMS + Email
        System.out.println("\n4b. Facebook + SMS + Email:");
        Notifier fbSmsEmail = new FacebookDecorator(
            new SMSDecorator(
                new EmailNotifier("smtp.acme.com"), 
                "twilio"
            ), 
            "fb-app-2"
        );
        fbSmsEmail.send("Actualización de sistema completada");
        
        // 5. Demostrar flexibilidad
        System.out.println("\n5. FLEXIBILIDAD DEL PATRÓN:");
        System.out.println("✅ Se pueden agregar/quitar canales dinámicamente");
        System.out.println("✅ El orden de los decoradores importa");
        System.out.println("✅ Cada decorador agrega su funcionalidad");
        System.out.println("✅ El código cliente no cambia");
        System.out.println("✅ Fácil agregar nuevos tipos de notificaciones");
        
        System.out.println("\n=== VENTAJAS DEL PATRÓN DECORATOR ===");
        System.out.println("✅ Extensibilidad sin modificar código existente");
        System.out.println("✅ Composición flexible de funcionalidades");
        System.out.println("✅ Principio abierto/cerrado respetado");
        System.out.println("✅ Evita la explosión de subclases");
        System.out.println("✅ Funcionalidad agregada en tiempo de ejecución");
    }
}
