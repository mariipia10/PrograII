package ej3;

import ej2.Propiedad;
import java.util.ArrayList;


public class Alumno {

    private String nombre;

    private String DNI;

    private ArrayList<Evaluacion> evaluaciones;

    public Alumno(String nom,String DNI,Enum Tipo,int valor) {
        this.evaluaciones = new ArrayList<>();
        this.nombre = nom;
        this.DNI = DNI;
        this.evaluaciones.add(new Evaluacion(valor, Tipo));
    }
    public Alumno(String nom,String DNI) {
        this.evaluaciones = new ArrayList<>();
        this.nombre = nom;
        this.DNI = DNI;
    }
    public void agregarEvaluacion(Enum Tipo,int valor){
        evaluaciones.add(new Evaluacion(valor, Tipo));
    }
    
    public int calcularPromedio() {
        int prom=0,cont=0;
        for (Evaluacion eval : evaluaciones) {
            prom += eval.getNota();
            cont++;
        }
        return prom/cont;
    }

    public String getDNI() {
        return DNI;
    }

    public Evaluacion buscarNota(Enum tipo) {
        int i = 0;
        Evaluacion evalEncontrada = null;
        Evaluacion e;
        while (i < this.evaluaciones.size() && evalEncontrada == null) {
            e = this.evaluaciones.get(i);
            if (e.getTipo()==tipo) {
                evalEncontrada = e;
            } else {
                i++;
            }
        }
        return evalEncontrada;
    }
    
    public int cantEval(){
        return evaluaciones.size();
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", DNI=" + DNI + ", evaluaciones=" + evaluaciones + '}';
    }
    
}
