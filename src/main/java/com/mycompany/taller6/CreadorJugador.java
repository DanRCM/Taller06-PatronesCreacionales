/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller6;

/**
 *
 * @author CltControl
 */
public class CreadorJugador extends CreadorEntidad {
    @Override
    public Entidad crearEntidad(String nombre) {
        return new Jugador(nombre);
    }

    @Override
    public void configurarAtributos(Entidad entidad) {
        // Configuración de atributos específicos para Jugador
        Jugador jugador = (Jugador) entidad;
        jugador.setVida(100);
        jugador.setFuerza(50);
    }

    @Override
    public void configurarAcciones(Entidad entidad) {
        // Configuración de acciones específicas para Jugador
        entidad.agregarAccion("Atacar");
        entidad.agregarAccion("Moverse");
        entidad.agregarAccion("Descansar");
    }
}
