package ej13;

import java.util.Random;

public class TarjetaCredito {
    private final static int MAX_CREDITO = 15000; 
    private String nombreBanco;
    private String numero;
    private float saldo;
    private EntidadFinanciera entidadFinanciera;
    private Titular titular;

    public TarjetaCredito(String nombreBanco, EntidadFinanciera enti, Titular titular) {
        this.nombreBanco = nombreBanco;
        this.entidadFinanciera = enti;
        this.titular = titular;
        saldo = MAX_CREDITO;
        this.numero = generarAleatorio(20);        
    }
    
    
    public boolean saldoSuficiente(float monto){
       return saldo>=monto;
    }

    public String getTitular() {
        return titular.nombreCompleto();
    }
    public void restar(float monto){
        saldo-=monto;
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
        return "TarjetaCredito{" + "nombreBanco=" + nombreBanco + ", numero=" + numero + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }
    
    
}
