/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej10;

import ej9.*;

/**
 *
 * @author piahe
 */
public class Domicilio {
    private String calle;
    private String altura;
    private String barrio;

    private void setCalle(String calle) {
        if(calle != null && calle.length() >= 3) {
           this.calle = calle; 
        }
    }

    private void setAltura(String altura) {
        if(altura != null && altura.length() >= 3) {
           this.altura = altura; 
        }
    }

    private void setBarrio(String barrio) {
        if(barrio != null && barrio.length() >= 3) {
           this.barrio = barrio; 
        }
    }

    @Override
    public String toString() {
        return "Domicilio{" + "calle=" + calle + ", altura=" + altura + ", barrio=" + barrio + '}';
    }

    public Domicilio(String calle, String altura, String barrio) {
        setCalle(calle);
        setAltura(altura);
        setBarrio(barrio);
    }
    
    
    
}
