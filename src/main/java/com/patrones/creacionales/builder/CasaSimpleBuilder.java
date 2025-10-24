package com.patrones.creacionales.builder;

/**
 * Builder para casas simples
 * Implementa la construcción de una casa básica y económica
 */
public class CasaSimpleBuilder implements CasaBuilder {
    
    private Casa casa;
    
    public CasaSimpleBuilder() {
        this.casa = new Casa("Ladrillo", "Cemento", 4, "Madera", "Teja", 
                           false, false, false, false, false, false, null, 0, null);
    }
    
    @Override
    public void construirParedes() {
        System.out.println("Construyendo paredes de ladrillo...");
        casa = new Casa("Ladrillo", casa.tipoPiso, casa.numeroVentanas, 
                       casa.tipoPuerta, casa.tipoTejado, casa.tieneJardin, 
                       casa.tienePiscina, casa.tieneGaraje, casa.tieneCalefaccion, 
                       casa.tieneFontaneria, casa.tieneCableado, casa.tipoPorche, 
                       casa.numeroHabitaciones, casa.estiloArquitectonico);
    }
    
    @Override
    public void construirPiso() {
        System.out.println("Construyendo piso de cemento...");
    }
    
    @Override
    public void instalarVentanas() {
        System.out.println("Instalando 4 ventanas básicas...");
    }
    
    @Override
    public void instalarPuerta() {
        System.out.println("Instalando puerta de madera...");
    }
    
    @Override
    public void construirTejado() {
        System.out.println("Construyendo tejado de teja...");
    }
    
    @Override
    public void agregarJardin() {
        System.out.println("Agregando jardín pequeño...");
    }
    
    @Override
    public void agregarPiscina() {
        System.out.println("No se agrega piscina en casa simple");
    }
    
    @Override
    public void agregarGaraje() {
        System.out.println("No se agrega garaje en casa simple");
    }
    
    @Override
    public void instalarCalefaccion() {
        System.out.println("No se instala calefacción en casa simple");
    }
    
    @Override
    public void instalarFontaneria() {
        System.out.println("Instalando fontanería básica...");
    }
    
    @Override
    public void instalarCableado() {
        System.out.println("Instalando cableado básico...");
    }
    
    @Override
    public void construirPorche() {
        System.out.println("No se construye porche en casa simple");
    }
    
    @Override
    public void definirHabitaciones() {
        System.out.println("Definiendo 2 habitaciones...");
    }
    
    @Override
    public void aplicarEstilo() {
        System.out.println("Aplicando estilo básico...");
    }
    
    @Override
    public Casa obtenerCasa() {
        return casa;
    }
}
