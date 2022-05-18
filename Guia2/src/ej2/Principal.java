/*
 * 
 * 
 */
package ej2;

/**
 *
 * @author piahe
 */
public class Principal {

    public static void main(String[] args) {
        Inmobiliaria i = new Inmobiliaria();
        i.agregarPropiedad("Salguero 4560", 80000, Barrio.RECOLETA, TipoPropiedad.PH);
        i.agregarPropiedad("Scalabrini Ortiz 1750",100000, Barrio.PALERMO, TipoPropiedad.PH);
        i.agregarPropiedad("Luis Ma.Campos 3700", 180000, Barrio.BELGRANO, TipoPropiedad.CASA);
        //System.out.println(i.getPropiedades());
        System.out.println(i.promedioDePrecio());
        System.out.println(i.propiedadesMasEconomicas());
        System.out.println(i.cantidadDePropiedadesSegunTipo(TipoPropiedad.PH));
        
    }
    
}
