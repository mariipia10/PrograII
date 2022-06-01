package ej8;

public class PersonalComision extends Personal {
    private static final double MONTO_MIN = 20000;
    private static final double MONTO_CLIENTE_CAPT = 300;
    private double salMinimo = MONTO_MIN;
    private int clientesCaptados;

    public PersonalComision(int clientesCaptados, String DNI, String nombre, String ape, int anioIngreso) {
        super(DNI, nombre, ape, anioIngreso);
        this.clientesCaptados = clientesCaptados;
    }
    
    public double getSalario(){
        double salarioComi = clientesCaptados*MONTO_CLIENTE_CAPT;
        return (salarioComi>salMinimo)?salarioComi:salMinimo; //SalarioComisiones es mayor que salario minimo? T:Comisiones,F:salMinimo
    }
    
    public int getCantClientes(){
        return this.clientesCaptados;
    }
    
    
    
}
