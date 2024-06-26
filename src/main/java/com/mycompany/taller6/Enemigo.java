/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller6;

/**
 *
 * @author CltControl
 */
import java.util.List;

public class Enemigo implements Entidad {
    private String nombre;
    private String tipo;
    private int poder;
    private List<String> acciones;

    public Enemigo(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void dibujar() {
        System.out.println("Dibujando enemigo: " + nombre + " de tipo " + tipo + " con poder " + poder);
    }

    @Override
    public void actualizar(int poder) {
        System.out.println("Actualizando estado del enemigo: " + nombre);
        this.poder -= poder;
    }
    
    @Override
    public void agregarAccion(String accion) {
        acciones.add(accion);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public List<String> getAcciones() {
        return acciones;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
    
    public String enemigoAtacar(String str){
        return "El enemigo " + nombre + " ha atacado al jugador con " + poder + " de fuerza"; 
    }
    
    public String jugadorMorir(String str){
        return "El enemigo ha muerto"; 
    }
}



