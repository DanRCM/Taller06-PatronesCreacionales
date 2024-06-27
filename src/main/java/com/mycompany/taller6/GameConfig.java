/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller6;

/**
 *
 * @author fabri
 */
public class GameConfig {
    private static GameConfig instance;

    private int screenWidth;
    private int screenHeight;
    private int minRamRequired;
    private int minDiskSpaceRequired;

    // Constructor privado para evitar instanciación directa
    private GameConfig() {
        // Configuración inicial por defecto
        this.screenWidth = 1920;
        this.screenHeight = 1080;
        this.minRamRequired = 4096; // Ejemplo: 4 GB de RAM
        this.minDiskSpaceRequired = 2048; // Ejemplo: 2 GB de espacio en disco
    }

    // Método estático para obtener la instancia única del Singleton
    public static synchronized GameConfig getInstance() {
        if (instance == null) {
            instance = new GameConfig();
        }
        return instance;
    }

    // Métodos para acceder y modificar la configuración
    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }

    public int getMinRamRequired() {
        return minRamRequired;
    }

    public void setMinRamRequired(int minRamRequired) {
        this.minRamRequired = minRamRequired;
    }

    public int getMinDiskSpaceRequired() {
        return minDiskSpaceRequired;
    }

    public void setMinDiskSpaceRequired(int minDiskSpaceRequired) {
        this.minDiskSpaceRequired = minDiskSpaceRequired;
    }
}