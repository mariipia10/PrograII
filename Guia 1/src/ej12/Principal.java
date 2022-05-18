/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12;

/**
 *
 * @author piahe
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Documento docu = new Documento(new Fecha(10,2,2022), "Este es el cuerpo\nb la bla bla bla\nla bla bla bla\nla bla bla bla", "Gran titulo!!");
        ImpresoraMonocromatica impre = new ImpresoraMonocromatica();
        impre.encender();
        impre.recargarBandeja(35);
        System.out.println(impre);
        impre.imprimir(docu);
        System.out.println(impre);
    }
    
}
