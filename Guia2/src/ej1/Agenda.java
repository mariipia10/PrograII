package ej1;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Persona> personas;
    
    public Agenda() {
        this.personas = new ArrayList<>();//SIEMPRE inicializo ArrayList donde lo este utilizando
    } 
            

    public void listarPersonas() {
        // Con FOR
//        for (int i = 0; i < personas.size(); i++) {
//            Persona p = personas.get(i);
//            System.out.println(p);   
//        }
        // Con FOREACH
        for (Persona p : this.personas) {//Por cada variable p de tipo persona en la lista de personas
            System.out.println(p);
        }          
    }

    public Persona devolverUltimo() {
        Persona p = null;
        if ( !personas.isEmpty() ) {
            p = personas.get(personas.size() - 1);//Size menos uno porque arraylist empieza a contar desde cero 
        }
        return p;
    }

    public Persona buscarPersona(String DNI) {
        int i = 0;
        Persona pEncontrada = null;
        Persona p;
        while (i < this.personas.size() && pEncontrada == null) {
            p = this.personas.get(i);
            if (p.getDNI().equals(DNI)) {
                pEncontrada = p;
            } else {
                i++;
            }
        }
        return pEncontrada;
    }

    public boolean agregarPersona(String DNI, String nom, String ape, Domicilio dom) {
        boolean sePuedeAgregar = buscarPersona(DNI) == null;
        if (sePuedeAgregar){
            this.personas.add(new Persona(DNI, nom, ape, dom)); //Agrega persona al final del ArrayList
        }
        return sePuedeAgregar;
        
    }

    public Persona removerPersona(String DNI) {
        Persona p = buscarPersona(DNI);
        this.personas.remove(p); //Si existe lo remueve, sino null remueve un null o no pasa nada
        return p;
    }

    public boolean modificarDomicilio(String DNI, Domicilio dom) {
        Persona p = buscarPersona(DNI);
        boolean sePuede = p != null;
        
        if ( sePuede ) {
            p.setDomicilio(dom);
        }
        
        return sePuede;        
    }

    public void eliminarTodosLosElementosAMano() {
        while(!personas.isEmpty()) {
            personas.remove(0);//Va a remover siempre la primera
                               //Mientras ArrayList reacomoda la eliminada y mueve los nodos de derecha a izquierda
                               //Osea el que era el 2do nodo pasa a ser el primero
        }
    }
    
    public int cantPersonas () {
        return personas.size();//Metodo exclusivo de ArrayList,devuelve cantidad de personas en Array
    }

    public ArrayList<Persona> getPersonas() {
        return personas; //Devuelve un string eterno en forma de ArrayList de las personas
    }
    
    
}