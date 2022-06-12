/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eje9;

/**
 *
 * @author Alumno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comercio c =  new Comercio();
        
        ServicioReparacion sr = new ServicioReparacion(TipoVenta.POST_VENTA,1,5);
        c.nuevoFacturable(new ServicioArmado(TipoVenta.PRE_VENTA,10));
        c.nuevoFacturable(new ServicioArmado(TipoVenta.PRE_VENTA,5));
        c.nuevoFacturable(new Insumo("PC",TipoInsumo.HARDWARE,10,100));
        c.nuevoFacturable(new Insumo("Liquido limp",TipoInsumo.LIMPIEZA,5,100));
        c.nuevoFacturable(new Insumo("Mouse",TipoInsumo.PERIFERICO,15,100));
        c.nuevoFacturable(new ServicioReparacion(TipoVenta.POST_VENTA,3,1));
        c.nuevoFacturable(new ServicioReparacion(TipoVenta.POST_VENTA,1,1));
        c.nuevoFacturable(new ServicioReparacion(TipoVenta.POST_VENTA,1,4));
        c.nuevoFacturable(sr);

            
        System.out.println("La cantidad de servicios simples es: " + c.cantServiciosSimples());
        System.out.println("El monto total factuado es : " + c.montoTotalFacturado());
        //System.out.println(sr.montoFacturado());
    }
    
}
