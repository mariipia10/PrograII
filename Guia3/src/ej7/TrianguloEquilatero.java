package ej7;


public class TrianguloEquilatero extends Figura {

    private int base;
    private int altura;

    public TrianguloEquilatero(int base, int altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
       return 3 * base;
    }

    @Override
    public String toString() {
        return super.toString()+" TrianguloEquilatero{" + "area=" + area() + ", perimetro=" + perimetro() + '}';
    }
    
    
}
