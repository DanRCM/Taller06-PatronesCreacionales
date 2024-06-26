/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller6;

/**
 *
 * @author CltControl
 */
public class CreadorObjeto extends CreadorEntidad {
    @Override
    public Entidad crearEntidad(String nombre) {
        return new Objeto(nombre);
    }

    @Override
    public void configurarAtributos(Entidad entidad) {
        // Configuración de atributos específicos para Objeto
        Objeto objeto = (Objeto) entidad;
        objeto.setPeso(5);
        objeto.setTipo("Arma");
    }

    @Override
    public void configurarAcciones(Entidad entidad) {
        // Configuración de acciones específicas para Objeto
        entidad.agregarAccion("Recoger");
        entidad.agregarAccion("Destruir");
    }
}
