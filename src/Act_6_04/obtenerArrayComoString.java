/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_6_04;

/**
 *
 * @author miquel
 */
public class obtenerArrayComoString {
    public String arrayComoString(int[] aInt) {
        String arrayString = "";
        for (int i = 0; i < aInt.length; i++) {
            arrayString += aInt[i] + " ";
        }
        return arrayString;
    }
}
