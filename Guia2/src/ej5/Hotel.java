package ej5;

import ej4.Vehiculo;
import java.util.ArrayList;

public class Hotel {

    private String nombre;

    private String direc;

    private ArrayList<Habitacion> habitaciones;

    public Hotel(String nombre, String direc) {
        this.nombre = nombre;
        this.direc = direc;
        this.habitaciones = new ArrayList<>();
    }
    
    public void agregarHabitacion(String num,double precio){
        habitaciones.add(new Habitacion(num,precio));
    }
    public void ocuparHabitacion(String hab,int dias,String nombre){
        Habitacion h = buscarHabitacion(hab);
        h.ocuparHabitacion(dias, nombre);
    }
    public void agregarAdicional(String hab,Enum tipo,int dia,int mes,int anio){
        Habitacion h = buscarHabitacion(hab);
        h.agregarAdicional(tipo, dia, mes, anio);
        h.calcularTotal();
    }
    public Habitacion buscarHabitacion(String hab) {
        int i = 0;
        Habitacion habEncontrada = null;
        Habitacion h;
        while (i < this.habitaciones.size() && habEncontrada == null) {
            h = this.habitaciones.get(i);
            if (h.getNumero().equals(hab)) {
                habEncontrada = h;
            } else {
                i++;
            }
        }
        return habEncontrada;
    }
    
    
    @Override
    public String toString() {
        return "Hotel{" + "nombre=" + nombre + ", direc=" + direc + ", habitaciones=" + habitaciones + '}';
    }

    
}
