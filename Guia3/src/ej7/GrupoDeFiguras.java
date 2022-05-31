package ej7;

import java.util.ArrayList;

public class GrupoDeFiguras {

    private ArrayList<Figura> figuras;

    public GrupoDeFiguras() {
        this.figuras = new ArrayList();
    }
    
    public void agregarFig(Figura f){
        this.figuras.add(f);
    }
    

    public void mostrarInfoDeFiguras() {
        for (Figura figura : figuras) {
            System.out.println(figura.toString());
        }
    }
}
