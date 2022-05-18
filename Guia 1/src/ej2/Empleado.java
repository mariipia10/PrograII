
package ej2;

/**
 *
 * @author Alumno
 */
public class Empleado {
    private int DNI;
    private String nombre;
    private String apellido;
    private double salarioBase;
    private String estadoCivil;
    private int cantHijos;

   public Empleado(int DNI, String nombre, String apellido, double salarioBase, String estadoCivil, int cantHijos) {
        setDNI(DNI);
        setNombre(nombre);
        setApellido(apellido);
        this.salarioBase = salarioBase;
        this.estadoCivil = estadoCivil;
        setCantHijos(cantHijos);
    }


    private void setDNI(int DNI) {
        if(DNI>6){
            this.DNI = DNI;
        }
    }

    private void setNombre(String nombre) {
        if(nombre != null && nombre.length() >= 3) {
           this.nombre = nombre; 
        }
    }

    private void setApellido(String apellido) {
        if(apellido != null && apellido.length() >= 3) {
           this.apellido = apellido; 
        }
    }

    private void setCantHijos(int cantHijos) {
        if(cantHijos>-1){
            this.cantHijos = cantHijos;
        }
    }
    
    //Se sabe que todos los empleados cobran el salario base más un plus del 3% de éste por cada hijo,
    //con un tope de hasta 10%.Del salario resultante debe descontarse un 4% en caso de que 
    //el estado civil sea soltero.
    public double obtenerSalarioFinal(){
    double salarioAux = this.salarioBase;
    if(this.cantHijos>0){
        switch(this.cantHijos){
        case 1:
        case 2: 
        case 3:
            salarioAux+=this.salarioBase*(0.03*(double)this.cantHijos);
           break;
        default:
            salarioAux+=this.salarioBase*(0.10);
            break;  
        }
    }
    if(this.estadoCivil =="soltero"){
        salarioAux = (float) (salarioAux*0.96);     
    }
    
     return salarioAux;

    }

    @Override
    public String toString() {
        return "Empleado{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", salarioBase=" + salarioBase + ", estadoCivil=" + estadoCivil + ", cantHijos=" + cantHijos + '}';
    }
    
    
}
