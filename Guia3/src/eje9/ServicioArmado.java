package eje9;

public class ServicioArmado extends Servicio {

    private final static int VALOR_HORA = 250;
    public ServicioArmado(TipoVenta tipo, int horas) {
        super(tipo, horas, VALOR_HORA);
    }

    public double getPrecio() {
        return super.getPrecio();
    }


    @Override
    public double montoFacturado() {
        return Matematica.sumarPorcentaje(getPrecio(), IVA/2);
    }
}
