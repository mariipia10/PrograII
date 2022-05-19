package ej4;

import java.util.ArrayList;


public class Marca {

    private ArrayList<Concesionaria> consecionarias;
    public Marca(){
        this.consecionarias = new ArrayList<>();
    }
    public void agregarConsecionaria(String nombreConse){
        consecionarias.add(new Concesionaria(nombreConse));
    }
    public Concesionaria buscarConse(String nombre) {
        int i = 0;
        Concesionaria conseEncontrada = null;
        Concesionaria a;
        while (i < this.consecionarias.size() && conseEncontrada == null) {
            a = this.consecionarias.get(i);
            if (a.getNombre().equals(nombre)) {
                conseEncontrada = a;
            } else {
                i++;
            }
        }
        return conseEncontrada;
    }
    
    public void agregarAuto(String nombreConse,String patente,double precio,Enum tipo){
        Concesionaria conse = buscarConse(nombreConse);
        if(conse!=null){
            conse.agregarVehiculo(patente, precio, tipo);
        }
        
    }
    public void mostrarVehiculo(){
        for (Concesionaria consecionaria : consecionarias) {
            consecionaria.mostrarVehiculos();
        }
    }
    
    public void mostrarVehiculo(String conse,Enum tipo){
        Concesionaria con = buscarConse(conse);
        con.mostrarVehiculos(tipo);
    
    }
    public ArrayList obtenerConcesionariaMaxVeh(){ //devuelva una lista de la o las concesionarias con la mayor cantidad de vehículos a la venta.
        ArrayList<Concesionaria> conce = new ArrayList<>();
        int max=0;
        int n = consecionarias.size();
        for (int i = 0; i < n; i++) { //busco maximo
            int nuevoValor = consecionarias.get(i).getAutos();
            max = max>nuevoValor?max:nuevoValor;
        }
        for (Concesionaria consecionaria : consecionarias) {
            if(consecionaria.getAutos()==max){ //agrego las que tengan ese maximo
                conce.add(consecionaria);
            }
        }
        return conce;
    }
    public void borrarVehiculo(String patente){
        for (Concesionaria consecionaria : consecionarias) {
            consecionaria.eliminarVehiculo(patente);
        }
    }
    public void cambiarVehiculoDeConcesionaria(String patente,String conce){ // NO FUNCIONA, pedir ayuda
        Concesionaria con = buscarConse(conce);
        Object o = con.buscarVehiculo(patente);
        System.out.println(o);
        con.agregarVehiculo(con.buscarVehiculo(patente));
        borrarVehiculo(patente);
    }

    @Override
    public String toString() {
        return "Marca{" + "consecionarias=" + consecionarias + '}';
    }
    
           
    
}

