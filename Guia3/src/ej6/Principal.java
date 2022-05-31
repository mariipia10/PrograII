/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Taller t = new Taller();
        ArrayList<Bicicleta> bicicletas = new ArrayList();
        bicicletas.add(new Bicicleta("Marca1","Pepe"));
        bicicletas.add(new Bicicleta("Marca2","Pepe2",2500));
        bicicletas.add(new BicicletaElectrica("Marca1","Pepe"));
        bicicletas.add(new BicicletaElectrica("Marca1","Pepe",1000,300));
        
        int  n = t.cantServiciosPosibles(bicicletas);
        System.out.println("Se le hara service a " + n + " bicicleta/s");
        
        
        
        
        
//        t.agregarBici(new Bicicleta("Yamaha", "TodoTerreno"));
//        t.agregarBici(new BicicletaElectrica("Scott", "Mountain"));
//        t.agregarBici(new Bicicleta("Yamaho", "Snow",5000));
//        t.agregarBici(new BicicletaElectrica("Braun", "Track",900,250));
    }
    
}
