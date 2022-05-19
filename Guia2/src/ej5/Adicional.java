package ej5;

public class Adicional {

    private Enum tipo;

    private Fecha fechaPrestacion;

    public Adicional(Enum tipo, int dia,int mes,int anio) {
        this.tipo = tipo;
        this.fechaPrestacion = new Fecha(dia, mes, anio);
    }

    public Enum getTipo() {
        return tipo;
    }
    
    
    @Override
    public String toString() {
        return "Adicional{" + "tipo=" + tipo + ", fechaPrestacion=" + fechaPrestacion + '}';
    }

}
