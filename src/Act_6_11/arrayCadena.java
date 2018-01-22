/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_6_11;

/**
 *
 * @author miquel
 */
public class arrayCadena {
    public static String arrayCadenas(String[] aCadena) {
        String cadena = "";
        for (int i = 0; i < aCadena.length; i++) {
            cadena += aCadena[i] + " ";
        }
        return cadena;
    }
}
