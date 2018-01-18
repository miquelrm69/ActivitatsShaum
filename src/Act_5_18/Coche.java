/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_18;

/**
 *
 * @author miquel
 */
public class Coche extends Vehiculo {
    
    private int puertas;
    
    public Coche(String matricula, int numPuertas) {
        super(matricula);
        if (numPuertas >= 3) {
            puertas = numPuertas;
        }
    }
    
    public int getPuertas() {
        return puertas;
    }
    
    public String toString() {
        return super.toString() + "\nPuertas: " + puertas;
    }
}
