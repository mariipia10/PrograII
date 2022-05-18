/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;

/**
 *
 * @author piahe
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emple = new Empleado(42101104, "Pepe", "Mcpepe", 10000.0, "soltero", 3);
        System.out.println(emple);
        System.out.println(emple.obtenerSalarioFinal());
    }

}
