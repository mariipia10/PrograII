package ej7;


public abstract class Figura {
    String color;
    public abstract double area();
    public abstract double perimetro();

    public Figura(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figura{" + "color=" + color + '}';
    }
    
    
}
