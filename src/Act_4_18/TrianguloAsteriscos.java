/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_4_18;

/**
 *
 * @author Miquel
 */
public class TrianguloAsteriscos {

    public static void dibujaTriangulo(int lado) {
        int sequence = lado - 1;
        if (lado <= 15) {
            for (int x = 0; x < lado; x++) {
                for (int i = sequence; i >= 0; i--) {
                    System.out.print("*");
                }
                sequence--;
                System.out.println("");
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        TrianguloAsteriscos.dibujaTriangulo(14);
    }
}
