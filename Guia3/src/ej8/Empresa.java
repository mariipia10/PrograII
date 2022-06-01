package ej8;

import java.util.ArrayList;

public class Empresa {

    public Empresa() {
        this.personal = new ArrayList();
    }

    private ArrayList<Personal> personal;

    @Override
    public String toString() {
        return "Empresa{" + "personal=" + personal + '}';
    }
    
    public void agregarPersonal(Personal p){
        if(p!=null){
             this.personal.add(p);
        }
    }
    
    public void mostrarSalarios(){
        for (Personal personal1 : personal) {
              personal1.mostrarSalario();
        }
    }
    
    public Personal mejorVendedor(){
        PersonalComision p = null,pAux;
        int cont=0;
        for (Personal p1 : personal) {
            if(p1 instanceof PersonalComision){
                pAux=(PersonalComision)p1; //hago downcasting
                if(cont==0){ //tomo primer valor como max
                    p=pAux;
                    cont++;
                }else{
                    p = (pAux.getCantClientes()>p.getCantClientes())?pAux:p; //comparo para ver si hay un maximo que supere y cambio si es TRUE
                }
            }
        }
        return p;
    }
    
}
