package ej8;
import java.time.Year;

public class PersonalSalFijo extends Personal {
    private static final double MONTO_BASICO = 90000;
    private double sueldoBasico=MONTO_BASICO;
    private double extraAntiguedad;
    private int aniosAntiguedad;
    
    public PersonalSalFijo( String DNI, String nombre, String ape, int anioIngreso) {
        super(DNI, nombre, ape, anioIngreso);
        aniosAntiguedad=Year.now().getValue()-anioIngreso; //devuelve anio actual como int
        calcularExtra(); //va a calcular el extra cuando se cree la persona
    }

    private void calcularExtra(){
        if(aniosAntiguedad>=2 && aniosAntiguedad <=5){
            extraAntiguedad=sueldoBasico*0.05;
        }else if (aniosAntiguedad>=6 && aniosAntiguedad<=10){
            extraAntiguedad=sueldoBasico*0.1;
        }else if (aniosAntiguedad>=10){
            extraAntiguedad=sueldoBasico*0.15;
        }
    
    }
    public double getSalario(){
        return sueldoBasico+extraAntiguedad;
    }
}
