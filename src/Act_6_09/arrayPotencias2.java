/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_6_09;

import java.util.Arrays;

/**
 *
 * @author miquel
 */
public class arrayPotencias2 {
    public static int[] arrayPotencias(int totalPot) {
        int[] aPotencias = new int[totalPot + 1];
        aPotencias[0] = 2;
        for (int i = 1; i < aPotencias.length; i++) {
            aPotencias[i] = 2;
            for (int p = 0; p < i; p++) {
                aPotencias[i] *= aPotencias[0];
            }
        }
        return aPotencias;
    }
    
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(arrayPotencias(10)));
    }
}
