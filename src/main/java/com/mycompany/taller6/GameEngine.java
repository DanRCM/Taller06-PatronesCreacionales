/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller6;

/**
 *
 * @author STEVEN
 */
public class GameEngine {
    private static GameConfig gameConfiguration;
    public static GameConfig getConfiguration(){
        return gameConfiguration;
    }
    
    public Entidad createEntidad(String type){
        Builder builder;
        Director director=new Director();
        Entidad entidad = null;
        switch (type){
            case "Player":
                builder=new PlayerBuilder();
                director.makeEntity(builder, entidad.getAcciones(), entidad);
                entidad=((PlayerBuilder)builder).getJugador();
                break;
            case "Enemy":
                builder=new EnemyBuilder();
                director.makeEntity(builder, entidad.getAcciones(), entidad);
                entidad=((EnemyBuilder)builder).getEnemigo();
                break;
            case "Object":
                builder=new ObjectBuilder();
                director.makeEntity(builder, entidad.getAcciones(), entidad);
                entidad=((ObjectBuilder)builder).getObjeto();
            default:
                throw new IllegalArgumentException("tipo de entidad desconocida");
        }
        return entidad;
    }
}
