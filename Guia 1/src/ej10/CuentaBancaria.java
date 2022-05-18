/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej10;

import ej3.*;
import java.util.Random;
import java.time.LocalDate;

/**
 *
 * @author piahe
 */
public class CuentaBancaria {

    private String CBU;
    private TipoCuenta tipo;
    private double saldo;
    private Persona titular;
    private Fecha fechaApertura;
    private static final int diaAct = LocalDate.now().getDayOfMonth();
    private static final int mesAct = LocalDate.now().getMonthValue();
    private static final int anioAct = LocalDate.now().getYear();
    
    
    
    public CuentaBancaria(String tipo, Persona titular) {
        setTipo(tipo.toUpperCase());
        this.titular = titular;
        this.CBU = generarAleatorio(22);
        this.saldo = 0.0;
        this.titular = titular;
        this.fechaApertura = new Fecha(diaAct,mesAct,anioAct);
    }

    public void setTipo(String tipo) {
        if ("CC".equals(tipo)) {
            this.tipo = TipoCuenta.CUENTA_CORRIENTE;
        } else if ("CA".equals(tipo)) {
            this.tipo = TipoCuenta.CAJA_DE_AHORRO;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double deposito) {
        if (deposito > 0.0) {
            this.saldo += deposito;
        }
    }
    public void extraer( double extraccion){
        if(extraccion>this.saldo){
            if(this.tipo==TipoCuenta.CUENTA_CORRIENTE){
                this.saldo-=extraccion;
            }
        }else{
            this.saldo-=extraccion;
        }
    }
    public String ultimosDigitos(){
        return this.CBU.substring(this.CBU.length() - 3);
    }
    private String generarAleatorio(int largo){
        if (largo < 6) {
            return null;
        } else {
            int leftLimit = 48; //  '0'
            int rightLimit = 57; // '9'
            Random random = new Random();
            StringBuilder buffer = new StringBuilder(largo);
            for (int i = 0; i < largo; i++) {
                int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
                buffer.append((char) randomLimitedInt);
            }
            return buffer.toString();
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "CBU=" + CBU + ", tipo=" + tipo + ", saldo=" + saldo + ", titular=" + titular + ", fechaApertura=" + fechaApertura + '}';
    }

    
    

}
