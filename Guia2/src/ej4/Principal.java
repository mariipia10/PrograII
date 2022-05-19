/*
 * 
 * 
 */
package ej4;

/**
 *
 * @author piahe
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Marca m = new Marca();
        m.agregarConsecionaria("La mejor Consecionaria");
        m.agregarConsecionaria("Otra consecionaria");
        m.agregarConsecionaria("Otra consecionaria MAS");
        m.agregarAuto("Otra consecionaria", "AA1122J9", 10000, Tipo.CAMIONETA);
        m.agregarAuto("La mejor Consecionaria", "QBC123", 10000, Tipo.AUTO);
        m.agregarAuto("La mejor Consecionaria", "QBC124", 10000, Tipo.UTILITARIO);
        m.agregarAuto("La mejor Consecionaria", "QBC126", 10000, Tipo.AUTO);
        m.agregarAuto("Otra consecionaria MAS", "QBC321", 20000, Tipo.AUTO);
        m.agregarAuto("Otra consecionaria MAS", "QBC678", 30000, Tipo.UTILITARIO);
        m.agregarAuto("Otra consecionaria MAS", "QBC009", 40000, Tipo.CAMIONETA);
        m.mostrarVehiculo("La mejor Consecionaria", Tipo.AUTO);
        //m.mostrarVehiculo();
        //System.out.println(m.obtenerConcesionariaMaxVeh());
        m.borrarVehiculo("QBC123");
        //m.mostrarVehiculo("La mejor Consecionaria", Tipo.AUTO);
        m.mostrarVehiculo("La mejor Consecionaria", Tipo.CAMIONETA);
        m.cambiarVehiculoDeConcesionaria("QBC678", "La mejor Consecionaria");
        m.mostrarVehiculo("La mejor Consecionaria", Tipo.CAMIONETA);
        
    }
    
}
