/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4;

/**
 *
 * @author piahe
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha f1 = new Fecha(25, 12, 2009);
        System.out.println(f1.getFecha());
        System.out.println(f1.esNavidad());
        f1.sumarMes();
        System.out.println(f1.getFecha());
        f1.sumarMes();
        System.out.println(f1.getFecha());

    }

}
