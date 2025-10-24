package com.patrones.estructurales.proxy;

import java.util.HashMap;

/**
 * ThirdPartyYouTubeLib - Interfaz de servicio remoto
 * 
 * Define la interfaz para acceder a la API de YouTube de terceros.
 * Esta interfaz será implementada tanto por el servicio real como por el proxy.
 */
public interface ThirdPartyYouTubeLib {
    
    /**
     * Obtiene la lista de videos populares
     * @return HashMap con videos populares
     */
    HashMap<String, Video> popularVideos();
    
    /**
     * Obtiene un video específico por ID
     * @param videoId ID del video
     * @return Video solicitado
     */
    Video getVideo(String videoId);
}
