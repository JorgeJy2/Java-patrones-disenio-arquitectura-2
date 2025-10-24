package com.patrones.estructurales.proxy;

import java.util.HashMap;

/**
 * YouTubeCacheProxy - Proxy de caché
 * 
 * Implementa el patrón Proxy para agregar funcionalidad de caché
 * a la biblioteca de YouTube de terceros. Intercepta las llamadas
 * y las cachea para mejorar el rendimiento.
 */
public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {
    
    private ThirdPartyYouTubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();
    
    public YouTubeCacheProxy() {
        this.youtubeService = new ThirdPartyYouTubeClass();
    }
    
    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Lista recuperada del caché.");
        }
        return cachePopular;
    }
    
    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Video '" + videoId + "' recuperado del caché.");
        }
        return video;
    }
    
    /**
     * Limpia el caché
     */
    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
