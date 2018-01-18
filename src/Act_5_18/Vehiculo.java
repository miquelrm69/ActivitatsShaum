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
public class Vehiculo {
    private String matricula;
    private double velocidad;
    
    public Vehiculo(String matricula) {
        this.matricula = matricula;
        velocidad = 0;
    }
    
    public void acelerar(double vel) throws IllegalArgumentException{
        if (vel < 0) {
            throw new IllegalArgumentException("No se pude acelerar a velocidades inferiores a 0.");
        }
        velocidad = vel;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public double getVelocidad() {
        return velocidad;
    }
    
    public void setVelociad(double vel) {
        velocidad = vel;
    }
    
    public String toString() {
        return "Matrícula: " + matricula + "\nVelocidad: " + velocidad;
    }
}
