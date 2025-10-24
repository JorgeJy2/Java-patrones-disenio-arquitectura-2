package com.patrones.estructurales.proxy;

import java.util.HashMap;

/**
 * YouTubeDownloader - Aplicación de descarga de medios
 * 
 * Cliente que utiliza la biblioteca de YouTube para descargar
 * y renderizar videos. No conoce si está usando el servicio real
 * o el proxy con caché.
 */
public class YouTubeDownloader {
    
    private ThirdPartyYouTubeLib api;
    
    public YouTubeDownloader(ThirdPartyYouTubeLib api) {
        this.api = api;
    }
    
    /**
     * Renderiza la página de un video específico
     * @param videoId ID del video a renderizar
     */
    public void renderVideoPage(String videoId) {
        Video video = api.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("Página de video (imagina HTML elegante)");
        System.out.println("ID: " + video.id);
        System.out.println("Título: " + video.title);
        System.out.println("Video: " + video.data);
        System.out.println("-------------------------------\n");
    }
    
    /**
     * Renderiza la lista de videos populares
     */
    public void renderPopularVideos() {
        HashMap<String, Video> list = api.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Videos más populares en YouTube (imagina HTML elegante)");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.id + " / Título: " + video.title);
        }
        System.out.println("-------------------------------\n");
    }
}
