/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_4_26;

import java.util.Arrays;

/**
 *
 * @author Miquel
 */
public class Cifrado {

    public static char[] cifradoCesar(String text, int d) {
        final char[] ABECEDARIO_ESP = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String cifrado = "";
        text = text.toLowerCase();
        char[] textoCifrado = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            int pos = 0;
            for (int x = 0; x < ABECEDARIO_ESP.length; x++) {
                if (text.charAt(i) == ABECEDARIO_ESP[x]) {
                    pos = x;
                    break;
                }
            }
            textoCifrado[i] = ABECEDARIO_ESP[pos + d];
        }
        return textoCifrado;
    }
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(cifradoCesar("Hyla", 1)));
    }
}
