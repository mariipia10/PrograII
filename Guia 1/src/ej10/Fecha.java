/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej10;

import ej9.*;
import ej4.*;

/**
 *
 * @author piahe
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
         setDia(dia);
         setMes(mes);
         setAnio(anio);
    }

    public int getAnio() {
        return anio;
    }
    
    private void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        }
    }

    private void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        }
    }

    private void setAnio(int anio) {
        if (anio >= 0 && anio <= 2022) {
            this.anio = anio;
        }
    }
    
    private String getFecha(){
        String d,m,a;
        if(getDigits(dia)==1){
            d = "0"+dia;
        }else{
            d= ""+dia;
        }
        if(getDigits(mes)==1){
            m = "0"+mes;
        }else{
            m=""+mes;
        }
         a = switch (getDigits(anio)) {
            case 1 -> "000"+anio;
            case 2 -> "00"+anio;
            case 3 -> "0"+anio;
            default -> ""+anio;
        };
         
        return d+"/"+m+"/"+a;
    }
    public int getDigits(int n){
        return String.valueOf(n).length();
    }
    public boolean esNavidad(){
        return dia==25 && mes ==12;
    }
    public void sumarMes(){
        if(mes==12){
            setMes(1);
        }else{
            mes++;
        }
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }

}
