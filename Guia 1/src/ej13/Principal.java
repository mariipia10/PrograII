/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej13;

/**
 *
 * @author piahe
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Titular t1 = new Titular("Luisa", "Oro", new Fecha(2,3,1983), new Domicilio("Avenida Rivadavia", "2058", "Caballito"));
        TarjetaCredito TC1 = new TarjetaCredito("BBVA", EntidadFinanciera.VISA, t1);
        System.out.println(TC1);
        Posnet pos = new Posnet();
        System.out.println(pos.efectuarPago(TC1,10000,5)); //Ticket{nomApe=Luisa Oro, montoTotal=10000.0, montoCuotas=11200.0}
    }
    
}
