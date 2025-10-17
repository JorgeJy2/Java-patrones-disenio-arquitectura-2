package com.patrones.creacionales.prototype;

/**
 * PATRÓN PROTOTYPE
 * 
 * Propósito: Crear objetos clonando una instancia existente (prototipo)
 * en lugar de crear nuevos objetos desde cero.
 * 
 * Cuándo usar:
 * - Cuando crear objetos es costoso (operaciones complejas, consultas a BD)
 * - Cuando quieres evitar subclases para crear objetos
 * - Cuando necesitas crear objetos en tiempo de ejecución
 * 
 * Interfaz que define el método clone para todas las formas
 */
public abstract class Forma implements Cloneable {
    
    protected String tipo;
    protected String color;
    protected int x, y; // posición
    
    public Forma(String tipo, String color) {
        this.tipo = tipo;
        this.color = color;
        this.x = 0;
        this.y = 0;
    }
    
    /**
     * Método abstracto que cada forma debe implementar
     */
    public abstract void dibujar();
    
    /**
     * Implementación del patrón Prototype
     * Crea una copia exacta del objeto actual
     */
    @Override
    public Forma clone() {
        try {
            Forma formaClonada = (Forma) super.clone();
            // Si hubiera objetos complejos, aquí se haría deep copy
            return formaClonada;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar la forma", e);
        }
    }
    
    /**
     * Método para mover la forma
     */
    public void mover(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Moviendo " + tipo + " a posición (" + x + ", " + y + ")");
    }
    
    /**
     * Método para mostrar información de la forma
     */
    public void mostrarInfo() {
        System.out.println("=== INFORMACIÓN DE LA FORMA ===");
        System.out.println("Tipo: " + tipo);
        System.out.println("Color: " + color);
        System.out.println("Posición: (" + x + ", " + y + ")");
        System.out.println("Hash: " + this.hashCode());
        System.out.println("===============================");
    }
    
    // Getters y Setters
    public String getTipo() {
        return tipo;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
}
