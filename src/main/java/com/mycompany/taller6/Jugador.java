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

public class Jugador implements Entidad {
    private String nombre;
    private int vida;
    private int fuerza;
    private List<String> acciones;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    @Override
    public void agregarAccion(String accion) {
        acciones.add(accion);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando jugador: " + nombre + " con vida " + vida + " y fuerza " + fuerza);
    }

    @Override
    public void actualizar(int numero) {
        System.out.println("Actualizando estado del jugador: " + nombre);
        vida -= numero; 
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public List<String> getAcciones() {
        return acciones;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    
        public String jugadorMoverse(String str){
        return "El jugador " + nombre + " se ha movido hacia " + str + "."; 
    }
    
    public String jugadorAtacar(String str){
        return "El jugador " + nombre + " ha atacado hacia " + str + " con " + fuerza + " de fuerza"; 
    }
    
    public String jugadorDescansar(String str){
        return "El jugador " + nombre + " ha descansado, " + nombre + " recuperado 5 puntos de vida"; 
    }
}
