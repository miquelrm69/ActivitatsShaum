/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_21;
import Act_5_20.*;
/**
 *
 * @author miquel
 */
public class MainColeccion {
    public static void rellena(ColeccionSimple c) {
        for (int i = 1; i < 11; i++) {
            c.anadir(i);
        }
    }
    
    public static void imprimirYVaciar(ColeccionSimple c) {
        while (!c.estaVacia()) {
            System.out.println(c.extraer());
        }
    }
    
    public static void main(String[] args) {
        Pila p1 = new Pila();
        rellena(p1);
        imprimirYVaciar(p1);
        Cola c1 = new Cola();
        rellena(c1);
        imprimirYVaciar(c1);
    }
}
