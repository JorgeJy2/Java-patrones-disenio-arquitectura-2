package com.patrones.estructurales.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * TreeFactory - Factory para crear y reutilizar TreeTypes
 * 
 * Esta clase implementa el patrón Flyweight al reutilizar
 * instancias de TreeType en lugar de crear nuevas cada vez.
 * Solo se crea una instancia por tipo único de árbol.
 */
public class TreeFactory {
    
    private static Map<String, TreeType> treeTypes = new HashMap<>();
    
    /**
     * Obtiene o crea un TreeType
     * @param name Nombre del tipo de árbol
     * @param color Color del árbol
     * @param texture Textura del árbol
     * @return TreeType existente o nuevo
     */
    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "_" + color + "_" + texture;
        TreeType result = treeTypes.get(key);
        
        if (result == null) {
            result = new TreeType(name, color, texture);
            treeTypes.put(key, result);
            System.out.println("Creando nuevo tipo de árbol: " + name);
        } else {
            System.out.println("Reutilizando tipo de árbol existente: " + name);
        }
        
        return result;
    }
    
    /**
     * Obtiene el número de tipos únicos creados
     * @return Número de tipos únicos
     */
    public static int getTreeTypeCount() {
        return treeTypes.size();
    }
}
