package ej3;


public class Evaluacion {

    private int nota;
    private Enum tipo;
    public Evaluacion(int nota,Enum tipo){
        this.nota=nota;
        this.tipo=tipo;
    }

    @Override
    public String toString() {
        return "Evaluacion{" + "nota=" + nota + ", tipo=" + tipo + '}';
    }

    public Enum getTipo() {
        return tipo;
    }

    public int getNota() {
        return nota;
    }
    
    
}
