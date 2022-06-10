package ej9_bis;

import java.util.ArrayList;

public class Comercio {
    private ArrayList<Venta> ventas;

    public Comercio() {
        this.ventas = new ArrayList();
    }
   

    public void nuevaVenta(Venta v){
        if(v!=null){
            ventas.add(v);
        }
    }
    public double montoTotalFacturado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
