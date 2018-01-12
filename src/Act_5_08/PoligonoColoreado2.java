/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_08;
import Act_5_04.Punto;
import Act_5_07.PoligonoColoreado;
import java.awt.Color;
/**
 *
 * @author miquel
 */
public class PoligonoColoreado2 {
    public static void main(String[] args) {
        Punto[] arrayPuntos = {new Punto(0, 0), new Punto(2, 0), new Punto(2, 2), new Punto(2, 2), new Punto(0, 2)};
        
        PoligonoColoreado poligono = new PoligonoColoreado(arrayPuntos, Color.red);
        System.out.println("Informacion: " + poligono.toString() + " Perímtero: " + poligono.perimetro());
        poligono.trasladar(4, -3);
        poligono.setColor(Color.blue);      
        System.out.println("Informacion: " + poligono.toString());
    }
}
