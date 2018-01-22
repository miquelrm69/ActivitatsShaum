/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_6_08;

/**
 *
 * @author miquel
 */
public class obtenerSumaArray {
    public int sumaArray(int[] aInt) {
        int sumaTotal = 0;
        for (int i = 0; i < aInt.length; i++) {
            sumaTotal += aInt[i];
        }
        return sumaTotal;
    }
}
