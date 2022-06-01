/*
 * 
 * 
 */
package ej8;

/**
 *
 * @author piahe
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa empre = new Empresa();
        Personal p1 = new PersonalComision(5, "4210114", "Pepe", "Gomez",2020);
        Personal p2 = new PersonalComision(3,"39171562","Maria","Luisa",2015);
        Personal p5 = new PersonalComision(40,"39171563","Pancho","Kethcup",2015);
        Personal p6 = new PersonalComision(30,"39171561","Ging","Seng",2016);
        Personal p3 = new PersonalSalFijo("10267896","Daniel","Danielito",2019);
        Personal p4 = new PersonalSalFijo("37500600","Gabriela","Gabrielita",2005);
        empre.agregarPersonal(p1);
        empre.agregarPersonal(p2);
        empre.agregarPersonal(p3);
        empre.agregarPersonal(p4);
        empre.agregarPersonal(p5);
        empre.agregarPersonal(p6);
        
        empre.mostrarSalarios();
//        Pepe Gomez gana 33000.0
//        Maria Luisa gana 20000.0
//        Daniel Danielito gana 94500.0
//        Gabriela Gabrielita gana 103500.0
        System.out.println(empre.mejorVendedor());
    }
    
}
