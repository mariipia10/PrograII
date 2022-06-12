package eje9;

public class ServicioReparacion extends Servicio {
    private final static int VALOR_HORA = 180;
    private int dificultad;
    
    public ServicioReparacion(TipoVenta tipo, int horas,int dificultad) {
        super(tipo, horas, VALOR_HORA);
        this.dificultad = dificultad;
    }

    public double getPrecio() {
        double valorAumentado = Matematica.sumarPorcentaje(super.getPrecio(), 25);
        return (dificultad>3)?valorAumentado:super.getPrecio();
    }


    @Override
    public double montoFacturado() {
        return Matematica.sumarPorcentaje(getPrecio(), IVA/2);
    }
    public int getDificultad(){
        return dificultad;
    }
    public boolean servicioSimple(){
        return dificultad<2;
    }
}
