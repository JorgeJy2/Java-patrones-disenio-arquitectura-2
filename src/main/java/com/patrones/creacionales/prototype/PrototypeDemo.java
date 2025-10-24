package com.patrones.creacionales.prototype;

/**
 * DEMO del patrón Prototype
 * 
 * Este ejemplo demuestra que:
 * 1. Se pueden crear copias exactas de objetos existentes
 * 2. Es más eficiente que crear objetos desde cero
 * 3. Permite personalizar las copias según sea necesario
 */
public class PrototypeDemo {

   

    
    public static void main(String[] args) {
        System.out.println("=== DEMO PATRÓN PROTOTYPE ===\n");
        
        // Crear prototipos originales
        System.out.println("1. Creando prototipos originales:");
        Circulo circuloOriginal = new Circulo("Rojo", 10);
        Rectangulo rectanguloOriginal = new Rectangulo("Azul", 20, 15);
        
        circuloOriginal.mostrarInfo();
        rectanguloOriginal.mostrarInfo();
        
        // Clonar los prototipos
        System.out.println("\n2. Clonando prototipos:");
        Circulo circuloClonado = circuloOriginal.clone();
        Rectangulo rectanguloClonado = rectanguloOriginal.clone();
        
        System.out.println("✓ Círculo clonado");
        System.out.println("✓ Rectángulo clonado");
        
        // Verificar que son objetos diferentes pero con el mismo contenido
        System.out.println("\n3. Verificando clonación:");
        System.out.println("Círculo original == clonado: " + (circuloOriginal == circuloClonado));
        System.out.println("Rectángulo original == clonado: " + (rectanguloOriginal == rectanguloClonado));
        
        // Personalizar las copias
        System.out.println("\n4. Personalizando las copias:");
        circuloClonado.setColor("Verde");
        circuloClonado.mover(5, 10);
        circuloClonado.setRadio(15);
        
        rectanguloClonado.setColor("Amarillo");
        rectanguloClonado.mover(20, 30);
        rectanguloClonado.setAncho(25);
        
        // Mostrar resultados
        System.out.println("\n5. Resultados finales:");
        System.out.println("ORIGINALES:");
        circuloOriginal.mostrarInfo();
        rectanguloOriginal.mostrarInfo();
        
        System.out.println("CLONADOS Y PERSONALIZADOS:");
        circuloClonado.mostrarInfo();
        rectanguloClonado.mostrarInfo();
        
        // Demostrar dibujo
        System.out.println("\n6. Dibujando formas:");
        circuloOriginal.dibujar();
        circuloClonado.dibujar();
        rectanguloOriginal.dibujar();
        rectanguloClonado.dibujar();
        
        System.out.println("\n✓ Demo completado - Prototype permite clonar objetos eficientemente");
    }
}

