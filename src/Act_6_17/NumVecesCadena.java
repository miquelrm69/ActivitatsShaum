/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_6_17;

/**
 *
 * @author miquel
 */
public class NumVecesCadena {
    public static int obtenNumVecesCadena(String[] aCad, char c) {
        int numOcurrencias = 0;
        for (int i = 0; i < aCad.length; i++) {
            aCad[i] = aCad[i].toLowerCase();
            char[] arrCh = aCad[i].toCharArray();
            for (int y = 0; y < arrCh.length; y++) {
                if (arrCh[y] == c) {
                    numOcurrencias++;
                }
            }
        }
        return numOcurrencias;
    }
    
    public static void main(String[] args) {
        String[] cad = {"hooola", "coom"};
        System.out.println(obtenNumVecesCadena(cad, 'o'));
    }
}
