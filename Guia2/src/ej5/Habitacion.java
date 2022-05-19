package ej5;

import java.util.ArrayList;

public class Habitacion {

    private String numero;

    private double precio;

    private boolean ocupada;

    private String nombreHuesped;

    private int diasHospedaje;

    private ArrayList<Adicional> adicionales;

    public Habitacion(String numero, double precio) {
        this.numero = numero;
        this.precio = precio;
        this.adicionales = new ArrayList<>();
    }
    
    public void ocuparHabitacion(int dias,String nombre){
        this.ocupada=true;
        this.nombreHuesped = nombre;
        this.diasHospedaje = dias;
    }
    public void agregarAdicional(Enum tipo,int dia,int mes,int anio){
        this.adicionales.add(new Adicional(tipo, dia, mes, anio));
    }
    
    public void calcularTotal(){
        double total = precio*diasHospedaje;
        for (Adicional adicional : adicionales) {
            //total+=adicional.getTipo().getPrecio() // NO FUNCIONA aa
        }
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "numero=" + numero + ", precio=" + precio + ", ocupada=" + ocupada + ", nombreHuesped=" + nombreHuesped + ", diasHospedaje=" + diasHospedaje + ", adicionales=" + adicionales + '}';
    }

}
