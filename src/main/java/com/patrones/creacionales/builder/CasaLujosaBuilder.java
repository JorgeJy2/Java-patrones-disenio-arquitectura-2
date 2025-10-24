package com.patrones.creacionales.builder;

/**
 * Builder para casas de lujo
 * Implementa la construcción de una casa con todas las comodidades
 */
public class CasaLujosaBuilder implements CasaBuilder {
    
    private Casa casa;
    
    public CasaLujosaBuilder() {
        this.casa = new Casa("Mármol", "Parquet", 8, "Cristal", "Pizarra", 
                           true, true, true, true, true, true, "Elegante", 5, "Moderno");
    }
    
    @Override
    public void construirParedes() {
        System.out.println("Construyendo paredes de mármol...");
    }
    
    @Override
    public void construirPiso() {
        System.out.println("Construyendo piso de parquet...");
    }
    
    @Override
    public void instalarVentanas() {
        System.out.println("Instalando 8 ventanas panorámicas...");
    }
    
    @Override
    public void instalarPuerta() {
        System.out.println("Instalando puerta de cristal...");
    }
    
    @Override
    public void construirTejado() {
        System.out.println("Construyendo tejado de pizarra...");
    }
    
    @Override
    public void agregarJardin() {
        System.out.println("Agregando jardín paisajístico...");
    }
    
    @Override
    public void agregarPiscina() {
        System.out.println("Agregando piscina con jacuzzi...");
    }
    
    @Override
    public void agregarGaraje() {
        System.out.println("Agregando garaje para 3 autos...");
    }
    
    @Override
    public void instalarCalefaccion() {
        System.out.println("Instalando sistema de calefacción central...");
    }
    
    @Override
    public void instalarFontaneria() {
        System.out.println("Instalando fontanería de lujo...");
    }
    
    @Override
    public void instalarCableado() {
        System.out.println("Instalando cableado inteligente...");
    }
    
    @Override
    public void construirPorche() {
        System.out.println("Construyendo porche elegante...");
    }
    
    @Override
    public void definirHabitaciones() {
        System.out.println("Definiendo 5 habitaciones de lujo...");
    }
    
    @Override
    public void aplicarEstilo() {
        System.out.println("Aplicando estilo arquitectónico moderno...");
    }
    
    @Override
    public Casa obtenerCasa() {
        return casa;
    }
}
