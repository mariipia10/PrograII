package ej6;

public class BicicletaElectrica extends Bicicleta {

    private int watts;

    public BicicletaElectrica(String marca, String modelo) {
        super(marca, modelo);
    }
    
    public BicicletaElectrica(String marca, String modelo,int kms,int watts) {
        super(marca, modelo,kms);
        this.watts = watts;
    }
    @Override
    public boolean prestarServicio(){
        return super.prestarServicio() && watts<=250;
    }
}
