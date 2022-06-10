package ej9;

public class Insumo implements Facturable {

    private String nombre;
    private TipoInsumo tipo;
    private double porcentajeGanancia;
    private double precioLista;

    @Override
    public double montoTotalFacturado() {
        double monto =  Matematica.sumarPorcentaje(precioLista, porcentajeGanancia);
        monto = Matematica.sumarPorcentaje(monto, porcentajeGanancia)
        return;
    }

    public Insumo(String nombre, TipoInsumo tipo, double porcentajeGanancia, double precioLista) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.porcentajeGanancia = porcentajeGanancia;
        this.precioLista = precioLista;
    }
    
}
