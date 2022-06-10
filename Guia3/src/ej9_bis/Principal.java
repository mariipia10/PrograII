/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9_bis;

/**
 *
 * @author Alumno
 */
public class Principal {
    public static void main(String[] args) {
        Comercio c = new Comercio();
        c.nuevaVenta(new ServicioArmado());
        c.nuevaVenta(new ServicioReparacion());
        c.nuevaVenta(new Insumo());
    }
    
}
