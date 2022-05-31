package ej6;

import java.util.ArrayList;

public class Taller {

    private ArrayList<Bicicleta> bicicletas;
    
    public Taller(){
        this.bicicletas = new ArrayList();
    }

    public void agregarBici(Bicicleta b){
        this.bicicletas.add(b);
    }
//    public void cantServiciosPosibles(ArrayList<Bicicleta> bicis) {
//        ArrayList<Bicicleta> bServicios = new ArrayList();
//        for (Bicicleta bici : bicis) {
//            System.out.println(bici.prestarServicio());
//        }
//    }
    public int cantServiciosPosibles(ArrayList<Bicicleta> bicis) {
        int n = 0;
        for (Bicicleta bici : bicis) {
            if(bici.prestarServicio()){
                n++;
            }
        }
        return n;
    }
}
