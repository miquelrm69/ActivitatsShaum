/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_06;

import Act_5_04.Punto;
import Act_5_05.Poligono;

/**
 *
 * @author miquel
 */
public class Poligono2 {
    public static void main(String[] args) {
        Punto p1 = new Punto(0,0);
        Punto p2 = new Punto(2, 0);
        Punto p3 = new Punto(2, 2);
        Punto p4 = new Punto(0, 2);
        
        Punto[] arrayPuntos = {p1, p2, p3, p4};
        
        Poligono poligono = new Poligono(arrayPuntos);
        
        System.out.println("Perímetro: " + poligono.perimetro() + " Info:\n" + poligono.toString());
        poligono.trasladar(4, -3);
        System.out.println("Perímetro: " + poligono.perimetro() + " Info (Trasladado): \n" + poligono.toString());
        poligono.escalar(3, 0.5);
        System.out.println("Perímetro: " + poligono.perimetro() + " Info: (Escalado): \n" + poligono.toString());
    }
}
