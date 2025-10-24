package com.patrones.estructurales.facade;

import java.io.File;

/**
 * VideoConversionFacade - Facade para conversión de video
 * 
 * Proporciona una interfaz simplificada para la biblioteca compleja
 * de conversión de video. Oculta toda la complejidad del proceso
 * de conversión detrás de un método simple.
 */
public class VideoConversionFacade {
    
    /**
     * Convierte un video de un formato a otro
     * @param fileName Nombre del archivo de video
     * @param format Formato de destino (mp4, ogg)
     * @return Archivo convertido
     */
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversión iniciada.");
        
        // 1. Crear objeto VideoFile
        VideoFile file = new VideoFile(fileName);
        
        // 2. Extraer códec fuente
        Codec sourceCodec = CodecFactory.extract(file);
        
        // 3. Determinar códec destino
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        
        // 4. Leer archivo con códec fuente
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        
        // 5. Convertir con códec destino
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        
        // 6. Mezclar audio
        File result = (new AudioMixer()).fix(intermediateResult);
        
        System.out.println("VideoConversionFacade: conversión completada.");
        return result;
    }
}
