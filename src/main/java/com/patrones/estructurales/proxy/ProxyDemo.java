package com.patrones.estructurales.proxy;

/**
 * DEMO del patrón Proxy - Proxy de caché para YouTube
 * 
 * El patrón Proxy proporciona un objeto que actúa como sustituto
 * de un objeto de servicio real utilizado por un cliente.
 * 
 * Basado en el ejemplo de refactoring.guru:
 * https://refactoring.guru/es/design-patterns/proxy/java/example
 */
public class ProxyDemo {
    
    public static void main(String[] args) {
        System.out.println("=== DEMO PATRÓN PROXY - CACHÉ DE YOUTUBE ===\n");
        
        // Crear descargadores: uno sin proxy y otro con proxy
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());
        
        // Probar rendimiento sin proxy
        System.out.println("1. PROBANDO SIN PROXY (Servicio directo):");
        long naive = test(naiveDownloader);
        
        System.out.println("\n2. PROBANDO CON PROXY (Con caché):");
        long smart = test(smartDownloader);
        
        // Mostrar resultados
        System.out.println("\n3. RESULTADOS:");
        System.out.println("Tiempo sin proxy: " + naive + "ms");
        System.out.println("Tiempo con proxy: " + smart + "ms");
        System.out.println("Tiempo ahorrado por proxy de caché: " + (naive - smart) + "ms");
        
        // Demostrar ventajas del proxy
        System.out.println("\n=== VENTAJAS DEL PATRÓN PROXY ===");
        System.out.println("✅ Control de acceso: Puede verificar permisos antes de acceder");
        System.out.println("✅ Caché: Almacena resultados para evitar llamadas repetidas");
        System.out.println("✅ Inicialización diferida: Crea objetos solo cuando se necesitan");
        System.out.println("✅ Logging: Registra acceso a objetos costosos");
        System.out.println("✅ Control remoto: Maneja objetos en diferentes espacios de direcciones");
        System.out.println("✅ Transparencia: El cliente no conoce si usa el objeto real o el proxy");
    }
    
    /**
     * Prueba el rendimiento de un descargador
     * @param downloader Descargador a probar
     * @return Tiempo transcurrido en milisegundos
     */
    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();
        
        // Comportamiento del usuario en nuestra app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Los usuarios podrían visitar la misma página con frecuencia.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");
        
        long endTime = System.currentTimeMillis();
        long elapsed = endTime - startTime;
        
        System.out.println("Tiempo transcurrido: " + elapsed + "ms");
        return elapsed;
    }
}
