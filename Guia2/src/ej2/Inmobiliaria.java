package ej2;
import ej1.Domicilio;
import ej1.Persona;
import java.util.ArrayList;
import java.util.Iterator;

public class Inmobiliaria {

    private ArrayList<Propiedad> propiedades;
    
    public Inmobiliaria() {
        this.propiedades = new ArrayList<>();
    } 
    public boolean agregarPropiedad(String domicilio,double precio,Enum barrio,Enum tipo) {
        boolean sePuedeAgregar = buscarPropiedad(domicilio) == null;
        if (sePuedeAgregar){
            this.propiedades.add(new Propiedad(domicilio, precio, barrio, tipo)); //Agrega persona al final del ArrayList
        }
        return sePuedeAgregar;
        
    }
    public Propiedad buscarPropiedad(String dom) {
        int i = 0;
        Propiedad pEncontrada = null;
        Propiedad p;
        while (i < this.propiedades.size() && pEncontrada == null) {
            p = this.propiedades.get(i);
            if (p.getDomicilio().equals(dom)) {
                pEncontrada = p;
            } else {
                i++;
            }
        }
        return pEncontrada;
    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }
    
    public double promedioDePrecio() {
        double prom=0;
        int cont=0;
        for (Propiedad prop : propiedades) {
            prom+=prop.getPrecio();
            cont++;
        }
        return prom/(double)cont;
    }
    
    // debe  devolver  una  lista  de propiedades
    //cuyo  precio  esté  por  debajo  del  promedio general.
    public ArrayList propiedadesMasEconomicas() {
        ArrayList propBaratas =new ArrayList<>();
        for (Propiedad prop : propiedades) {
            if(prop.getPrecio()< promedioDePrecio()){
                propBaratas.add(prop);
            }
        }
        return propBaratas;
    }

    public int cantidadDePropiedadesSegunTipo(TipoPropiedad tipo) {
        int cont =0;
        for (Propiedad prop : propiedades) {
            if(prop.getTipo()==tipo){
                cont++;
            }
        }
        return cont;
    }
}
