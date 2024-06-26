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

public class Objeto implements Entidad {
    private String nombre;
    private int peso;
    private String tipo;
    private List<String> acciones;
    
    public Objeto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void agregarAccion(String accion) {
        acciones.add(accion);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando objeto: " + nombre + " de tipo " + tipo + " con peso " + peso);
    }

    @Override
    public void actualizar(int numero) {
        System.out.println("Actualizando estado del objeto: " + nombre);
        this.peso -= numero;
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public String objetoRecoger(){
        return "El jugador ha recogido el objeto" + nombre + ".";
    }
    
    public String objetoDestruir(){
        return "El jugador ha destruido el objeto" + nombre + ".";        
    }
}
