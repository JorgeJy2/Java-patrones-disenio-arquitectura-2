package com.patrones.estructurales.facade;

/**
 * CodecFactory - Factory para crear códecs
 * Parte de la biblioteca compleja de conversión de video
 */
public class CodecFactory {
    
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extrayendo audio mpeg...");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodecFactory: extrayendo audio ogg...");
            return new OggCompressionCodec();
        }
    }
}
