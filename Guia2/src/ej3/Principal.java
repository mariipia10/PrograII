/*
 * 
 * 
 */
package ej3;

/**
 *
 * @author piahe
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso c = new Curso("abc123", "Progra 2",10);
        c.agregarAlum("Pepon pepi", "102030",Tipo.FINAL, 10);
        c.agregarAlum("Pepon pepu", "306040",Tipo.PRIMERO,7);
        c.agregarNota(Tipo.FINAL, 7, "306040");
        c.agregarNota(Tipo.SEGUNDO, 7, "306040");
        Alumno a = c.buscarAlum("102030");
        int s = a.calcularPromedio();
        
        System.out.println(c);
        System.out.println(s);
        System.out.println(c.buscarAlumnosPorEncimaDe(6));
    }
    
}
