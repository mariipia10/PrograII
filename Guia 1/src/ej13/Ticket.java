/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

/**
 *
 * @author piahe
 */
public class Ticket {
    private String nomApe;
    private float montoTotal;
    private float montoCuotas;

    public Ticket(String nomApe, float montoTotal, float montoCuotas) {
        this.nomApe = nomApe;
        this.montoTotal = montoTotal;
        this.montoCuotas = montoCuotas;
    }

    @Override
    public String toString() {
        return "Ticket{" + "nomApe=" + nomApe + ", montoTotal=" + montoTotal + ", montoCuotas=" + montoCuotas + '}';
    }
    
    
}
