/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_19;
import Act_5_18.*;
import java.util.Arrays;
/**
 *
 * @author miquel
 */
public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("413523-M");
        Vehiculo v2 = new Vehiculo("465798-A");
        Vehiculo v3 = new Vehiculo("412356-Y");
        Vehiculo v4 = new Vehiculo("986354-L");
        Camion C1 = new Camion("908765-UL");
        Camion C2 = new Camion("125678-WM");
        Coche c1 = new Coche("098765-M", 5);
        Coche c2 = new Coche("987523-J", 3);
                
        Vehiculo[] aV = {v1, v2, v3, v4, C1, C2, c1, c2};
        ponerRemolque(aV);
    }
    
    public static void ponerRemolque(Vehiculo[] arrayVehiculos) {
        for (int i = 0; i < arrayVehiculos.length; i++) {
            if (arrayVehiculos[i] instanceof Camion) {
                ((Camion)arrayVehiculos[i]).ponRemolque(new Remolque(5000));
            }
            try {
                arrayVehiculos[i].acelerar(120);
            } catch (IllegalArgumentException argInvalid){
                System.err.println("Algun vehículo no puede acelerar a esa velocidad.");
            }
            System.out.println(arrayVehiculos[i].toString());
        }
    }
}
