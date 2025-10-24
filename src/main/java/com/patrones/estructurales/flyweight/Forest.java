package com.patrones.estructurales.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Forest - Bosque que contiene múltiples árboles
 * 
 * Esta clase demuestra el uso del patrón Flyweight al crear
 * muchos árboles que comparten tipos comunes.
 */
public class Forest {
    
    private List<Tree> trees = new ArrayList<>();
    
    /**
     * Planta un árbol en el bosque
     * @param x Coordenada X
     * @param y Coordenada Y
     * @param name Nombre del tipo de árbol
     * @param color Color del árbol
     * @param texture Textura del árbol
     */
    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }
    
    /**
     * Dibuja todos los árboles del bosque
     */
    public void draw() {
        System.out.println("=== DIBUJANDO BOSQUE ===");
        for (Tree tree : trees) {
            tree.draw();
        }
        System.out.println("=== FIN BOSQUE ===\n");
    }
    
    /**
     * Obtiene el número de árboles en el bosque
     * @return Número de árboles
     */
    public int getTreeCount() {
        return trees.size();
    }
    
    /**
     * Obtiene el número de tipos únicos de árboles
     * @return Número de tipos únicos
     */
    public int getTreeTypeCount() {
        return TreeFactory.getTreeTypeCount();
    }
}
