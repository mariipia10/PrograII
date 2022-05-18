package ej3;

import ej2.Propiedad;
import java.util.ArrayList;


public class Curso {

    private String codigo;

    private String titulo;

    private int duracion;

    private ArrayList<Alumno> alumnos;
    public Curso(String codigo,String titulo,int duracion){
        this.alumnos = new ArrayList<>();
        this.codigo=codigo;
        this.titulo = titulo;
        this.duracion=duracion;
    }
    
    public Alumno buscarAlum(String DNI) {
        int i = 0;
        Alumno alumEncontrado = null;
        Alumno a;
        while (i < this.alumnos.size() && alumEncontrado == null) {
            a = this.alumnos.get(i);
            if (a.getDNI().equals(DNI)) {
                alumEncontrado = a;
            } else {
                i++;
            }
        }
        return alumEncontrado;
    }
    
    public boolean agregarAlum(String nombre,String dni,Enum Tipo,int nota) {
        boolean sePuedeAgregar = buscarAlum(dni) == null;
        if (sePuedeAgregar){
            this.alumnos.add(new Alumno(nombre, dni, Tipo, nota)); //Agrega persona al final del ArrayList
        }
        return sePuedeAgregar;
        
    }

    public boolean agregarNota(Enum tipo,int valor,String DNI){
        boolean notaAgregada = false;
        Alumno a = buscarAlum(DNI);
        Evaluacion eval = a.buscarNota(tipo);
        if(a!=null && eval==null){
            a.agregarEvaluacion(tipo, valor);
            notaAgregada=true;
        }
        return notaAgregada;
    }
    
    public ArrayList buscarAlumnosPorEncimaDe(int promedio) {
        ArrayList<Alumno> alu = new ArrayList<>();
        for (Alumno alumno : alumnos){
            if(alumno.cantEval()>=2 && alumno.calcularPromedio()>promedio){
                alu.add(alumno);
            }
        }
        
        
        return alu;
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", titulo=" + titulo + ", duracion=" + duracion + ", alumnos=" + alumnos + '}';
    }
    
    
}
