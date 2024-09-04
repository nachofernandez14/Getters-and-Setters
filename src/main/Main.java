/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author elian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Ignacio", 20);
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Edad " + p1.getEdad());
        
        p1.setNombre("Nahuel");
        System.out.println("Nombre: " + p1.getNombre());
        p1.setEdad(25);
        System.out.println("Edad " + p1.getEdad());
    }
    
}
