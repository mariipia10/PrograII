package ej9;

public abstract class Servicio implements Facturable {

    private double precio;
    private TipoVenta tipo;
    private int horas;
    private int valorHora;

    public Servicio(double precio, TipoVenta tipo, int horas, int valorHora) {
        this.precio = precio;
        this.tipo = tipo;
        this.horas = horas;
        this.valorHora = valorHora;
    }
    public double getPrecio(){
        return this.precio;
    };
    public double montoTotalFacturado() {
        return Matematica.sumarPorcentaje(precio, 21/2);
    }
}
