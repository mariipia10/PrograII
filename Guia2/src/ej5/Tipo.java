package ej5;

public enum Tipo {
    
    DESAYUNO(100), 
    ROOM_SERVICE(150), 
    TRASLADO(50);
    
    private double precio;

    private Tipo(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }

    
    
}
