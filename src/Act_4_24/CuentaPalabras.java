/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_4_24;

/**
 *
 * @author Miquel
 */
public class CuentaPalabras {

    public static int cuantasPalabras(String text) {
        int numWords = 1;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isWhitespace(text.charAt(i))) {
                numWords++;
            }
        }
        return numWords;
    }

    public static void main(String[] args) {
        System.out.println(cuantasPalabras("Hola que"));
    }
}
