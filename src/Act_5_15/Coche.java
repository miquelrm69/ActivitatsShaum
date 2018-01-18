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
public class Coche {
    
    private String matricula;
    private double velocidad;
    private int marcha;
    
    public Coche(String matricula) {
        this.matricula = matricula;
        velocidad = 0;
        marcha = 0;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public double getVelocidad() {
        return velocidad;
    }
    
    public int getMarcha() {
        return marcha;
    }
    
    public void setVelocidad(double v) {
        velocidad = v;
    }
    
    public void setMatricula(String m) {
        matricula = m;
    }
    
    public double acelerar(double velocidad) {
        this.velocidad = velocidad;
        return this.velocidad;
    }
    
    public double frenar (double frenar) {
        this.velocidad -= frenar;
        return velocidad;
    }
    
    public String toString() {
        return "Matricula: " + matricula + "\nVelocidad: " + velocidad + "\nMarcha: " + marcha;
    }
    
    protected int cambiarMarcha(int marcha) {
        if (marcha < 0) {
            return -1;
        }
        this.marcha = marcha;
        return this.marcha;
    } 
}
