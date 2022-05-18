/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;

/**
 *
 * @author piahe
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria(TipoCuenta.CAJA_DE_AHORRO); //CA-> caja de ahorro, CC -> Cuenta corriente
        cuenta1.depositar(100020.5);
        System.out.println(cuenta1);
        System.out.println("");
        cuenta1.depositar(100.0);
        System.out.println(cuenta1.getSaldo());
        System.out.println("");
        cuenta1.extraer(100.0);
        System.out.println(cuenta1.getSaldo());
        System.out.println("");
        System.out.println(cuenta1.ultimosDigitos());
    }
    
}
