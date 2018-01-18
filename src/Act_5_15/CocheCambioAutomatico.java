/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_15;

/**
 *
 * @author miquel
 */
public class CocheCambioAutomatico extends Coche {
    
    public CocheCambioAutomatico(String matricula) {
        super(matricula);
    }
    
    public double acelerar(double v) throws IllegalArgumentException {
        if (v >= 20 && v < 50) {
            super.cambiarMarcha(1);
        } else if (v >= 50 && v < 90) {
            super.cambiarMarcha(2);
        } else if (v >= 90 && v < 110) {
            super.cambiarMarcha(3);
        } else if (v >= 110) {
            super.cambiarMarcha(4);
        } else {
            throw new IllegalArgumentException("Velocidad errònea!");
        }
        super.setVelocidad(v);
        return super.getVelocidad();
    }
    
    public double frenar(double v) throws IllegalArgumentException {
        if (v >= 20) {
            super.cambiarMarcha(-1);
        } else if (v >= 50) {
            super.cambiarMarcha(-1);
        } else if (v >= 90) {
            super.cambiarMarcha(-1);
        } else {
            throw new IllegalArgumentException("Velocidad errònea!");
        }
        super.setVelocidad(v);
        return super.getVelocidad();
    }
}
