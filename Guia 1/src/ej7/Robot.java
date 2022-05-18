/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7;

/**
 *
 * @author piahe
 */
public class Robot {
    private String nombreBot;

    public Robot(String nombreBot) {
        setNombreBot(nombreBot);
    }
    

    private void setNombreBot(String nombreBot) {
        if(nombreBot!=null && nombreBot.length()>=3){
            this.nombreBot = nombreBot;
        }   
    }
    public void saludar(){
        System.out.println("Hola, mi nombre es "+ nombreBot +". En que puedo ayudarte?\n");
    }
    public void saludar(String n){
        System.out.println("Hola "+ n +", mi nombre es "+ nombreBot +". En que puedo ayudarte?\n");
    }
    
    
    
}
