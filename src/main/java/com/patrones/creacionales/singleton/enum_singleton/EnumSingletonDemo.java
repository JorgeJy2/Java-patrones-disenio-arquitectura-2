package com.patrones.creacionales.singleton.enum_singleton;

/**
 * Demo Singleton con Enum
 */
public class EnumSingletonDemo {
    
    public static void main(String[] args) {
        // Obtener la instancia única (siempre es la misma)
        LoggerEnum logger1 = LoggerEnum.INSTANCE;  // ← Primera referencia
        LoggerEnum logger2 = LoggerEnum.INSTANCE;  // ← Segunda referencia
        
        // Verificar que es la misma instancia (debería ser true)
        System.out.println("¿Misma instancia? " + (logger1 == logger2));
        
        // Usar el singleton - ambos apuntan al mismo objeto
        logger1.log("Mensaje 1");  // ← Escribe "Mensaje 1"
        logger2.log("Mensaje 2");  // ← Sobrescribe con "Mensaje 2"
        
        // Ambos apuntan al mismo objeto, por eso muestra "Mensaje 2"
        System.out.println("Último mensaje: " + logger1.getMensaje());
    }
}
