package com.patrones.estructurales.facade;

/**
 * VideoFile - Representa un archivo de video
 * Parte de la biblioteca compleja de conversión de video
 */
public class VideoFile {
    
    private String name;
    private String codecType;
    
    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }
    
    public String getCodecType() {
        return codecType;
    }
    
    public String getName() {
        return name;
    }
}
