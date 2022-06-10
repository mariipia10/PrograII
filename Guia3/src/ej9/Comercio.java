package ej9;

import java.util.ArrayList;

public class Comercio {
    private final static double MONTO_IVA = 21;
    private double IVA;
    private ArrayList<Facturable> facturables;

    public Comercio() {
        this.facturables = new ArrayList<>();
        IVA = MONTO_IVA;
    }
    
}
