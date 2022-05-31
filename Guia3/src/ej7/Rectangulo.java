package ej7;


public class Rectangulo extends Figura {

    private int lado1;
    private int lado2;

    public Rectangulo(int lado1, int lado2, String color) {
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

   

    @Override
    public double area() {
        return lado1 * lado2;
    }

    @Override
    public double perimetro() {
        return 2 * lado1 +  2 * lado2;
    }

    @Override
    public String toString() {
        return super.toString()+" Rectangulo{" + "area=" + area() + ", perimetro=" + perimetro()+ '}';
    }
    
    
}
