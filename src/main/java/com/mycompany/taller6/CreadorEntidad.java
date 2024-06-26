/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller6;

/**
 *
 * @author CltControl
 */
public abstract class CreadorEntidad {
    public abstract Entidad crearEntidad(String nombre);
    public abstract void configurarAtributos(Entidad entidad);
    public abstract void configurarAcciones(Entidad entidad);
}