package com.patrones.estructurales.composite;

/**
 * DEMO del patrón Composite
 * 
 * El patrón Composite permite componer objetos en una estructura en forma de árbol
 * y trabajar con ella como si fuera un objeto único.
 * 
 * Basado en el ejemplo de refactoring.guru:
 * https://refactoring.guru/es/design-patterns/composite/java/example
 */
public class CompositeDemo {
    
    public static void main(String[] args) {
        System.out.println("=== DEMO PATRÓN COMPOSITE ===\n");
        
        // Crear formas simples
        System.out.println("1. CREANDO FORMAS SIMPLES:");
        Circle circle = new Circle(10, 10, 10, "AZUL");
        Dot dot = new Dot(160, 160, "ROJO");
        Rectangle rectangle = new Rectangle(250, 250, 100, 100, "VERDE");
        
        // Pintar formas simples
        circle.paint();
        dot.paint();
        rectangle.paint();
        
        // Crear forma compuesta 1: Círculo con punto
        System.out.println("2. CREANDO FORMA COMPUESTA 1 (Círculo + Punto):");
        CompoundShape compoundShape1 = new CompoundShape(
            new Circle(110, 110, 50, "ROJO"),
            new Dot(160, 160, "ROJO")
        );
        compoundShape1.paint();
        
        // Crear forma compuesta 2: Rectángulo con puntos en las esquinas
        System.out.println("3. CREANDO FORMA COMPUESTA 2 (Rectángulo + Puntos):");
        CompoundShape compoundShape2 = new CompoundShape(
            new Rectangle(250, 250, 100, 100, "VERDE"),
            new Dot(240, 240, "VERDE"),
            new Dot(240, 360, "VERDE"),
            new Dot(360, 360, "VERDE"),
            new Dot(360, 240, "VERDE")
        );
        compoundShape2.paint();
        
        // Crear forma compuesta de formas compuestas
        System.out.println("4. CREANDO FORMA COMPUESTA DE FORMAS COMPUESTAS:");
        CompoundShape megaShape = new CompoundShape(
            compoundShape1,
            compoundShape2,
            new Circle(50, 50, 20, "MORADO")
        );
        megaShape.paint();
        
        // Demostrar operaciones uniformes
        System.out.println("5. DEMOSTRANDO OPERACIONES UNIFORMES:");
        System.out.println("Moviendo todas las formas 10 unidades hacia la derecha:");
        megaShape.move(10, 0);
        megaShape.paint();
        
        System.out.println("Seleccionando todas las formas:");
        megaShape.select();
        megaShape.paint();
        
        System.out.println("=== VENTAJAS DEL PATRÓN COMPOSITE ===");
        System.out.println("✅ Tratamiento uniforme de objetos simples y compuestos");
        System.out.println("✅ Operaciones recursivas automáticas");
        System.out.println("✅ Fácil agregar nuevos tipos de formas");
        System.out.println("✅ Estructura de árbol flexible");
        System.out.println("✅ Código cliente simplificado");
    }
}
