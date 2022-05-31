/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7;

/**
 *
 * @author Alumno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GrupoDeFiguras gf = new GrupoDeFiguras();
        gf.agregarFig(new Rectangulo(2,4,"Azul"));
        gf.agregarFig(new Circunferencia(3, "Lila"));
        gf.agregarFig(new TrianguloEquilatero(5, 2, "Rojo"));
        gf.mostrarInfoDeFiguras();
    }
    
}
