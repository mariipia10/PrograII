package ej7;

public class Circunferencia extends Figura {

    private int radio;
    private int diametro;
    private double pi = 3.1416;
    public Circunferencia(int radio, String color) {
        super(color);
        this.radio = radio;
        this.diametro = radio*2;
    }

    @Override
    public double area() {
        return pi * (radio * radio);
    }

    @Override
    public double perimetro() {
        return pi * diametro;
    }

    @Override
    public String toString() {
        return super.toString()+" Circunferencia{" + "area=" + area() + ", perimetro=" + perimetro() + '}';
    }
    
}
