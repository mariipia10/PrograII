package ej9_bis;

public abstract class Servicio extends Venta {

    private double precio;
    private TipoVenta tipo;
    private int horas;
    private int valorHora;

    public Servicio(TipoVenta tipo, int horas, int valorHora) {
        this.precio = horas*valorHora;
        this.tipo = tipo;
        this.horas = horas;
        this.valorHora = valorHora;
    }
    public void actualizarPrecio(double newPrecio){
        this.precio = newPrecio;
    }
    public abstract double getPrecio();
    
    public double montoFacturado(){
        
        
    }
    
    
}
