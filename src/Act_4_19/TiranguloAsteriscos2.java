/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_4_19;

/**
 *
 * @author Miquel
 */
public class TiranguloAsteriscos2 {

    public static void dibujaTriangulo(int lado) {
        int linea = 0;
        if (lado >= 3 && lado <= 15) {
            while (linea < lado) {
                for (int w = 0; w < lado - linea - 1; w++) {
                    System.out.print(" ");
                }
                for (int a = 0; a < linea + 1; a++) {
                    System.out.print("*");
                }
                linea++;
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        dibujaTriangulo(4);
    }
}
