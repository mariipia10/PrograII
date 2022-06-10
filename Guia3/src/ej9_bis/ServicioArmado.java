package ej9_bis;

public class ServicioArmado extends Servicio {


    private final static int VALOR_HORA = 250;
    public ServicioArmado( TipoVenta tipo, int horas) {
        super(tipo, horas, VALOR_HORA);
    }

    public double getPrecio(){
        return super.getPrecio();
    }
    ServicioArmado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
