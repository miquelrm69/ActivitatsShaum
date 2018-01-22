/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_6_12;

/**
 *
 * @author miquel
 */
public class obtenerSuma {
    public static int  obtenerSumaLongCadArray(String[] aCad) {
        int totalCaracteres = 0;
        for (int i = 0; i < aCad.length; i++) {
            char[] chA = aCad[i].toCharArray();
            totalCaracteres += chA.length;
        }
        return totalCaracteres;
    }
    
    public static void main(String[] args) {
        String[] cad = {"Prova", "hola", "quetal"};
        System.out.println(obtenerSumaLongCadArray(cad));
    }
}
