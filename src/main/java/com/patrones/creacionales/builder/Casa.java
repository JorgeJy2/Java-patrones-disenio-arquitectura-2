package com.patrones.creacionales.builder;

/**
 * Clase Casa - Objeto complejo que requiere muchos parámetros
 * 
 * PROBLEMA: Constructor telescópico con muchos parámetros opcionales
 * - No todos los parámetros son necesarios siempre
 * - Llamadas al constructor son feas
 * - Difícil de mantener y extender
 */
public class Casa {
    
    // Parámetros básicos
    public String tipoParedes;
    public String tipoPiso;
    public int numeroVentanas;
    public String tipoPuerta;
    public String tipoTejado;
    
    // Parámetros opcionales
    public boolean tieneJardin;
    public boolean tienePiscina;
    public boolean tieneGaraje;
    public boolean tieneCalefaccion;
    public boolean tieneFontaneria;
    public boolean tieneCableado;
    public String tipoPorche;
    public int numeroHabitaciones;
    public String estiloArquitectonico;
    
    // Constructor telescópico - PROBLEMA
    public Casa(String tipoParedes, String tipoPiso, int numeroVentanas, 
                String tipoPuerta, String tipoTejado, boolean tieneJardin, 
                boolean tienePiscina, boolean tieneGaraje, boolean tieneCalefaccion, 
                boolean tieneFontaneria, boolean tieneCableado, String tipoPorche, 
                int numeroHabitaciones, String estiloArquitectonico) {
        this.tipoParedes = tipoParedes;
        this.tipoPiso = tipoPiso;
        this.numeroVentanas = numeroVentanas;
        this.tipoPuerta = tipoPuerta;
        this.tipoTejado = tipoTejado;
        this.tieneJardin = tieneJardin;
        this.tienePiscina = tienePiscina;
        this.tieneGaraje = tieneGaraje;
        this.tieneCalefaccion = tieneCalefaccion;
        this.tieneFontaneria = tieneFontaneria;
        this.tieneCableado = tieneCableado;
        this.tipoPorche = tipoPorche;
        this.numeroHabitaciones = numeroHabitaciones;
        this.estiloArquitectonico = estiloArquitectonico;
    }
    
    // Constructor básico - también problemático
    public Casa(String tipoParedes, String tipoPiso, int numeroVentanas, 
                String tipoPuerta, String tipoTejado) {
        this(tipoParedes, tipoPiso, numeroVentanas, tipoPuerta, tipoTejado, 
             false, false, false, false, false, false, null, 0, null);
    }
    
    public void mostrarCasa() {
        System.out.println("=== CASA CONSTRUIDA ===");
        System.out.println("Paredes: " + tipoParedes);
        System.out.println("Piso: " + tipoPiso);
        System.out.println("Ventanas: " + numeroVentanas);
        System.out.println("Puerta: " + tipoPuerta);
        System.out.println("Tejado: " + tipoTejado);
        System.out.println("Jardín: " + (tieneJardin ? "Sí" : "No"));
        System.out.println("Piscina: " + (tienePiscina ? "Sí" : "No"));
        System.out.println("Garaje: " + (tieneGaraje ? "Sí" : "No"));
        System.out.println("Calefacción: " + (tieneCalefaccion ? "Sí" : "No"));
        System.out.println("Fontanería: " + (tieneFontaneria ? "Sí" : "No"));
        System.out.println("Cableado: " + (tieneCableado ? "Sí" : "No"));
        System.out.println("Porche: " + (tipoPorche != null ? tipoPorche : "No"));
        System.out.println("Habitaciones: " + numeroHabitaciones);
        System.out.println("Estilo: " + (estiloArquitectonico != null ? estiloArquitectonico : "Básico"));
    }
}
