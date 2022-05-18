
package ej9;

import java.time.LocalDate;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Fecha fechaNac;
    private Domicilio domicilio;
    
    // Esto es un constructor
    public Persona(String nombre, String apellido, Fecha fecha,Domicilio domi) {
        setNombre(nombre);
        setApellido(apellido);
        this.fechaNac = fecha;
        this.domicilio = domi;
    }
        
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }
    
    public void mostrarEstado () {
        System.out.println( toString() );
    }
    
    public int getEdad() {
        // Hubo que importar la clase 'LocalDate'
        return LocalDate.now().getYear() - fechaNac.getAnio(); //LocalDate.now().getYear()-> retorna el anio actual
    }  
    
    public boolean esMayorQue(int unaEdad) {
        return getEdad() >= unaEdad;
    }
    
    public void cambiarNombreYApellido(String nuevoNombre, String nuevoApellido) {
        setNombre(nuevoNombre);
        setApellido(nuevoApellido);        
    }

    private void setNombre(String nombre) {
        if(nombre != null && nombre.length() >= 3) {
           this.nombre = nombre; 
        }
    }  

    private void setApellido(String apellido) {
        if(apellido != null && apellido.length() >= 2) {
           this.apellido = apellido; 
        }
    }    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + ", domicilio=" + domicilio + '}';
    }

    

    
    
    
    
}