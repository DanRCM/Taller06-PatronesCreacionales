/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller6;

import java.util.List;
import java.lang.String;

/**
 *
 * @author STEVEN
 */
public class Director {
    public void makeEntity(Builder builder,List<String> actionsList,Entidad entidad){
        builder.defineActions(actionsList);
        builder.addSprites();
        builder.configureEntity(entidad);
    }
}
