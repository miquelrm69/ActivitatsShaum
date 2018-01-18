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
public class Remolque {

    private int peso;

    public Remolque(int peso) {
        this.peso = peso;
    }
    
    public int getPeso() {
        return peso;
    }
    
    public String toString() {
        return "Peso: " + peso;
    }
}
