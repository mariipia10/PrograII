package ej12;
import java.lang.Math;

public class ImpresoraMonocromatica {
    private final static int MAX_NIVEL = 100; 
    private final static int MAX_HOJAS = 35; 
    private boolean estaEncendida;
    private int cantHojas;
    private int nivelTinta;
    
    public ImpresoraMonocromatica() {
        this.nivelTinta = MAX_NIVEL;
    }
    
    public void encender(){
        this.estaEncendida = !estaEncendida; //Si esta off va a estar on (0->1)
    }                                       //Si esta on va a estar off (1->0)
    
    public int nivelSegunCantCaracteres(int cant) {
        int nivel;
        if(cant>= 0 && cant<=50){
            nivel = 1;
        }else{
            nivel = Math.ceilDiv(cant, 50); // Redondea hacia arriba una division entre integers
        }
        return nivel;
    }
    public int hojasSegunCantCaracteres(int cant) {
        int hojas;
        if(cant>= 0 && cant<=20){
            hojas = 1;
        }else{
            hojas = Math.ceilDiv(cant, 20); // Redondea hacia arriba una division entre integers
        }
        return hojas;
    }

    public void recargarBandeja(int hojas) {
        if(hojas>0 && (cantHojas+hojas)<=MAX_HOJAS && cantHojas!=MAX_HOJAS){
            cantHojas+=hojas; // hojas (0;35]
        }
    }

    public boolean nivelTintaOK(int i){
        return nivelTinta>=i;
    
    }
    public boolean cantHojasOK(int t){
        return cantHojas>=t;
    
    }
    public void imprimir(Documento docu) {
        int ch = docu.getCharsCuerpo();
        int nivelNecesario = nivelSegunCantCaracteres(ch);
        int hojasNecesarias = hojasSegunCantCaracteres(ch);
        String mensaje="";
        
        if(estaEncendida){
            if(nivelTintaOK(nivelNecesario)){
                if(cantHojasOK(hojasNecesarias)){
                    this.cantHojas-=hojasNecesarias;
                    this.nivelTinta-=nivelNecesario;
                    System.out.println("***IMPRIMIENDO***");
                    System.out.println(docu.getFecha()+"          **"+docu.getTitulo()+"**");
                    System.out.println(docu.getCuerpo());
                }else{
                    mensaje="No hay suficientes hojas";
                }
            }else{
                mensaje="No alcanza la tinta";
            }
        }else{
            mensaje="Impresora apagada";
        }
        System.out.println(mensaje);
    }

    @Override
    public String toString() {
        return "ImpresoraMonocromatica{" + "estaEncendida=" + estaEncendida + ", cantHojas=" + cantHojas + ", nivelTinta=" + nivelTinta + '}';
    }
    
    
}
