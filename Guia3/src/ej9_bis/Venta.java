package ej9_bis;

public abstract class Venta {
    private final static double IVA_MONTO = 21;
    private double IVA;
    public Venta(){
        this.IVA = IVA_MONTO;
    }
    //public double montoTotalFacturado();
     public double getIVA(){
        return IVA;
    }
}
