package ej8;

abstract class Personal {

    private String DNI;
    private String nombre;
    private String ape;
    private int anioIngreso;

    public Personal(String DNI, String nombre, String ape, int anioIngreso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.ape = ape;
        this.anioIngreso = anioIngreso;
    }

    @Override
    public String toString() {
        return "Personal{" + "nombre=" + nombre + ", ape=" + ape + ", anioIngreso=" + anioIngreso + '}';
    }    
    
    public abstract double getSalario();
    
    public void mostrarSalario(){
        System.out.println(nombre+" "+ape+" gana "+getSalario());
    }
}
