/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10;

/**
 *
 * @author piahe
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("CC",new Persona("Papa","Natas",new Fecha(10,2,1800),new Domicilio("Pueyrredon","1234","Recoleta")));
        System.out.println(cuenta1);
        cuenta1.depositar(5000);
        cuenta1.extraer(2000);
        System.out.println(cuenta1);
    }
    
}
