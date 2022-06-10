package ej9_bis;

public class Insumo extends Venta {

    private String nombre;
    private TipoInsumo tipo;
    private double porcentajeGanancia;
    private double precioLista;

    public Insumo(String nombre, TipoInsumo tipo, double porcentajeGanancia, double precioLista) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.porcentajeGanancia = porcentajeGanancia;
        this.precioLista = precioLista;
    }
    
    public double montoFacturado(){
        return  Matematica.sumarPorcentaje(precioLista, porcentajeGanancia);
                //Puedo utilizar sumarPorcentaje porque es una funcion ABSTRACTA
                //Por ende no tengo que instanciar un objeto mate :D
    }
    
    
}
