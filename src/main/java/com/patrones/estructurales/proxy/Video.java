package com.patrones.estructurales.proxy;

/**
 * Video - Representa un archivo de video
 * 
 * Contiene la información básica de un video de YouTube.
 */
public class Video {
    
    public String id;
    public String title;
    public String data;
    
    public Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}
