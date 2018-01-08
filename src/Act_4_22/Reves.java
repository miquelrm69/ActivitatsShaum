/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_4_22;

/**
 *
 * @author Miquel
 */
public class Reves {
    public static void alReves(String text) {
        char[] cText = text.toCharArray();
        for (int i = cText.length - 1; i >= 0; i--) {
            System.out.print(cText[i]);
        }
    }
    
    public static void main(String[] args) {
        alReves("Hola");
    }
}
