/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_6_13;

import java.util.Arrays;

/**
 *
 * @author miquel
 */
public class obtenerLongCadenas {
    public static int[] obtLongCadenas(String[] aCad) {
        int[] longCad = new int[aCad.length];
        for (int i = 0; i < aCad.length; i++) {
            longCad[i] = aCad[i].length();
        }
        return longCad;
    }
    
    public static void main(String[] args) {
        String[] cad = {"hola", "hey"};
        System.out.println(Arrays.toString(obtLongCadenas(cad)));
    }
}
