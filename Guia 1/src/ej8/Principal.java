/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej8;

import java.nio.charset.Charset;
import java.util.Random;

/**
 *
 * @author piahe
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Password pass = new Password("12345678910");
        //System.out.println(pass);
        System.out.println(pass.esFuerte()); //true Password{pass=12345678910}
        System.out.println(pass.nuevoValor("1234567")); //true Password{pass=1234567}
        System.out.println(pass.nuevoValor("12345")); //false Password{pass=1234567}
        
       
    }
    
}
