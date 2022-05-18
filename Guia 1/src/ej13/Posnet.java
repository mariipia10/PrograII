package ej13;


public class Posnet {

    public float montoReal(float monto,int cuotas){
        float f;
        if(cuotas==1){
            f = monto;
        }else{
            cuotas--;
            f= (monto+=monto*(cuotas*0.03));
        }
        return f;
    }
    
    public Ticket efectuarPago(TarjetaCredito tc,float monto, int cuotas) {
        Ticket t = null;
        float montoReal = montoReal(monto,cuotas);
        if(tc.saldoSuficiente(montoReal)){
            tc.restar(montoReal);
            t = new Ticket(tc.getTitular(), monto, montoReal);
        }
        return t;
    }
}
