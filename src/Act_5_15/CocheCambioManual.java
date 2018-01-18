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
public class CocheCambioManual extends Coche {
    
    public CocheCambioManual(String matricula) {
        super(matricula);
    }
    
    public int cambiaMarcha(int marcha) {
        if (marcha < 0) {
            return -1;
        }
        return super.cambiarMarcha(marcha);
    }
    
    public double acelerar(double v) throws Error {
        if (v > 0 && getMarcha() == 0) {
            throw new Error("No puedes acelerar sin poner una marcha");
        }
        return super.acelerar(v);
    }
}
