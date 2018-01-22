/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_6_03;

/**
 *
 * @author miquel
 */
public class mostrarArrayPantalla2 {
    public static void mostrarArray(int[] aInt) {
        String array = "";
        for (int i = 0; i < aInt.length - 1; i++) {
            array += aInt[i] + ", ";
        }
        System.out.println(array + aInt[aInt.length - 1]);
    }
}
