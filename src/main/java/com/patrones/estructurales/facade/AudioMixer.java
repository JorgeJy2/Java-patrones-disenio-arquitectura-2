package com.patrones.estructurales.facade;

import java.io.File;

/**
 * AudioMixer - Mezclador de audio
 * Parte de la biblioteca compleja de conversión de video
 */
public class AudioMixer {
    
    public File fix(VideoFile result) {
        System.out.println("AudioMixer: arreglando audio...");
        return new File("tmp");
    }
}
