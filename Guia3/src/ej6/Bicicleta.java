package ej6;

public class Bicicleta {

    private String marca;
    private String modelo;
    private int kms;

    public Bicicleta(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public Bicicleta(String marca, String modelo,int kms) {
        this.marca = marca;
        this.modelo = modelo;
        this.kms = kms;
    }
    public boolean prestarServicio(){
        return kms<2000;
    }
    
    public int kilometraje(){
        return kms;
    }
    
    
    
}
