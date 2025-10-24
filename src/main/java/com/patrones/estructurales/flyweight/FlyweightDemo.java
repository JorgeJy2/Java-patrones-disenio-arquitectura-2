package com.patrones.estructurales.flyweight;

/**
 * DEMO del patrón Flyweight - Representación de un Bosque
 * 
 * El patrón Flyweight permite a los programas soportar grandes cantidades
 * de objetos manteniendo un bajo uso de memoria.
 * 
 * Basado en el ejemplo de refactoring.guru:
 * https://refactoring.guru/es/design-patterns/flyweight/java/example
 */
public class FlyweightDemo {
    
    private static final int CANVAS_SIZE = 100;
    private static final int TREES_TO_DRAW = 1000;
    private static final int TREE_TYPES = 3;
    
    public static void main(String[] args) {
        System.out.println("=== DEMO PATRÓN FLYWEIGHT - BOSQUE ===\n");
        
        Forest forest = new Forest();
        
        // Crear árboles de diferentes tipos
        System.out.println("1. CREANDO BOSQUE CON " + TREES_TO_DRAW + " ÁRBOLES:");
        for (int i = 0; i < TREES_TO_DRAW / TREE_TYPES; i++) {
            // Roble de verano
            forest.plantTree(
                random(0, CANVAS_SIZE), 
                random(0, CANVAS_SIZE),
                "Roble de Verano", 
                "Verde", 
                "Textura de roble de verano"
            );
            
            // Roble de otoño
            forest.plantTree(
                random(0, CANVAS_SIZE), 
                random(0, CANVAS_SIZE),
                "Roble de Otoño", 
                "Naranja", 
                "Textura de roble de otoño"
            );
            
            // Pino
            forest.plantTree(
                random(0, CANVAS_SIZE), 
                random(0, CANVAS_SIZE),
                "Pino", 
                "Verde Oscuro", 
                "Textura de pino"
            );
        }
        
        // Dibujar algunos árboles como ejemplo
        System.out.println("2. DIBUJANDO PRIMEROS 10 ÁRBOLES:");
        drawFirstNTrees(forest, 10);
        
        // Mostrar estadísticas de memoria
        System.out.println("3. ESTADÍSTICAS DE MEMORIA:");
        mostrarEstadisticasMemoria(forest);
        
        // Demostrar reutilización de tipos
        System.out.println("4. DEMOSTRANDO REUTILIZACIÓN:");
        demostrarReutilizacion();
        
        System.out.println("=== VENTAJAS DEL PATRÓN FLYWEIGHT ===");
        System.out.println("✅ Reduce el uso de memoria significativamente");
        System.out.println("✅ Permite manejar grandes cantidades de objetos");
        System.out.println("✅ Comparte estado común entre objetos similares");
        System.out.println("✅ Mejora el rendimiento al reutilizar objetos");
        System.out.println("✅ Facilita el manejo de objetos con datos duplicados");
    }
    
    /**
     * Dibuja los primeros N árboles del bosque
     */
    private static void drawFirstNTrees(Forest forest, int n) {
        // Simulación de dibujo de los primeros N árboles
        System.out.println("Dibujando los primeros " + n + " árboles...");
        forest.draw();
    }
    
    /**
     * Muestra estadísticas de uso de memoria
     */
    private static void mostrarEstadisticasMemoria(Forest forest) {
        int treeCount = forest.getTreeCount();
        int treeTypeCount = forest.getTreeTypeCount();
        
        System.out.println("Árboles dibujados: " + treeCount);
        System.out.println("Tipos únicos de árboles: " + treeTypeCount);
        System.out.println("---------------------");
        System.out.println("Uso de memoria:");
        System.out.println("Tamaño de Tree (8 bytes) * " + treeCount);
        System.out.println("+ Tamaño de TreeType (~30 bytes) * " + treeTypeCount);
        System.out.println("---------------------");
        
        int totalMemory = (treeCount * 8 + treeTypeCount * 30) / 1024;
        int withoutFlyweight = (treeCount * 38) / 1024;
        
        System.out.println("Total: " + totalMemory + "KB (en lugar de " + withoutFlyweight + "KB)");
        System.out.println("Ahorro de memoria: " + (withoutFlyweight - totalMemory) + "KB");
    }
    
    /**
     * Demuestra la reutilización de tipos de árboles
     */
    private static void demostrarReutilizacion() {
        System.out.println("Creando árboles del mismo tipo:");
        
        // Limpiar factory para demostración
        TreeFactory.getTreeType("Roble", "Verde", "Textura1");
        TreeFactory.getTreeType("Roble", "Verde", "Textura1"); // Debería reutilizar
        TreeFactory.getTreeType("Pino", "Verde", "Textura2");  // Nuevo tipo
        TreeFactory.getTreeType("Roble", "Verde", "Textura1"); // Debería reutilizar
    }
    
    /**
     * Genera un número aleatorio entre min y max
     */
    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
