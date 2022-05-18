package ej2;

public class Propiedad {
    private String domicilio;
    private double precio;
    private Enum barrio;
    private Enum tipo;  
    
    public Propiedad(String domicilio, double precio, Enum barrio, Enum tipo) {
        this.domicilio = domicilio;
        this.precio = precio;
        this.barrio = barrio;
        this.tipo = tipo;
    }

    private void setDomicilio(String domicilio) {
        if(domicilio.length()>10){
            this.domicilio = domicilio;
        }
    }

    private void setPrecio(double precio) {
        if(precio>0){
            this.precio = precio;
        }
    }

    public String getDomicilio() {
        return domicilio;
    }

    public double getPrecio() {
        return precio;
    }

    public Enum getTipo() {
        return tipo;
    }
    
    @Override
    public String toString() {
        return "Propiedad{" + "domicilio=" + domicilio + ", precio=" + precio + ", barrio=" + barrio + ", tipo=" + tipo + '}';
    }
    
    
    
}
