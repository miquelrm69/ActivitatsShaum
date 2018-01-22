/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_6_16;

import java.util.Arrays;

/**
 *
 * @author miquel
 */
public class ObtCadena5Vocales {

    public static String obtCadenaVocales(String[] aCad) {
        int a, e, i, o, u;
        String[] arrConTodasVocales = new String[aCad.length];
        for (int x = 0; x < aCad.length; x++) {
            a = 0;
            e = 0;
            i = 0;
            o = 0;
            u = 0;
            aCad[x] = aCad[x].toLowerCase();
            char[] aChar = aCad[x].toCharArray();
            for (int c = 0; c < aChar.length; c++) {
                switch (aChar[c]) {
                    case 'a':
                        a++;
                        break;
                    case 'e':
                        e++;
                        break;
                    case 'i':
                        i++;
                        break;
                    case 'o':
                        o++;
                        break;
                    case 'u':
                        u++;
                        break;
                    default:
                        break;
                }
            }
            if (a > 0 && e > 0 && i > 0 && o > 0 && u > 0) {
                return aCad[x];
            }
        }
        return "No hay ninguna cadena con todas las vocales";
    }

    public static void main(String[] args) {
        String[] cad = {"holl", "papepipopu"};
        System.out.println(obtCadenaVocales(cad));
    }
}
