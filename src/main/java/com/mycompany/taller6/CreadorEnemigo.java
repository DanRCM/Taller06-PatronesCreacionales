/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller6;

/**
 *
 * @author CltControl
 */
public class CreadorEnemigo extends CreadorEntidad {
    @Override
    public Entidad crearEntidad(String nombre) {
        return new Enemigo(nombre);
    }

    @Override
    public void configurarAtributos(Entidad entidad) {
        // Configuración de atributos específicos para Enemigo
        Enemigo enemigo = (Enemigo) entidad;
        enemigo.setTipo("No muerto");
        enemigo.setPoder(30);
    }

    @Override
    public void configurarAcciones(Entidad entidad) {
        // Configuración de acciones específicas para Enemigo
        entidad.agregarAccion("Atacar");
        entidad.agregarAccion("Morir");
    }
}
