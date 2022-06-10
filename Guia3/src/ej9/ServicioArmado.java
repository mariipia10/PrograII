package ej9;

public class ServicioArmado extends Servicio {

    private int dificultad;

    public ServicioArmado(int dificultad, double precio, TipoVenta tipo, int horas, int valorHora) {
        super(precio, tipo, horas, valorHora);
        this.dificultad = dificultad;
    }

}
