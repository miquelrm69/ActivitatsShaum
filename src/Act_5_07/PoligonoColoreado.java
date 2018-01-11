/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_07;
import Act_5_04.Punto;
import Act_5_05.Poligono;
import java.awt.Color;

/**
 *
 * @author miquel
 */
public class PoligonoColoreado extends Poligono{
     
    private Color color;
    
    public PoligonoColoreado(Punto[] vertices, Color color) {
        super(vertices);
        this.color = color;
    }
    
    public Color getColor() {
        return color;
    }
    
    public void setColor(Color newColor) {
        color = newColor;
    }
    
    public String toString() {
        return super.toString() + " Color " + this.color;
    }
    
}
