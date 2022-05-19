package ej4;

public class Vehiculo {

    private String patente;
    private Double precio;
    private Enum tipo;
    public Vehiculo(String patente,double precio,Enum tipo){
        this.patente=patente;
        this.precio=precio;
        this.tipo = tipo;
    }

    public String getPatente() {
        return patente;
    }

    public Double getPrecio() {
        return precio;
    }

    public Enum getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
    
    

    
    
}
