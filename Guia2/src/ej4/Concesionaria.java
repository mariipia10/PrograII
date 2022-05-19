package ej4;

import java.util.ArrayList;


public class Concesionaria {

    private String nombre;
    private ArrayList<Vehiculo> vehiculos;
    public Concesionaria(String nombre){
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public int getAutos(){
        return vehiculos.size();
    }
    public void agregarVehiculo(String patente,double precio,Enum tipo){
        if(buscarVehiculo(patente)==null){
             vehiculos.add(new Vehiculo(patente, precio, tipo));
        }
    }
    public void agregarVehiculo(Vehiculo vehi){
        if(buscarVehiculo(vehi.getPatente())==null){
             vehiculos.add(vehi);
        }
    }
    
    public Vehiculo buscarVehiculo(String patente) {
        int i = 0;
        Vehiculo vehiEncontrado = null;
        Vehiculo v;
        while (i < this.vehiculos.size() && vehiEncontrado == null) {
            v = this.vehiculos.get(i);
            if (v.getPatente().equals(patente)) {
                vehiEncontrado = v;
            } else {
                i++;
            }
        }
        System.out.println(vehiEncontrado);
        return vehiEncontrado;
    }
    public void cambiarVehiculo(Vehiculo vehi){
        
    }
    public void eliminarVehiculo(String patente){
        Vehiculo vehi = buscarVehiculo(patente);
        this.vehiculos.remove(vehi);
    }
    public void mostrarVehiculos(Enum tipo){
        for (Vehiculo vehiculo : vehiculos) {
            if(tipo==vehiculo.getTipo()){
                System.out.println("Patente:" + vehiculo.getPatente());
                System.out.println("Precio:" + vehiculo.getPrecio());
                
            }
        }
        // debe mostrar las patentes y precios de todos los vehículos segun su tipo
    }
    public void mostrarVehiculos(){
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Patente: " + vehiculo.getPatente()+" | Precio: " + vehiculo.getPrecio());
        }
        // debe mostrar las patentes y precios de todos los vehículos 
    }

    @Override
    public String toString() {
        return "Concesionaria{" + "nombre=" + nombre + ", vehiculos=" + vehiculos + '}';
    }
    
}
