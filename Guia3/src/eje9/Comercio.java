package eje9;

//import ej9.Venta;
import java.util.ArrayList;

public class Comercio {

    private ArrayList<Facturable> historialFacturables;
    public Comercio() {
        historialFacturables = new ArrayList<>();
    }
    public void nuevoFacturable (Facturable f){
        if(f!=null){
            historialFacturables.add(f);
        }
    }
    public int cantServiciosSimples(){
        int cont=0;
        for (Facturable f : historialFacturables) {
            if (f instanceof ServicioReparacion){
                 ServicioReparacion sr = (ServicioReparacion) f;
                 if(sr.servicioSimple())cont++;
            }
        }
        return cont;
    }  
    
    public double montoTotalFacturado(){
       double acum = 0;
        for (Facturable f : historialFacturables) {
            acum+=f.montoFacturado();
        }
        return acum;
    }
}
