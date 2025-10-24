package com.patrones.creacionales.factorymethod.problema;

/**
 * DEMO DEL PROBLEMA
 * 
 * PROBLEMAS IDENTIFICADOS:
 * 1. ACOPLAMIENTO: Cada clase está acoplada a una configuración específica
 * 2. DIFÍCIL MANTENIMIENTO: Cambiar configuración requiere modificar múltiples clases
 * 3. DUPLICACIÓN: Lógica de creación repetida en cada clase
 * 4. DIFÍCIL TESTING: No se pueden usar mocks fácilmente
 * 5. VIOLACIÓN PRINCIPIOS SOLID: Código rígido y frágil
 */
public class ProblemaDemo {
    
    public static void main(String[] args) {
        System.out.println("=== DEMO DEL PROBLEMA ===\n");
        
        // Cada servicio está acoplado a su configuración específica
        UsuarioService usuarioService = new UsuarioService();
        ProductoService productoService = new ProductoService();
        ReporteService reporteService = new ReporteService();
        
        System.out.println("1. UsuarioService (acoplado a configuración específica):");
        usuarioService.guardarUsuario("Juan Pérez");
        
        System.out.println("\n2. ProductoService (acoplado a configuración específica):");
        productoService.guardarProducto("Laptop Dell");
        
        System.out.println("\n3. ReporteService (acoplado a configuración específica):");
        reporteService.generarReporte("Ventas Mensuales");
        
        System.out.println("\n=== PROBLEMAS IDENTIFICADOS ===");
        System.out.println("❌ ACOPLAMIENTO: Cada clase depende de configuración específica");
        System.out.println("❌ DIFÍCIL MANTENIMIENTO: Cambiar configuración requiere modificar código");
        System.out.println("❌ DUPLICACIÓN: Lógica de creación repetida");
        System.out.println("❌ DIFÍCIL TESTING: No se pueden usar mocks");
        System.out.println("❌ VIOLACIÓN PRINCIPIOS SOLID: Código rígido y frágil");
    }
}
