package ej9_bis;

public class ServicioReparacion extends Servicio {
    private final static int VALOR_HORA = 180;
    private int dificultad;
    public ServicioReparacion(int dificultad, TipoVenta tipo, int horas) {
        super(tipo, horas, VALOR_HORA);
        this.dificultad=dificultad;
    }
    
    public double getPrecio(){
        double pAumentado = Matematica.sumarPorcentaje(super.getPrecio(), 25); // precio con 25% de aumento
        return (dificultad>3)?pAumentado:super.getPrecio();
    }
    
    //HACER UN GET PRECIO DE SERVICIO; SERVICIO REPAR;SERVICIOARM
}
