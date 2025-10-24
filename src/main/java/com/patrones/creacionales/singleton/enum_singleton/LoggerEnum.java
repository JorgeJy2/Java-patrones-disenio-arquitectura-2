package com.patrones.creacionales.singleton.enum_singleton;

/**
 * Singleton usando Enum - La forma más segura en Java
 * 
 * ¿POR QUÉ FUNCIONA ESTA IMPLEMENTACIÓN?
 * =====================================
 * 
 * 1. ENUM = CLASE ESPECIAL:
 *    - Un enum es una clase especial que extiende de java.lang.Enum
 *    - Java automáticamente crea las instancias de las constantes
 *    - Las constantes del enum son objetos únicos y finales
 * 
 * 2. INSTANCE NO NECESITA TIPO NI ACCESO:
 *    - Es una CONSTANTE del enum, no una variable
 *    - Java automáticamente le asigna el tipo LoggerEnum
 *    - Es implícitamente public, static y final
 *    - Es como escribir: public static final LoggerEnum INSTANCE = new LoggerEnum();
 * 
 * 3. CONSTRUCTOR PRIVADO AUTOMÁTICO:
 *    - Java crea automáticamente un constructor privado
 *    - No se puede usar 'new' para crear instancias
 *    - Solo se pueden crear las constantes definidas en el enum
 * 
 * 4. THREAD-SAFE AUTOMÁTICO:
 *    - Java garantiza que las constantes se crean de forma thread-safe
 *    - No hay problemas de concurrencia
 * 
 * 5. SERIALIZACIÓN SEGURA:
 *    - Los enums manejan automáticamente la serialización
 *    - No se pueden crear múltiples instancias al deserializar
 */
public enum LoggerEnum {
    
    /**
     * CONSTANTE ÚNICA DEL ENUM
     * ========================
     * 
     * Esta línea es equivalente a:
     * public static final LoggerEnum INSTANCE = new LoggerEnum();
     * 
     * Pero Java lo maneja automáticamente:
     * - Tipo: LoggerEnum (automático)
     * - Acceso: public static final (automático)
     * - Inicialización: automática y thread-safe
     * - Constructor: privado automático
     */
    INSTANCE;
    
    private String mensaje;  // ← Variable para guardar el último mensaje
    
    /**
     * CONSTRUCTOR IMPLÍCITO
     * ====================
     * 
     * Java automáticamente crea un constructor privado:
     * private LoggerEnum() {
     *     // Inicialización automática
     * }
     * 
     * No necesitamos escribirlo, Java lo hace por nosotros.
     */
    
    // Método para registrar un mensaje
    public void log(String mensaje) {
        this.mensaje = mensaje;  // ← Guarda el mensaje en la variable
        System.out.println("Log: " + mensaje);  // ← Lo muestra en pantalla
    }
    
    // Método para obtener el último mensaje guardado
    public String getMensaje() {
        return mensaje;  // ← Devuelve el mensaje guardado
    }
}
