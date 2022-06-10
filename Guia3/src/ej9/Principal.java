
package ej9;

/**
 *
 * @author piahe
 */
public class Principal {

    public static void main(String[] args) {
        Comercio c = new Comercio();
        c.nuevaVenta(new ServicioArmado());
        c.nuevaVenta(new ServicioReparacion());
        c.nuevaVenta(new Insumo());
    }
    
}
