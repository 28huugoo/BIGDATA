/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author FP
 */
public class Aventura {
    
    //Base de datos de personajes public static ArrayList<Personaje> basePersonajes = new ArrayList<>()
    public static ArrayList<Personaje> basePersonajes = new ArrayList<>();
    
    public void mostrarPersonaje(){
        System.out.println("Nombre: "+basePersonajes.get(0).Nombre);
        System.out.println("  Fuerza: "+basePersonajes.get(0).fuerza);
        System.out.println("  Destreza: "+basePersonajes.get(0).destreza);
    }
    
    
}
