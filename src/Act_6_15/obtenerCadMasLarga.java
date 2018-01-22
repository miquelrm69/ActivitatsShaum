/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_6_15;

/**
 *
 * @author miquel
 */
public class obtenerCadMasLarga {
    public static String obtenerCadenaMasLarga(String[] aCad) {
        int posMayor = 0;
        for (int i = 1; i < aCad.length; i++) {
            if (aCad[i].length() > aCad[posMayor].length()) {
                posMayor = i;
            }
        }
        return aCad[posMayor];
    }
    
    public static void main(String[] args) {
        String[] cad = {"pipi", "pompom", "papa", "scoobydoo"};
        System.out.println(obtenerCadenaMasLarga(cad));
    }
}
