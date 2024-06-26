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

public interface Entidad {
    void agregarAccion(String accion);
    void dibujar();
    void actualizar(int numero);
    String getNombre();
    List<String> getAcciones();
}


