package eje9;

public abstract class Servicio implements Facturable {

    private TipoVenta tipo;
    private int horas;
    private int valorHora;

    public Servicio( TipoVenta tipo, int horas, int valorHora) {
        this.tipo = tipo;
        this.horas = horas;
        this.valorHora = valorHora;
    }
    public double getPrecio() {
        return horas * valorHora;
    }
    
    
}
