/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9;

/**
 *
 * @author piahe
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Maria", "Marta", new Fecha(10, 2, 1999), new Domicilio("Av Las Heras", "3448", "Recoleta"));
        System.out.println(p1);
    }
    
}
