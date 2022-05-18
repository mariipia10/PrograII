/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8;

import java.util.Random;


/**
 *
 * @author piahe
 */
public class Password {
    private String pass;

    public Password(String pass) {
        setPass(pass);
    }
     public Password() {
        this.pass = generarAleatorio(8);
    }

    private void setPass(String pass) {
        if(pass!=null && pass.length()>6){
             this.pass = pass;
        }
       
    }
    public boolean esFuerte(){
        return pass.length()>=8;
    }
    public boolean nuevoValor(String nuevaPass){
        setPass(nuevaPass);
        return nuevaPass.length()>=6;
    }
    public String generarAleatorio(int largoPass){
        if (largoPass < 6) {
            return null;
        } else {
            int leftLimit = 97; //  'a'
            int rightLimit = 122; // 'z'
            Random random = new Random();
            StringBuilder buffer = new StringBuilder(largoPass);
            for (int i = 0; i < largoPass; i++) {
                int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
                buffer.append((char) randomLimitedInt);
            }
            return buffer.toString();
        }
    }

//    @Override
//    public String toString() {
//        return "Password{" + "pass=" + pass + '}';
//    }
    
    
    
    
}
