/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller6;

/**
 *
 * @author CltControl
 */
public class Game {
    Entidad entidad;
    public static void main(String[] args) {
        // Obtener la instancia única de GameConfig
        GameConfig config = GameConfig.getInstance();

        // Acceder y modificar la configuración
        System.out.println("Dimensiones de pantalla inicial: " + config.getScreenWidth() + "x" + config.getScreenHeight());
        System.out.println("RAM mínima requerida inicial: " + config.getMinRamRequired() + " MB");
        System.out.println("Espacio en disco mínimo requerido inicial: " + config.getMinDiskSpaceRequired() + " MB");

        // Modificar la configuración según necesidad
        

        // Mostrar la configuración actualizada
        System.out.println("Dimensiones de pantalla actualizadas: " + config.getScreenWidth() + "x" + config.getScreenHeight());
        System.out.println("RAM mínima requerida actualizada: " + config.getMinRamRequired() + " MB");
        System.out.println("Espacio en disco mínimo requerido actualizado: " + config.getMinDiskSpaceRequired() + " MB");
    }
    
    public void configureEntity(){
        GameConfig config = GameConfig.getInstance();
        config.setScreenWidth(2560);
        config.setScreenHeight(1440);
        config.setMinRamRequired(8192); // Ajustar a 8 GB de RAM
        config.setMinDiskSpaceRequired(4096); // Ajustar a 4 GB de espacio en disco
        
        GameEngine gameEngine =new GameEngine();
        entidad = gameEngine.createEntidad("Jugador");
    }
    
    public void runEntity(){
        int vida=5; //ejemplo 5 vidas
        if(entidad!=null){
            entidad.dibujar();
            entidad.actualizar(vida);
            
        }
    }
}
