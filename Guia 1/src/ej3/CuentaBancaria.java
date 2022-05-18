/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

import java.util.Random;

/**
 *
 * @author piahe
 */
public class CuentaBancaria {

    private String CBU;
    private TipoCuenta tipo;
    private double saldo;

    public CuentaBancaria(TipoCuenta tipo) {
        this.CBU = generarAleatorio(22);
        this.tipo = tipo;
        this.saldo = 0.0;
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

    @Override
    public String toString() {
        return "CuentaBancaria{" + "CBU=" + CBU + ", tipo=" + tipo + ", saldo=" + saldo + '}';
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
    

}
