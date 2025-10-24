package com.patrones.creacionales.builder;

/**
 * Director - Define el proceso de construcción
 * Orquesta la construcción de la casa usando un builder específico
 */
public class Constructor {
    
    private CasaBuilder casaBuilder;
    
    public void setCasaBuilder(CasaBuilder casaBuilder) {
        this.casaBuilder = casaBuilder;
    }
    
    /**
     * Construir casa básica - solo lo esencial
     */
    public void construirCasaBasica() {
        casaBuilder.construirParedes();
        casaBuilder.construirPiso();
        casaBuilder.instalarVentanas();
        casaBuilder.instalarPuerta();
        casaBuilder.construirTejado();
    }
    
    /**
     * Construir casa completa - con todas las comodidades
     */
    public void construirCasaCompleta() {
        casaBuilder.construirParedes();
        casaBuilder.construirPiso();
        casaBuilder.instalarVentanas();
        casaBuilder.instalarPuerta();
        casaBuilder.construirTejado();
        casaBuilder.agregarJardin();
        casaBuilder.agregarGaraje();
        casaBuilder.instalarCalefaccion();
        casaBuilder.instalarFontaneria();
        casaBuilder.instalarCableado();
        casaBuilder.definirHabitaciones();
        casaBuilder.aplicarEstilo();
    }
    
    /**
     * Construir casa de lujo - con piscina y porche
     */
    public void construirCasaLujo() {
        casaBuilder.construirParedes();
        casaBuilder.construirPiso();
        casaBuilder.instalarVentanas();
        casaBuilder.instalarPuerta();
        casaBuilder.construirTejado();
        casaBuilder.agregarJardin();
        casaBuilder.agregarPiscina();
        casaBuilder.agregarGaraje();
        casaBuilder.instalarCalefaccion();
        casaBuilder.instalarFontaneria();
        casaBuilder.instalarCableado();
        casaBuilder.construirPorche();
        casaBuilder.definirHabitaciones();
        casaBuilder.aplicarEstilo();
    }
    
    public Casa obtenerCasa() {
        return casaBuilder.obtenerCasa();
    }
}
