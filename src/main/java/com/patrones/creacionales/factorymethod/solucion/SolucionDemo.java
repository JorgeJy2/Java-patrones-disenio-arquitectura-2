package com.patrones.creacionales.factorymethod.solucion;

/**
 * DEMO DE LA SOLUCIÓN CON FACTORY METHOD
 * 
 * VENTAJAS DE LA SOLUCIÓN:
 * 1. DESACOPLAMIENTO: Los servicios no conocen el tipo de base de datos
 * 2. FLEXIBILIDAD: Se puede cambiar entre MySQL y PostgreSQL sin modificar el código cliente
 * 3. TESTING: Se pueden usar mocks fácilmente
 * 4. PRINCIPIO ABIERTO/CERRADO: Se pueden agregar nuevas BDs sin modificar código existente
 * 5. REUTILIZACIÓN: La lógica de creación está centralizada
 */
public class SolucionDemo {
    
    public static void main(String[] args) {
        System.out.println("=== DEMO DE LA SOLUCIÓN CON FACTORY METHOD ===\n");
        
        // Crear servicios con MySQL
        System.out.println("1. Usando MySQL:");
        UsuarioService usuarioServiceMySQL = new UsuarioService(new CreadorConexionMySQL());
        usuarioServiceMySQL.guardarUsuario("Juan Pérez");
        
        ProductoService productoServiceMySQL = new ProductoService(new CreadorConexionMySQL());
        productoServiceMySQL.guardarProducto("Laptop Dell");
        
        ReporteService reporteServiceMySQL = new ReporteService(new CreadorConexionMySQL());
        reporteServiceMySQL.generarReporte("Ventas Mensuales");
        
        // DEMOSTRAR FLEXIBILIDAD: Cambiar a PostgreSQL sin modificar los servicios
        System.out.println("\n=== CAMBIANDO A POSTGRESQL (SIN MODIFICAR CÓDIGO) ===");
        System.out.println("2. Ahora usando PostgreSQL:");
        UsuarioService usuarioServicePostgres = new UsuarioService(new CreadorConexionPostgreSQL());
        usuarioServicePostgres.guardarUsuario("María García");
        
        ProductoService productoServicePostgres = new ProductoService(new CreadorConexionPostgreSQL());
        productoServicePostgres.guardarProducto("Mouse Logitech");
        
        ReporteService reporteServicePostgres = new ReporteService(new CreadorConexionPostgreSQL());
        reporteServicePostgres.generarReporte("Reporte Anual");
        
        System.out.println("\n=== VENTAJAS DE LA SOLUCIÓN ===");
        System.out.println("✅ DESACOPLAMIENTO: Servicios no conocen el tipo de BD");
        System.out.println("✅ FLEXIBILIDAD: Cambiar BD sin modificar código");
        System.out.println("✅ TESTING: Fácil usar mocks");
        System.out.println("✅ PRINCIPIO ABIERTO/CERRADO: Extensible sin modificar");
        System.out.println("✅ REUTILIZACIÓN: Lógica centralizada");
        System.out.println("✅ MANTENIMIENTO: Código más limpio y organizado");
    }
}
