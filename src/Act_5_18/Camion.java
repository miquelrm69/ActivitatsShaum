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
public class Camion extends Vehiculo {
    
    private Remolque remolque = null;
    
    public Camion(String matricula) {
        super(matricula);
    }
    
    public void acelerar(double vel) throws IllegalArgumentException{
        if (remolque != null && (vel + getVelocidad()) > 100) {
            throw new IllegalArgumentException("Demasiada velocidad.");
        }
        setVelociad(vel);
    }
    
    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }
    
    public void quitaRemolque() {
        remolque = null;
    }
    
    public String toString() {
        return super.toString() + "\nTipo remolque: " + remolque;
    }
}
