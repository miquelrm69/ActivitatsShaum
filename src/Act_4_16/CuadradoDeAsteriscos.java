/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_4_16;

/**
 *
 * @author miquel
 */
public class CuadradoDeAsteriscos {

    public static void dibujaCuadro(int altitud, int amplitud) {
        for (int y = 0; y < altitud; y++) {
            System.out.print(" * ");
            for (int x = 0; x < amplitud - 1; x++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        dibujaCuadro(8, 8);
    }
}
