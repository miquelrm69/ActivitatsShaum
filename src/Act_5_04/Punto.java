/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_04;

/**
 *
 * @author miquel
 */
public class Punto {
    private double x, y;
    
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setX(double v) {
        x = v;
    }
    
    public void setY(double v) {
        y = v;
    }
    
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
    public double distanciaDe(Punto p2) {
        double distancia = Math.sqrt( Math.pow( (x - p2.getX() ), 2 ) + Math.pow( (y - p2.getY() ), 2 ) );
        return distancia;
    }
}

class MainTest {
    public static void main(String[] args) {
        Punto p1 = new Punto(7, 5);
        Punto p2 = new Punto(4, 1);
        
        System.out.println(p1.distanciaDe(p2));
        System.out.println(p1.toString() + "        " + p2.toString());
    }
}
