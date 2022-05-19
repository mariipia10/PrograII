/*
 * 
 * 
 */
package ej5;

/**
 *
 * @author piahe
 */
public class Principal {

    public static void main(String[] args) {
        Hotel hotelazo = new Hotel("Alvear Art", "Av Alvear 123");
        hotelazo.agregarHabitacion("10", 25000);
        hotelazo.agregarHabitacion("11", 30000);
        hotelazo.agregarHabitacion("12", 35000);
        hotelazo.ocuparHabitacion("11", 10, "Raton Perez");
        hotelazo.agregarAdicional("11", Tipo.DESAYUNO, 10, 2, 2022);
        System.out.println(hotelazo);
    }
    
}
