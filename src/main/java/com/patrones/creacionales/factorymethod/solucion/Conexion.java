package com.patrones.creacionales.factorymethod.solucion;

/**
 * Clase simple para conexiones MySQL (igual que en el problema)
 */
public class Conexion {
    
    private String url;
    private String usuario;
    private String password;
    
    public Conexion(String url, String usuario, String password) {
        this.url = url;
        this.usuario = usuario;
        this.password = password;
    }
    
    public void conectar() {
        System.out.println("Conectando a MySQL: " + url);
    }
    
    public void desconectar() {
        System.out.println("Desconectando de MySQL");
    }
    
    public void mostrarInfo() {
        System.out.println("Conexión: " + url + " - Usuario: " + usuario);
    }
}
