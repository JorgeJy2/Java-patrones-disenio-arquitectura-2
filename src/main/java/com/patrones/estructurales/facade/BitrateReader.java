package com.patrones.estructurales.facade;

/**
 * BitrateReader - Lector de bitrate
 * Parte de la biblioteca compleja de conversión de video
 */
public class BitrateReader {
    
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: leyendo archivo...");
        return file;
    }
    
    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: escribiendo archivo...");
        return buffer;
    }
}
