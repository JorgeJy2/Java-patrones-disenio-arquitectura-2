package com.patrones.creacionales.builder;

/**
 * Interfaz Builder para construir casas
 * Define los pasos para construir una casa paso a paso
 */
public interface CasaBuilder {
    
    // Pasos básicos obligatorios
    void construirParedes();
    void construirPiso();
    void instalarVentanas();
    void instalarPuerta();
    void construirTejado();
    
    // Pasos opcionales
    void agregarJardin();
    void agregarPiscina();
    void agregarGaraje();
    void instalarCalefaccion();
    void instalarFontaneria();
    void instalarCableado();
    void construirPorche();
    void definirHabitaciones();
    void aplicarEstilo();
    
    // Obtener el resultado
    Casa obtenerCasa();
}
